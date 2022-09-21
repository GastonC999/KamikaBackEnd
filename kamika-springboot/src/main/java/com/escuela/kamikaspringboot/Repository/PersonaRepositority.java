package com.escuela.kamikaspringboot.Repository;

import com.escuela.kamikaspringboot.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositority extends JpaRepository<Persona, Integer> {
}
