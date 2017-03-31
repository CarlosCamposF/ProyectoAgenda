package com.lucatic.agenda.servicios;

import java.util.List;

import com.lucatic.agenda.beans.Empleado;



public interface EmpleadoService extends Service<Empleado>{

	public List<Empleado> list();
	
	public Empleado get(int id);
	
	public void saveOrUpdate(Empleado item);
	
	public void delete(int id);
}
