package operaciones_ficheros;

import java.io.File;

import clases.Cliente;

public class OperacionesFicheros {
	
	private String ruta = "." + File.separator + "Files" + File.separator;
	private String ficheroClientes = ruta + "FicheroClientes.bin";
	private String ficheroInmuebles = ruta + "FicheroInmuebles.bin";
	
	public String getRuta() {
		return ruta;
	}
	public String getFicheroClientes() {
		return ficheroClientes;
	}
	public String getFicheroInmuebles() {
		return ficheroInmuebles;
	}
	
	public static void guardarCliente(Cliente c) {
		
	}
}