package sazondelbueno.web.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cuentas")
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name= "nombre", nullable = false, length = 20, unique = true)
	private String nombre;
	
	@Column(name= "correo", nullable = false, length = 25, unique = true)
	private String correo;
	
	@Column(name= "contraseña", nullable = false, length = 20)
	private String contraseña;

	public Cuenta() {
	}

	public Cuenta(String nombre, String correo, String contraseña) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.contraseña = contraseña;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", contraseña=" + contraseña + "]";
	}
	
	
	
}
