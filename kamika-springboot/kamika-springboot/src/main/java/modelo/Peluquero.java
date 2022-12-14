package modelo;

import lombok.Getter;
import lombok.Setter;
import modelo.Persona;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public class Peluquero extends Persona {
    @Getter
    @Setter
    String nombrePeluqueria;
    String direccion;
    long cuit;

    public Peluquero(long id, String nombre, String apellido, String email,
                     int telefono, String username, String password) {

        super(id, nombre, apellido, email, telefono, username, password);
        this.nombrePeluqueria = nombrePeluqueria;
        this.direccion = direccion;
        this.cuit = cuit;

    }



}