package proyecto.ponti.mi.sisvehicular.api.controller;

import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import proyecto.ponti.mi.sisvehicular.api.controller.dto.TipovehiculoDTO;
import proyecto.ponti.mi.sisvehicular.api.model.Tipovehiculo;
import proyecto.ponti.mi.sisvehicular.api.repository.TipovehiculoRepository;

@RestController
@RequestMapping("/api/admin/tipovehiculo")

public class TipoVehiculoController {

    private final TipovehiculoRepository tipovehiculoRepository;

    public TipoVehiculoController(TipovehiculoRepository tipovehiculoRepository){ this.tipovehiculoRepository = tipovehiculoRepository;}


    @GetMapping("")
    Page<Tipovehiculo> index(@PageableDefault(sort = "descripcion", size = 20) Pageable pageable){
        return tipovehiculoRepository.findAll(pageable);
    }

    @GetMapping("/{id}")
    Tipovehiculo obtener(@PathVariable Integer id){
        return tipovehiculoRepository
                .findOneById(id)
                .orElseThrow(EntityNotFoundException::new);

    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    Tipovehiculo crear(@RequestBody @Validated TipovehiculoDTO tipovehiculoDTO){
        Tipovehiculo tipovehiculo=new ModelMapper().map(tipovehiculoDTO,Tipovehiculo.class);
        return tipovehiculoRepository.save(tipovehiculo);
    }

    @PutMapping("/{id}")
    Tipovehiculo actualizar(@PathVariable Integer id, @RequestBody TipovehiculoDTO tipovehiculoDTO){
        Tipovehiculo tipovehiculo=tipovehiculoRepository
                .findOneById(id)
                .orElseThrow(EntityNotFoundException::new);
        new ModelMapper().map(tipovehiculoDTO, tipovehiculo);
        return tipovehiculoRepository.save(tipovehiculo);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void eliminar(@PathVariable Integer id){
        Tipovehiculo tipovehiculo=tipovehiculoRepository
                .findOneById(id)
                .orElseThrow(EntityNotFoundException::new);
        tipovehiculoRepository.delete(tipovehiculo);
    }

}
