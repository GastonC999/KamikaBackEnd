package model;


import lombok.Getter;
import lombok.Setter;

public class Usuario extends Persona{
    String Username;
    Long dni;

//@Getter
//@Setter


    public Usuario(long id, String nombre, String apellido,
                   String teléfono, String username, String password){

        super(id, nombre, apellido, teléfono, password, username, "persona.usuario");
        this.Username = username;
        this.dni = dni;


    }



}
