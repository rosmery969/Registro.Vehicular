package proyecto.ponti.mi.sisvehicular.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ponti.mi.sisvehicular.api.model.Tipovehiculo;

import java.util.Optional;


public interface TipovehiculoRepository extends JpaRepository<Tipovehiculo, Integer> {

    Optional<Tipovehiculo> findOneById(Integer id);
    Optional<Tipovehiculo> findOneByIdAndDescripcion(Integer id,String descripcion);


}
