package sazondelbueno.web.Servicio;

import sazondelbueno.web.Modelo.Cuenta;

import java.util.List;

public interface CuentaServicio {
	public Cuenta guardarCuenta(Cuenta cuenta);
	public List<Cuenta> listarCuentas();
	public Cuenta findByEmail(Cuenta cuenta);

}
