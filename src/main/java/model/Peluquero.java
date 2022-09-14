package model;

import lombok.Getter;
import lombok.Setter;


public class Peluquero extends Persona {
    @Getter
    @Setter
    String nombrePeluqueria;
    String direccion;
    long cuit;

    public Peluquero(long id, String nombre, String apellido,
                   String teléfono, String username, String password) {

        super(id, nombre, apellido, teléfono, password, username, "persona.usuario");
        this.nombrePeluqueria = nombrePeluqueria;
        this.direccion = direccion;
        this.cuit = cuit;

    }
}