package com.lucatic.agenda.servicios;

import java.util.List;

import com.lucatic.agenda.beans.Empleado;
import com.lucatic.agenda.dao.EmpleadoDAO;

public class EmpleadoServiceImpl implements EmpleadoService{
	private EmpleadoDAO empleadoDAO;
	
	
	
	
	public List<Empleado> list() {
		// TODO Auto-generated method stub
		return empleadoDAO.list();
	}

	public Empleado get(int id) {
		// TODO Auto-generated method stub
		return empleadoDAO.get(id);
	}

	public void saveOrUpdate(Empleado empleado) {
		empleadoDAO.saveOrUpdate(empleado);
		
	}

	public void delete(int id) {
		empleadoDAO.delete(id);
		
	}

}
