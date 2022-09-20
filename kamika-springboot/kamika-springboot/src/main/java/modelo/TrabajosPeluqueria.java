package modelo;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class TrabajosPeluqueria {
        UUID id;
        String nombreServ;
        String descripcionServ;
        double precio;
        String timepoEstimado;


}
