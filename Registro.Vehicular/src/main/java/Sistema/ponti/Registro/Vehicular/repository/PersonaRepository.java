package proyecto.ponti.mi.sisvehicular.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ponti.mi.sisvehicular.api.model.Persona;

import java.util.Optional;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {

    Optional<Persona> findOneById(Integer id);

    Optional<Persona> findOneByIdAndDni(Integer id, String dni);

}
