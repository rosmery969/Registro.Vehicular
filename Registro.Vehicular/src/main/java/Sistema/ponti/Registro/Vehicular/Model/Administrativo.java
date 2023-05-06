package Sistema.ponti.Registro.Vehicular.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Administrativo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idAdministrativo")
    private Integer id;
    private String dni;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String correo;
    private String Telefono;
    private String direccion;
}
