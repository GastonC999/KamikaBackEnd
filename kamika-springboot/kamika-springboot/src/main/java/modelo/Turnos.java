package modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@AllArgsConstructor
@Getter
@Setter
public class Turnos{


    String descripcionTurno;
    long telefono;
    double precio;
    Date DeRegistroTurno;
    List<TrabajosPe> serviciosDePeluqueria;





}