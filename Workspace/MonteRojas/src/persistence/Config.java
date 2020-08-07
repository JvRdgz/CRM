package persistence;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
	
	private static Properties properties;
	
	public Config(String file) {
		properties = new Properties();
		try {
			properties.load(new FileInputStream(file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Config getInstance(String file) {
		return new Config(file);
	}
	
	public static String getParameter(String configFile, String parameter) {
		String param;
		
		Config.getInstance(configFile);
		param = properties.getProperty(parameter);
		return param;
	}
}
