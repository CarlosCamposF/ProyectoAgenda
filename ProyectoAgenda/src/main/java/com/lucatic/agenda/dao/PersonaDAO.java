package com.lucatic.agenda.dao;
// Generated 30-mar-2017 13:56:25 by Hibernate Tools 5.1.0.Alpha1

import java.util.List;

import com.lucatic.agenda.beans.Persona;

/**
 * Home object for domain model class Personas.
 * @see com.lucatic.agenda.dao.Personas
 * @author Hibernate Tools
 */
public interface PersonaDAO extends  GestorDAO<Persona>{

	public List<Persona> getNombre(String nombre);
	
	public List<Persona> getTelefono(int telefono);
	
	public List<Persona> getDireccion(String direccion);
}
