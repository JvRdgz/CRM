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

		clientes = readAllWithFiles();
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
		if (Persistence.isFileMethod())
			c = readWithFiles(id);
		else if (Persistence.isBbddMethod())
			c = readWithBbdd(id);
		return c;
	}

	// MODIFIES THE CLIENT TAKEN BY ID, AND IT'S OVERRIDED BY THE NEW CLIENT.
	private void updateWithFiles(int id, Cliente newClient) {
		Cliente c = readWithFiles(id);
		// deleteWithFiles(id);
		c.setNombre(newClient.getNombre());
		c.setApellidos(newClient.getApellidos());
		c.setNumTelefono(newClient.getNumTelefono());
		c.setEmail(newClient.getEmail());
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(Files.getFicheroClientes(), false));
			BufferedReader br = new BufferedReader(new FileReader(Files.getFicheroClientes()));
			String line = br.readLine();
			int numLine = 1; // THE ID WILL BE THE SAME NUMBER AS THE LINE NUMBER.
			// NOT SURE IF THE BR IT'S NECESSARY TO SEEK THE BW. NEED TO BE TESTED.
			while (line != null) {
				if (numLine == id) {
					bw.write(c.toStrigFiles());
					break;
				}
				line = br.readLine();
				numLine++;
			}
			br.close();
			bw.close();
		} catch (IOException e) {
			System.err.println("\nERROR EN EL BUFFER DEL FICHERO CLIENTES.\n");
			e.printStackTrace();
		}
	}

	private void updateWithBbdd(int id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void update(int id, Cliente newClient) {
		if (Persistence.isFileMethod())
			updateWithFiles(id, newClient);
		else if (Persistence.isBbddMethod())
			updateWithBbdd(id);
	}

	private void deleteWithBbdd(int id) {
		// TODO Auto-generated method stub
	}

	private void deleteWithFiles(int id) {
		// TODO MOVER EL BUFFER HASTA EL QUE EL ID COINCIDA CON EL 
		// NUMERO DE LINEA Y LO MISMO CON EL ARRAYLIST. UNA VEZ QUE LLEGADO AHI,
		// ESCRIBIR todo EL RESTO DEL ARRAYLIST EN EL FICHERO.
		ArrayList<Cliente> clients = this.readall();
		try {
			BufferedReader br = new BufferedReader(new FileReader(Files.getFicheroClientes()));
			BufferedWriter bw = new BufferedWriter(new FileWriter(Files.getFicheroClientes(), false));

			String line = br.readLine();
			int numLine = 1;
			int i = 0;
			while (line != null || i < clients.size()) {
				if (numLine == id) {
					bw.write("");
					line = br.readLine();
					break;
				}
				line = br.readLine();
				i++;
				numLine++;
			}
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			System.err.println("\nFICHERO CLIENTES NO ENCONTRADO.\n");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("\nERROR EN EL BUFFER DEL FICHERO CLIENTES.\n");
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		if (Persistence.isFileMethod())
			deleteWithFiles(id);
		else if (Persistence.isBbddMethod())
			deleteWithBbdd(id);
	}

	private ArrayList<Cliente> readAllWithBbdd() {
		// TODO Auto-generated method stub
		return null;
	}

	private ArrayList<Cliente> readAllWithFiles() {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Cliente c = null;
		File f = new File(Files.getFicheroClientes());
		if (clientes.size() == 0) {
			JOptionPane.showMessageDialog(null, "No existen clientes guardados.", "Error", JOptionPane.ERROR_MESSAGE);
		} else {
			try {
				BufferedReader br = new BufferedReader(new FileReader(f));
				String line = br.readLine();
				while (line != null) {
					String[] line_parts = line.split("#");
					clientes.add(c = new Cliente(line_parts[0], line_parts[1], line_parts[2], line_parts[3]));
					line = br.readLine();
				}
				br.close();
				return clientes;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public ArrayList<Cliente> readall() {
		if (Persistence.isFileMethod())
			readAllWithFiles();
		else if (Persistence.isBbddMethod())
			readAllWithBbdd();
		return null;
	}
}