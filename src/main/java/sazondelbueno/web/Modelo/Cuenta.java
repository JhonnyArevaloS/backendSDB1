package sazondelbueno.web.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cuentas")
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "name", nullable = false, length = 20)
	private String name;
	
	@Column(name= "email", nullable = false, length = 25, unique = true)
	private String email;
	
	@Column(name= "password", nullable = false, length = 20)
	private String password;


	public Cuenta(String correo,String contrasena){
		this.password=contrasena;
		this.email= correo;
	}

	
	
	
}
