package proyecto.ponti.mi.sisvehicular.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idpersona")
    private Integer id;

    private String dni;

    private String nombre;

    private String apaterno;

    private String amaterno;

    private String genero;

    private Date fnacimiento;

    private String direccion;

    private String telefono;

    private String correo;

    @ManyToOne
    @JoinColumn(name = "idtipopersona")
    private Tipopersona idtipopersona;

}
