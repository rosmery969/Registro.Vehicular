package Sistema.ponti.Registro.Vehicular.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.Date;


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

    private Date fecha;

    private Time hingreso;

    private Time hsalida ;
    private Time ttotal;
}
