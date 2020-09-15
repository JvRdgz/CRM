package idao;

import java.util.ArrayList;

import model.Cliente;

public interface IClienteDao {

	void create(Cliente c);
	Cliente read(int id);
	void update(int id, Cliente newClient);
	void delete(int id);
	ArrayList<Cliente> readall();
}
