package model;

import java.io.File;

public class Files {

	private static String rutaGeneral = "." + File.separator + "Files" + File.separator;
	private static String rutaFicherosDao = "." + File.separator + rutaGeneral + File.separator + "Data"
			+ File.separator;
	private static String ficheroClientes = rutaFicherosDao + "FicheroClientes.txt";
	private static String ficheroInmuebles = rutaFicherosDao + "FicheroInmuebles.txt";
	private static String rutaProperties = "." + File.separator + rutaGeneral + File.separator + "Properties"
			+ File.separator;
	private static String ficheroProperties = rutaProperties + "persistence.properties";

	public static String getRutaGeneral() {
		return rutaGeneral;
	}

	public static String getRutaFicherosDao() {
		return rutaFicherosDao;
	}

	public static String getFicheroClientes() {
		return ficheroClientes;
	}

	public static String getFicheroInmuebles() {
		return ficheroInmuebles;
	}

	public static String getRutaProperties() {
		return rutaProperties;
	}

	public static String getFicheroProperties() {
		return ficheroProperties;
	}
}
