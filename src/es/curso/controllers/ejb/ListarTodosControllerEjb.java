package es.curso.controllers.ejb;

import java.util.ArrayList;

import es.curso.controllers.ListarTodosController;
import es.curso.model.Entity.Tarjeta;
import es.curso.persistence.model.dao.TarjetaDao;
import es.curso.persistence.model.dao.jdbc.TarjetaDaoJdbc;

public class ListarTodosControllerEjb implements ListarTodosController {
	private TarjetaDao tarjetaDao;
	
	@Override
	public void agregar(Tarjeta tarjeta) {
		
	tarjetaDao= new TarjetaDaoJdbc();
	tarjetaDao.create(tarjeta);
	
		
	}

	public ArrayList<Tarjeta> ListarTodos() {
		tarjetaDao= new TarjetaDaoJdbc();
		return tarjetaDao.findAll();
		
	
	}

}	