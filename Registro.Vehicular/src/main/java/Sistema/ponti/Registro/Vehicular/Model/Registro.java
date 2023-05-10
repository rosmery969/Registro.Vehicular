package Sistema.ponti.Registro.Vehicular.Model;

import jakarta.persistence.*;
import lombok.Data;



import java.time.LocalDateTime;


@Data
@Entity
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idRegistro")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idVehiculo")
    private Vehiculo idVehiculo;


    private LocalDateTime hingreso;

    private LocalDateTime hsalida ;

}
