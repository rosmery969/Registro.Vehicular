package proyecto.ponti.mi.sisvehicular.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ponti.mi.sisvehicular.api.model.Tipopersona;

import java.util.Optional;

public interface TipopersonaRepository extends JpaRepository<Tipopersona, Integer> {

    Optional<Tipopersona> findOneById(Integer id);
    Optional<Tipopersona> findOneByIdAndDescripcion(Integer id,String descripcion);
}
