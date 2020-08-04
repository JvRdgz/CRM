package idao;

import java.util.ArrayList;

import model.Inmueble;

public interface IInmuebleDao {

	void create(Inmueble i);
	Inmueble read(int id);
	void update(int id);
	void delete(int id);
	ArrayList<Inmueble> readall();
}
