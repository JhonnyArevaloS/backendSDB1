package sazondelbueno.web.Servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sazondelbueno.web.Modelo.Cuenta;
import sazondelbueno.web.Repositorio.CuentaRepositorio;

import java.util.List;

@Service
public class CuentaServicioImpl implements CuentaServicio {
	
	@Autowired
	private CuentaRepositorio repositorio;
	
	@Override
	public Cuenta guardarCuenta(Cuenta cuenta) {
		return repositorio.save(cuenta);
	}

	@Override
	public List<Cuenta> listarCuentas() {
		return  repositorio.findAll();
	}

	@Override
	public Cuenta findByEmail(Cuenta cuenta) {
		return repositorio.findByEmail(cuenta.getCorreo());
	}






}
