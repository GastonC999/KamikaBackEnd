package model;


import lombok.Getter;
import lombok.Setter;

public class Usuario extends Persona{
    @Getter
    @Setter
    Long dni;
    int edad;



    public Usuario(long id, String nombre, String apellido,
                   String teléfono, String username, String password){

        super(id, nombre, apellido, teléfono, password, username, "persona.usuario");
        this.dni = dni;


    }



}
