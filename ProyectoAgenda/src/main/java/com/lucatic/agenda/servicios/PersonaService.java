package com.lucatic.agenda.servicios;

import java.util.List;

import com.lucatic.agenda.beans.Persona;


public interface PersonaService {
	
	public List<Persona> list();
	
	public Persona get(int id);
	
	public void saveOrUpdate(Persona persona);
	
	public void delete(int id);
}
