package Servicio;

import model.Peluquero;
import model.Persona;
import model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServicio {
    private List<Persona> PersonaLista = new ArrayList<>();

    /////////////////USUARIO//////////////
    public void agregarPersona(Usuario persona) {
        PersonaLista.add(persona);
    }

    public List<Persona> getPersona() {
        return PersonaLista;
    }



    ///////////////Peluquerx////////////
    public void agregarPersona(Peluquero persona){
            PersonaLista.add(persona);
    }



}
