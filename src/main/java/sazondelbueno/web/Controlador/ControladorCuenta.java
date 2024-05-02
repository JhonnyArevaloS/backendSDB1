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
import java.util.Optional;

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

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Cuenta>>getById(@PathVariable("id") Long id){
		Optional<Cuenta> c = servicio.getById(id);
		return  new ResponseEntity<>(c,HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean>deleteById(@PathVariable("id") Long id){
		boolean exit = servicio.deleteById(id);
		return  new ResponseEntity<>(exit,HttpStatus.OK);
	}

	@PatchMapping ("/{id}")
	public ResponseEntity<Cuenta> updateDentist (@RequestBody Cuenta cuenta, @PathVariable Long id) {
		try {
			return new ResponseEntity<>(servicio.updateById(id,cuenta), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}