package proyecto.ponti.mi.sisvehicular.api.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class VehiculoDTO {
    @NotBlank
    @Size(min = 6, max = 6)
    private String placa;

    private String marca;

    private  String color;

    private String tipocombustible;

    private Integer idtipovehiculo;

    private Integer idpersona;

}
