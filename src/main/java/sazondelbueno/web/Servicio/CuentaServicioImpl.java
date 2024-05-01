package sazondelbueno.web.Servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sazondelbueno.web.Modelo.Cuenta;
import sazondelbueno.web.Repositorio.CuentaRepositorio;

@Service
public class CuentaServicioImpl implements CuentaServicio {
	
	@Autowired
	private CuentaRepositorio repositorio;
	
	@Override
	public Cuenta guardarCuenta(Cuenta cuenta) {
		return repositorio.save(cuenta);
	}

	

}
