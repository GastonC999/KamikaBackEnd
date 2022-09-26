package Servicio;

import Repository.PersonaRepositority;
import Repository.TrabajoRepositority;
import exception.ResourceNotFoundException;
import modelo.TrabajosPe;
import modelo.Persona;
//import net.javaguides.springboot.exception.ResourceNotFoundException;
//import net.javaguides.springboot.model.Persona;
//import net.javaguides.springboot.repository.PersonaRepositority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin("*")
@RestController
@RequestMapping("/kamika/Persona")
public class ServicioAdmin {

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

    @Autowired
    private TrabajoRepositority TrabajoRepositority;

    @GetMapping
    public List<TrabajosPe> getAllTrabajos(){
        return TrabajoRepositority.findAll();
    }
    // Create ServicioTrabajo REST API
    @PostMapping
    public TrabajosPe createTrabajo(@RequestBody TrabajosPe trabajosPe) {
        return TrabajoRepositority.save(trabajosPe);
    }

    // get servicioPeluqueria by id REST API
    @GetMapping("{id}")
    public ResponseEntity<TrabajosPe> getTrabajoPeById(@PathVariable long id){
        TrabajosPe trabajosPe = (TrabajosPe) TrabajoRepositority.findById((int) id)
                .orElseThrow(() -> new ResourceNotFoundException("El id de este trabajo no existe:" + id));
        return ResponseEntity.ok(trabajosPe);
    }

    // build update ServicioPeluqueria REST API
    @PutMapping("{id}")
    public ResponseEntity<TrabajosPe> updateTrabajosPe(@PathVariable Integer id,@RequestBody TrabajosPe trabajosPeDetails) {
        TrabajosPe updateTrabajosPe = TrabajoRepositority.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe trabajo con este id: " + id));

        updateTrabajosPe.setNombreServicio(trabajosPeDetails.getNombreServicio());
        updateTrabajosPe.setDescripcionServ(trabajosPeDetails.getDescripcionServ());
        updateTrabajosPe.setPrecio(trabajosPeDetails.getPrecio());
        updateTrabajosPe.setTiempoEstimado(trabajosPeDetails.getTiempoEstimado());

        TrabajoRepositority.save(updateTrabajosPe);

        return ResponseEntity.ok(updateTrabajosPe);
    }

    // build delete TrabajoPeluqueria REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteTrabajosPe(@PathVariable Integer id){

        TrabajosPe trabajosPe = TrabajoRepositority.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe un trabajo con este id: " + id));

        TrabajoRepositority.delete(trabajosPe);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}