package sazondelbueno.web.Servicio;

import sazondelbueno.web.Modelo.Cuenta;

import java.util.List;
import java.util.Optional;

public interface CuentaServicio {
	public Cuenta guardarCuenta(Cuenta cuenta);
	public List<Cuenta> listarCuentas();
	Cuenta existeCuenta(String email,String password);
	Optional<Cuenta> getById(Long id);
	boolean deleteById(Long id);
	Cuenta updateById(Long id,Cuenta cuenta);


}
