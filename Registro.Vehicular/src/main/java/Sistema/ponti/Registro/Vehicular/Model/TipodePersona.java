package Sistema.ponti.Registro.Vehicular.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class TipodePersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idTipodePersona")
    private Integer id;
    private String descripcion ;



}
