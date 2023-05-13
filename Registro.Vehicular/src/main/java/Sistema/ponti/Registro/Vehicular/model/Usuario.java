package proyecto.ponti.mi.sisvehicular.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private Integer id;

    private String nombre;

    private String apaterno;

    private String amaterno;

    private String dni;

    private String correo;

    private String usuario;

    private String pass;


}
