package proyecto.ponti.mi.sisvehicular.api.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Data
public class RegistroDTO {

    @NotBlank
    @Size(min = 8, max = 20)
    private Date hingreso;

    private Date hsalida;

    private Integer idvehiculo;
}
