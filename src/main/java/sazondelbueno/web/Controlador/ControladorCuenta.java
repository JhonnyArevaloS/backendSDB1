package sazondelbueno.web.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import sazondelbueno.web.Modelo.Cuenta;
import sazondelbueno.web.Servicio.CuentaServicio;

@Controller
public class ControladorCuenta{
	
	@Autowired CuentaServicio servicio;
	
	@GetMapping("/CrearCuenta")
	public String crearCuenta(Model modelo){
		Cuenta cuenta = new Cuenta();
		modelo.addAttribute("cuenta", cuenta);
		return "CrearCuenta";
	}
	
	@PostMapping("/CrearCuenta")
	public String guardarCuenta(@ModelAttribute("cuenta") Cuenta cuenta) {
		servicio.guardarCuenta(cuenta);
		return "redirect:/CrearCuenta";
	}

}