package clases;

import java.util.logging.Logger;

import dao.OperacionesFicheros;

public class Cliente {

	private static Logger log = Logger.getLogger(OperacionesFicheros.class);
	private int id;
	private String nombre;
	private String apellidos;
	private String numTelefono;
	private String email;

	public Cliente(int id, String nombre, String apellidos, String numTelefono, String email) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", numTelefono=" + numTelefono
				+ ", email=" + email + "]";
	}
}
