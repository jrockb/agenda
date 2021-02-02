package co.com.jcd.agenda.ejb;

import java.util.List;

import javax.ejb.Local;

import co.com.jcd.agenda.model.Categoria;

@Local
public interface CategoriaFacadeLocal {
	
	void create(Categoria categoria);
	
	void edit(Categoria categroia);
	
	void remove(Categoria categoria);
	
	Categoria find(Object id);
	
	List<Categoria> findAll();

}
