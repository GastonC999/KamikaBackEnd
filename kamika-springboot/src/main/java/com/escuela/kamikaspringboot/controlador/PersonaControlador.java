package com.escuela.kamikaspringboot.controlador;

import com.escuela.kamikaspringboot.Repository.PersonaRepositority;
import com.escuela.kamikaspringboot.exception.ResourceNotFoundException;
import com.escuela.kamikaspringboot.modelo.Persona;
//import net.javaguides.springboot.exception.ResourceNotFoundException;
//import net.javaguides.springboot.model.Persona;
//import net.javaguides.springboot.repository.PersonaRepositority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/kamika/Persona")
public class PersonaControlador {

    @Autowired
    private PersonaRepositority PersonaRepositority;

    @GetMapping
    public List<Persona> getAllPersona(){
        return PersonaRepositority.findAll();
    }

    // Create Persona REST API
    @PostMapping
    public Persona createPersona(@RequestBody Persona persona) {
        return PersonaRepositority.save(persona);
    }

    // get persona by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable  Integer id){
        Persona persona = PersonaRepositority.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("El id de esta persona no existe:" + id));
        return ResponseEntity.ok(persona);
    }

    // build update persona REST API
    @PutMapping("{id}")
    public ResponseEntity<Persona> updatePersona(@PathVariable Integer id,@RequestBody Persona personaDetails) {
        Persona updatePersona = PersonaRepositority.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe una persona con este id: " + id));

        updatePersona.setNombre(personaDetails.getNombre());
        updatePersona.setApellido(personaDetails.getApellido());
        updatePersona.setEmail(personaDetails.getEmail());

        PersonaRepositority.save(updatePersona);

        return ResponseEntity.ok(updatePersona);
    }

    // build delete persona REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deletePersona(@PathVariable Integer id){

        Persona persona = PersonaRepositority.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe una persona con este id: " + id));

        PersonaRepositority.delete(persona);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}