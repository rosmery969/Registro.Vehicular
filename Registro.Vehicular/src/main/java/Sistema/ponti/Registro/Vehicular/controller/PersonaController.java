package proyecto.ponti.mi.sisvehicular.api.controller;


import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import proyecto.ponti.mi.sisvehicular.api.controller.dto.PersonaDTO;
import proyecto.ponti.mi.sisvehicular.api.model.Persona;
import proyecto.ponti.mi.sisvehicular.api.repository.PersonaRepository;

@RestController
@RequestMapping("/api/admin/persona")

public class PersonaController {
    private final PersonaRepository personaRepository;

    public PersonaController(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }

    @GetMapping("")
    Page<Persona> index(@PageableDefault(sort = "dni", size = 8)Pageable pageable){
        return personaRepository.findAll(pageable);
    }

    @GetMapping("/{id}")
    Persona obtener(@PathVariable Integer id ){
        return personaRepository
                .findOneById(id)
                .orElseThrow(EntityNotFoundException::new);

    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    Persona crear(@RequestBody @Validated PersonaDTO personaDTO){
        Persona persona=new ModelMapper().map(personaDTO, Persona.class);
        return personaRepository.save(persona);
    }

    @PutMapping("/{id}")
    Persona actualizar(@PathVariable Integer id, @RequestBody PersonaDTO personaDTO){
        Persona persona=personaRepository
                .findOneById(id)
                .orElseThrow(EntityNotFoundException::new);
        new ModelMapper().map(personaDTO, persona);
        return personaRepository.save(persona);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void eliminar(@PathVariable Integer id){
        Persona persona=personaRepository
                .findOneById(id)
                .orElseThrow(EntityNotFoundException::new);
        personaRepository.delete(persona);
    }
}
