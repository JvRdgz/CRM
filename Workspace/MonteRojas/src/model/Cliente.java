package model;

public class Cliente {

	private int id;
	private String nombre;
	private String apellidos;
	private String numTelefono;
	private String email;

	public Cliente(int id, String nombre, String apellidos, String numTelefono, String email) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numTelefono = numTelefono;
		this.email = email;
	}
	
	public Cliente(String nombre, String apellidos, String numTelefono, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numTelefono = numTelefono;
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
		return "Id:" + id + ", nombre:" + nombre + ", apellidos:" + apellidos + ", numTelefono:" + numTelefono
				+ ", email:" + email;
	}
	
	public String toStrigFiles() {
		return this.id + "#" + this.nombre + "#" + this.apellidos + "#" + this.numTelefono + "#" + this.email;
	}
}
