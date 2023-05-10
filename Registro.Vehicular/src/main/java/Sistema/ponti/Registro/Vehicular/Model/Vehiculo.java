package Sistema.ponti.Registro.Vehicular.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idVehiculo")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Persona idpersona;

    @ManyToOne
    @JoinColumn(name = "idTipodePersona")
    private TipodePersona idTipodePersona;

    @ManyToOne
    @JoinColumn(name = "idTipoVehiculo")
    private TipoVehiculo idTipoVehiculo;

    private String placa;

    private String color;
    private String marca;

    private String tipoCombustible;


}
