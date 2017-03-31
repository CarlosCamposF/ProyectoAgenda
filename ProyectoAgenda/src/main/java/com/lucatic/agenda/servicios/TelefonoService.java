package com.lucatic.agenda.servicios;

import java.util.List;


import com.lucatic.agenda.beans.Telefono;

public interface TelefonoService extends Service<Telefono>{
public List<Telefono> list();
	
	public Telefono get(int id);
	
	public void saveOrUpdate(Telefono item);
	
	public void delete(int id);
}
