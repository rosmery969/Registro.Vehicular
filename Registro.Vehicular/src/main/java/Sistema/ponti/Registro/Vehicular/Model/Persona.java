package Sistema.ponti.Registro.Vehicular.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPersona")
    private Integer id;
    private String dni;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String genero;
    private Date fnacimiento;

    private String direccion;

    @ManyToOne
    @JoinColumn(name = "idTipodePersona")
    private Vehiculo idTipodePersona;

}
