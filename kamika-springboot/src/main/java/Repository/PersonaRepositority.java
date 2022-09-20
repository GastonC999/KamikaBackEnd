package Repository;

import modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositority extends JpaRepository<Persona, Integer> {
}
