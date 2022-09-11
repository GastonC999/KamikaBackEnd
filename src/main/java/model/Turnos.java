package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class Turnos{

    String nombreServicio;
    String descripcion;
    double precio;
    Date fecha;


}
