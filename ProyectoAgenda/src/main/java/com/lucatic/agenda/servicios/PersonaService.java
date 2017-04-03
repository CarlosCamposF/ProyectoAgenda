package com.lucatic.agenda.servicios;

import java.util.List;

import com.lucatic.agenda.beans.Persona;


public interface PersonaService {
	
	public List<Persona> getNombre(String nombre);
	
	public List<Persona> getTelefono(int telefono);
	
	public List<Persona> getDireccion(String direccion);
}
