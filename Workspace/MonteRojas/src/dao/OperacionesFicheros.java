package dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import clases.Cliente;
import clases.Files;

public class OperacionesFicheros implements Dao{
	private static Logger log = Logger.getLogger(OperacionesFicheros.class);
	
	@Override
	public void create(Cliente c) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter((Files.getFicheroClientes()), true));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public Cliente read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void update(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayList<Cliente> readall() {
		// TODO Auto-generated method stub
		return null;
	}
}