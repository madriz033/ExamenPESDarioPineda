package es.curso.controllers.ejb;

import es.curso.controllers.DarAltaTarjetaController;
import es.curso.model.Entity.Tarjeta;
import es.curso.persistence.model.dao.TarjetaDao;
import es.curso.persistence.model.dao.jdbc.TarjetaDaoJdbc;

public class DarAltaTarjetaControllerEjb implements DarAltaTarjetaController {
	private TarjetaDao tarjetaDao;
	
	@Override
	public void agregar(Tarjeta tarjeta) {
		
	tarjetaDao= new TarjetaDaoJdbc();
	tarjetaDao.create(tarjeta);
	
		
	}
	
	

}
