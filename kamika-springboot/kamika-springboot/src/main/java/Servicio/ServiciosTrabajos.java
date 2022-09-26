package Servicio;


import Repository.PersonaRepositority;
import exception.ResourceNotFoundException;
import modelo.Peluquero;
import modelo.Persona;
//import net.javaguides.springboot.exception.ResourceNotFoundException;
//import net.javaguides.springboot.model.Persona;
//import net.javaguides.springboot.repository.PersonaRepositority;
import modelo.TrabajosPe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin("*")
@RestController
@RequestMapping("/kamika/TrabajosPe")

public class ServiciosTrabajos {

/*    @Autowired
    private TrabajosPe TrabajosPeRepositority;

    @GetMapping
    public List<TrabajosPe> getAllTrabajos(){
        return TrabajosPeRepositority.findAll();
    }
    // Create ServicioTrabajo REST API
    @PostMapping
    public TrabajosPe createTrabajo(@RequestBody TrabajosPe trabajosPe) {
        return TrabajosPeRepositority.save(trabajosPe);
    }

    // get servicioPeluqueria by id REST API
    @GetMapping("{id}")
    public ResponseEntity<TrabajosPe> getTrabajoPeById(@PathVariable long id){
        TrabajosPe trabajosPe = (TrabajosPe) TrabajosPeRepositority.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("El id de este trabajo no existe:" + id));
        return ResponseEntity.ok(trabajosPe);
    }*/
}
