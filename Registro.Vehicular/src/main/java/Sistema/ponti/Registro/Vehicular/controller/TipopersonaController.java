package proyecto.ponti.mi.sisvehicular.api.controller;

import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import proyecto.ponti.mi.sisvehicular.api.controller.dto.TipopersonaDTO;
import proyecto.ponti.mi.sisvehicular.api.model.Tipopersona;
import proyecto.ponti.mi.sisvehicular.api.repository.TipopersonaRepository;

@RestController
@RequestMapping("/api/admin/tipopersona")

public class TipopersonaController {

    private final TipopersonaRepository tipopersonaRepository;

    public TipopersonaController(TipopersonaRepository tipopersonaRepository){ this.tipopersonaRepository = tipopersonaRepository;}

    @GetMapping("")
    Page<Tipopersona> index(@PageableDefault(sort = "descripcion", size=20)Pageable pageable){
        return tipopersonaRepository.findAll(pageable);
    }

    @GetMapping("/{id}")
    Tipopersona obtener(@PathVariable Integer id){
        return tipopersonaRepository
                .findOneById(id)
                .orElseThrow(EntityNotFoundException::new);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    Tipopersona crear(@RequestBody @Validated TipopersonaDTO tipopersonaDTO){
        Tipopersona tipopersona=new ModelMapper().map(tipopersonaDTO,Tipopersona.class);
        return tipopersonaRepository.save(tipopersona);
    }

    @PutMapping("/{id}")
    Tipopersona actualizar(@PathVariable Integer id, @RequestBody TipopersonaDTO tipopersonaDTO){
        Tipopersona tipopersona=tipopersonaRepository
                .findOneById(id)
                .orElseThrow(EntityNotFoundException::new);
        new ModelMapper().map(tipopersonaDTO, tipopersona);
        return tipopersonaRepository.save(tipopersona);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void eliminar(@PathVariable Integer id){
        Tipopersona tipopersona=tipopersonaRepository
                .findOneById(id)
                .orElseThrow(EntityNotFoundException::new);
        tipopersonaRepository.delete(tipopersona);
    }


}
