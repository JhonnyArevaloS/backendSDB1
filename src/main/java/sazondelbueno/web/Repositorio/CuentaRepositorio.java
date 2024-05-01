package sazondelbueno.web.Repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sazondelbueno.web.Modelo.Cuenta;

@Repository
public interface CuentaRepositorio extends JpaRepository<Cuenta, Integer> {

    Cuenta getByEmailAndPassword(String email,String password);






}
