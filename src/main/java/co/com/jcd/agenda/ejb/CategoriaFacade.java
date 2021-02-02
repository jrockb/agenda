package co.com.jcd.agenda.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.com.jcd.agenda.model.Categoria;

@Stateless
public class CategoriaFacade implements CategoriaFacadeLocal{
	@PersistenceContext(unitName = "primePU")
	private EntityManager em;
	
	@Override
	public void create(Categoria categoria) {
		try {
			em.persist(categoria);
		}	
		catch(Exception ex) {
			ex.printStackTrace();		
		}
	}

	@Override
	public void edit(Categoria categroia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Categoria find(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
