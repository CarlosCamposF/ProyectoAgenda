package com.lucatic.agenda.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lucatic.agenda.beans.Persona;
import com.lucatic.agenda.dao.PersonaDAOImpl;
import com.lucatic.agenda.servicios.PersonaService;




@Controller
public class PersonaControllers {
	
	@Autowired
	private PersonaService service;
	

	@RequestMapping("/home")
	public ModelAndView handleRequest() throws Exception {
		
		System.out.println("--entrando al /home");
		List<Persona> personas =  new ArrayList<Persona>();
		System.out.println("probando ultimo");
		personas = service.list();
		//System.out.println(personas.toString());
		for(Persona p : personas){
			System.out.print(p.getNombre()+" ");
			System.out.print(p.getApellido1()+" ");
			System.out.print(p.getApellido2()+" ");
			System.out.println(p.getDni());
		}
		
		ModelAndView model = new ModelAndView("index");
		model.addObject("lista", personas);
		return model;
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newPersona() {
		ModelAndView model = new ModelAndView("listado");
		model.addObject("persona", new Persona());
		return model;		
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editUser(HttpServletRequest request) {
		int userId = Integer.parseInt(request.getParameter("id"));
		Persona persona = (Persona) service.get(userId);
		ModelAndView model = new ModelAndView("Modificar");
		model.addObject("persona", persona);
		return model;		
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteUser(HttpServletRequest request) {
		int personaId = Integer.parseInt(request.getParameter("id"));
		service.delete(personaId);
		return new ModelAndView("redirect:/");		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute Persona persona) {
		service.saveOrUpdate(persona);
		return new ModelAndView("redirect:/home");
	}
	
}
