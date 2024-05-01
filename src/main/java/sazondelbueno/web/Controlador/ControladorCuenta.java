package sazondelbueno.web.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import sazondelbueno.web.Modelo.Cuenta;
import sazondelbueno.web.Servicio.CuentaServicio;

import java.util.List;

@Controller
@RequestMapping("/acounts")
@CrossOrigin("*")
public class ControladorCuenta{
	
	@Autowired CuentaServicio servicio;

	@PostMapping()
	public ResponseEntity<Cuenta> guardarCuenta(@RequestBody Cuenta c ) {
		Cuenta cuenta =  servicio.guardarCuenta(c);
		return new ResponseEntity<>(cuenta,HttpStatus.CREATED);
	}
	
	@GetMapping()
	public ResponseEntity<List<Cuenta> > getAccounts(){
		List<Cuenta> lista = servicio.listarCuentas();
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}

	@PostMapping("/exist")
	public ResponseEntity<Cuenta> existAcount(@RequestBody Cuenta cuenta){
		Cuenta c = servicio.existeCuenta(cuenta.getEmail(),cuenta.getPassword());
		return new ResponseEntity<>(c,HttpStatus.OK);
	}




}