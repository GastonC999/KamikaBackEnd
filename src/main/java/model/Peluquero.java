package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Peluquero extends Persona {
    String nombrePeluqueria;
    long cuit;


    public Peluquero(long id, String nombre, String apellido,
                   String teléfono, String username, String password) {

        super(id, nombre, apellido, teléfono, password, username, "persona.usuario");
        this.nombrePeluqueria = nombrePeluqueria;
        this.cuit = cuit;
    }
}