package Servicio;

import modelo.Turnos;
import modelo.Turnos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeluqueroServicio {
    private List<Turnos> turnosLista = new ArrayList();

    public void agregarTurno (Turnos turnos){
        turnosLista.add(turnos);
    }

    public List<Turnos> getTurnos(){
        return turnosLista;
    }


    //agregarServicio
    //ModificarServicio
    //eliminarServicio
    //RegistroCliente
    //RegistroTurno

}