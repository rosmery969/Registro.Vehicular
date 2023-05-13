package proyecto.ponti.mi.sisvehicular.api.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UsuarioDTO {
    @NotBlank
    @Size(min = 3, max = 20)
    private String nombre;

    private String apaterno;

    private String amaterno;

    private String dni;

    private String correo;

    private String usuario;

    private String pass;
}
