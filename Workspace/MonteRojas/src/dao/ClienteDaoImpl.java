package dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import idao.IClienteDao;
import model.Cliente;
import model.Files;
import persistence.Persistence;

public class ClienteDaoImpl implements IClienteDao {

	private void createWithFileMethod(Cliente c) {
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

	private void createWithBbddMethod(Cliente c) {
		// TODO CREATE CONNECTION AND CALL INSERT METHOD FROM JDBC OPERATIONS.
	}

	@Override
	public void create(Cliente c) {
		if (Persistence.isFileMethod())
			createWithFileMethod(c);
		else if (Persistence.isBbddMethod())
			createWithBbddMethod(c);
	}

	public Cliente readWithFiles(int id) {

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

	private Cliente readWithBbdd(int id) {
		// TODO CREATE CONNECTION AND CALL SHOWCLIENTS METHOD FROM JDBC OPERATIONS.
		return null;
	}

	@Override
	public Cliente read(int id) {
		Cliente c = null;
		if (Persistence.isFileMethod()) {
			c = readWithFiles(id);
		} else if (Persistence.isBbddMethod())
			c = readWithBbdd(id);
		return c;
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