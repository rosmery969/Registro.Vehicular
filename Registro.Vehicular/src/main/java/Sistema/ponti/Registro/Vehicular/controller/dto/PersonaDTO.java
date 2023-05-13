package proyecto.ponti.mi.sisvehicular.api.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Data
public class PersonaDTO {

    @NotBlank
    @Size(min = 8, max = 15)
    private String dni;

    private String nombre;

    private String apaterno;

    private String amaterno;

    private String genero;

    private Date fnacimiento;

    private String direccion;

    private  String telefono;

    private String correo;

    private Integer idtipopersona;
}
