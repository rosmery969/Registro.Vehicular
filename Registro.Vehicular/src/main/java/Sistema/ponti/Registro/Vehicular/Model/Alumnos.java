package Sistema.ponti.Registro.Vehicular.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Alumnos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idAlumno")
    private Integer id;
    private String dni;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String correo;
    private String Telefono;
    private String direccion;

}
