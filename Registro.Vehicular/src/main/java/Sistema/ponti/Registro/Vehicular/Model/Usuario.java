package Sistema.ponti.Registro.Vehicular.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUsuario")
    private Integer id;
    private String nombre;
    private String numdoc;
    private String telefono;
    private String correo;

    private String user;
    private String pass;


}
