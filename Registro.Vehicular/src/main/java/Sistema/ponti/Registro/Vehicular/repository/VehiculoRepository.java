package proyecto.ponti.mi.sisvehicular.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ponti.mi.sisvehicular.api.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {
}
