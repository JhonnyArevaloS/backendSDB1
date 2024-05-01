package sazondelbueno.web.Repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sazondelbueno.web.Modelo.Cuenta;

import java.util.List;


@Repository
public interface CuentaRepositorio extends JpaRepository<Cuenta, Integer> {

    Cuenta  findByEmail(String correo);

/*    @Query("SELECT * FROM cuentas WHERE correo = correo AND contrasena = contrasena")
    List<Cuenta> findByEmailAndPassword(@Param("correo") String correo, @Param("contrasena") String contrasena);*/



}
