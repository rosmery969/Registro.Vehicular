package proyecto.ponti.mi.sisvehicular.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Tipopersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipopersona")
    private Integer id;

    private String descripcion;

}
