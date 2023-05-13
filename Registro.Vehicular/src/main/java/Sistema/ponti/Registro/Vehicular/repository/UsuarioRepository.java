package proyecto.ponti.mi.sisvehicular.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ponti.mi.sisvehicular.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
