package com.escuela.kamikaspringboot.Servicio;

import com.escuela.kamikaspringboot.modelo.Persona;
import com.escuela.kamikaspringboot.modelo.Usuario;
import model.Peluquero;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServicio {
    private List<Persona> PersonaLista = new ArrayList<>();

    /////////////////USUARIO//////////////
    public void agregarPersonaUsuario(Usuario persona) {
        PersonaLista.add(persona);
    }

    public List<Persona> getPersonaUsuario() {
        return PersonaLista;
    }



    ///////////////Peluquerx////////////
    public void agregarPersonaPeluquerx(Peluquero persona){
        PersonaLista.add(persona);
    }



}
