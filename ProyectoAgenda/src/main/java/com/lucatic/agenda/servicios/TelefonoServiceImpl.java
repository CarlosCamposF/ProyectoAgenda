package com.lucatic.agenda.servicios;

import java.util.List;

import com.lucatic.agenda.beans.Telefono;
import com.lucatic.agenda.dao.TelefonoDAO;

public class TelefonoServiceImpl {
private TelefonoDAO telefonoDAO;
	
	
	
	
	public List<Telefono> list() {
		// TODO Auto-generated method stub
		return telefonoDAO.list();
	}

	public Telefono get(int id) {
		// TODO Auto-generated method stub
		return (Telefono) telefonoDAO.get(id);
	}

	public void saveOrUpdate(Telefono telefono) {
		telefonoDAO.saveOrUpdate(telefono);
		
	}

	public void delete(int id) {
		telefonoDAO.delete(id);
		
	}


}
