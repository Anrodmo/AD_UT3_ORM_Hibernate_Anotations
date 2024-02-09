package AD_UT4.Hibernate_Anotations;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// indicamos que esta clase se ha de tratar como una entidad de la BBDD
@Entity
public class Cliente {

	@Id   // indicamos cuales la clave primaria y el modo de generación automática
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nombre;  // un atributo, no hace falta ponerle etiquete
							// si no hay la menos un atributo no crea la tabla, no hay registros que crear
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cliente (String nombre) {
		this.nombre = nombre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
	

}
