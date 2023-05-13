package proyecto.ponti.mi.sisvehicular.api.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TipovehiculoDTO {

    @NotBlank
    @Size(min = 3, max = 20)
    private String descripcion;
}
