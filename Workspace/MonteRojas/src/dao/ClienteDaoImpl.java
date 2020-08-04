package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import idao.IClienteDao;
import model.Cliente;
import model.Files;

public class ClienteDaoImpl implements IClienteDao {

	@Override
	public void create(Cliente c) {
		try {
			File f = new File(Files.getFicheroClientes());
			if (!f.exists())
				f.createNewFile();
			BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
			bw.write(c.toString());
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			System.err.println("\nERROR EN LA LECTURA DEL FICHERO CLIENTES.");
			e.printStackTrace();
		}
	}

	@Override
	public Cliente read(int id) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		clientes = readall();
		if (clientes.size() == 0)
			JOptionPane.showMessageDialog(null, "No existen clientes guardados.", "Error", JOptionPane.ERROR_MESSAGE);
		else {
			for (int i = 0; i < clientes.size(); i++) {
				if (clientes.get(i).getId() == id)
					return clientes.get(i);
			}
		}
		JOptionPane.showMessageDialog(null, "Cliente no encontrado.", "Error", JOptionPane.WARNING_MESSAGE);
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