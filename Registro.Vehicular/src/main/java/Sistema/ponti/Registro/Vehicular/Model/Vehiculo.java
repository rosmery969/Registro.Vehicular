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
    @JoinColumn(name = "idAlumno")
    private Alumnos idAlumno;

    @ManyToOne
    @JoinColumn(name = "idDocente")
    private Docente idDocente;

    @ManyToOne
    @JoinColumn(name = "idAdministrativo")
    private Administrativo idAdministrativo;

    private String tipo;

    private String marca;

    private String color;

    private String placa;


}
