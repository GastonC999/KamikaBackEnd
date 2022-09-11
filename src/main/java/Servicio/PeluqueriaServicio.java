package Servicio;

import model.Turnos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeluqueriaServicio {
    private List<Turnos> turnosLista = new ArrayList();

    public void agregarTurno (Turnos turnos){
        turnosLista.add(turnos);
    }

    public List<Turnos> getTurnos(){
        return turnosLista;
    }





}
