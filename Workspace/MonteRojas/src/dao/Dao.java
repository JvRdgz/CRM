package dao;

import java.util.ArrayList;

import clases.Cliente;

public interface Dao {

	void create(Cliente c);
	Cliente read(int id);
	void update(int id);
	void delete(int id);
	ArrayList<Cliente> readall();
}
