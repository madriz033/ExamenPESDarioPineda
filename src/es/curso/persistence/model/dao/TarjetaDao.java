package es.curso.persistence.model.dao;

import java.util.ArrayList;

import es.curso.model.Entity.Tarjeta;

public interface TarjetaDao {
	
	public void create(Tarjeta tarjeta);
	
	public ArrayList<Tarjeta> findAll();
	
	
	

}
