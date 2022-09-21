package com.escuela.kamikaspringboot.modelo;


import lombok.Getter;
import lombok.Setter;

public class Usuario extends Persona {
    @Getter
    @Setter
    Long dni;
    int edad;



    public Usuario(long id, String nombre, String apellido, String email,
                   int teléfono, String username, String password){

        super(id, nombre, apellido, email, teléfono, username, password);
        this.dni = dni;


    }



}
