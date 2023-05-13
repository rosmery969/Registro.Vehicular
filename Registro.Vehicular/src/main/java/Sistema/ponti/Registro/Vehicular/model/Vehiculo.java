package proyecto.ponti.mi.sisvehicular.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idvehiculo")
    private Integer id;

    private String placa;

    private String marca;

    private String color;

    private String tipocombustible;

    @ManyToOne
    @JoinColumn(name = "idtipovehiculo")
    private Tipovehiculo idtipovehiculo;

    @ManyToOne
    @JoinColumn(name = "idperosna")
    private Persona idpersona;

}
