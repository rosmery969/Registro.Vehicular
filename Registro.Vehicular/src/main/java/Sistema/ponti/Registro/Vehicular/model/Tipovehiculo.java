package proyecto.ponti.mi.sisvehicular.api.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Tipovehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "idtipovehiculo")
    private Integer id;

    private String descripcion;
}
