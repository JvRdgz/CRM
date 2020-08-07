package persistence;

import model.Files;

public class Persistence {

	static String method = Config.getParameter(Files.getFicheroProperties(), "method");

	public static String getMethod() {
		return method;
	}

	public static boolean checkPersistenceFile() {
		if (method.equalsIgnoreCase("file") || method.equalsIgnoreCase("bbdd")) {
			System.out.println("Persistence file read succesfully.");
			return true;
		} else {
			System.out.println("Error, cannot read the persistence file.");
			return false;
		}
	}

	public static boolean isFileMethod() {
		if (method.equalsIgnoreCase("file"))
			return true;
		else
			return false;
	}

	public static boolean isBbddMethod() {
		if (method.equalsIgnoreCase("bbdd"))
			return true;
		else
			return false;
	}
}