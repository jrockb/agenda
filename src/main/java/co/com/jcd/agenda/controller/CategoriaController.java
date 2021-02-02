package co.com.jcd.agenda.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import co.com.jcd.agenda.ejb.CategoriaFacadeLocal;
import co.com.jcd.agenda.model.Categoria;

@Named
@ViewScoped
public class CategoriaController implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CategoriaFacadeLocal categoriaEjb;
	private Categoria categoria;
	
	@PostConstruct
	public void init() {
		categoria = new Categoria();		
	}
	
	public void registrar() {
		try {
			categoria.setEstado(1);
			categoriaEjb.create(categoria);
		}catch(Exception ex) {
			
		}
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
