package com.lucatic.agenda.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.lucatic.agenda.beans.Persona;
import com.lucatic.agenda.dao.PersonaDAO;

@Service
@Transactional
public class PersonaServiceImpl implements PersonaService {

	private PersonaDAO personaDAO;

	public Persona get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveOrUpdate(Persona persona) {
		// TODO Auto-generated method stub

	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	public List<Persona> list() {
		// TODO Auto-generated method stub
		return null;
	}
}
