package Repository;

import modelo.TrabajosPe;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface TrabajoRepositority extends JpaRepository<TrabajosPe, Integer>{
}
