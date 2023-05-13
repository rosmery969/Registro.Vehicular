package proyecto.ponti.mi.sisvehicular.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idregistro")
    private Integer id;

    private LocalDateTime hingreso;

    private LocalDateTime hsalida;

    @ManyToOne
    @JoinColumn(name = "idvehiculo")
    private Vehiculo idvehiculo;


}
