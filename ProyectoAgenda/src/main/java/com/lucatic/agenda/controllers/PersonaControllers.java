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

import com.lucatic.agenda.beans.Categoria;
import com.lucatic.agenda.beans.Persona;
import com.lucatic.agenda.dao.PersonaDAOImpl;
import com.lucatic.agenda.servicios.CategoriaService;
import com.lucatic.agenda.servicios.PersonaService;
import com.lucatic.agenda.servicios.Service;




@Controller
public class PersonaControllers {
	
	@Autowired
	private CategoriaService service;
	

	@RequestMapping("/")
	public ModelAndView handleRequest() throws Exception {
		
		System.out.println("--entrando al /home");
		List<Categoria> personas =  new ArrayList<Categoria>();
		System.out.println("probando ultimo");
		personas = service.list();
		PersonaDAOImpl per = new PersonaDAOImpl();
		//Persona p1 = per.get(1);
		for(Categoria p : personas){
			System.out.print(p.getNombre()+" ");
			System.out.print(p.getDescripcion()+" ");
			System.out.print(p.getIdcategorias()+" ");
			//System.out.println(p.getDni());
		}
		//System.out.println(p1.getNombre());
		ModelAndView model = new ModelAndView("listado");
		model.addObject("listado", personas);
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
		//int userId = Integer.parseInt(request.getParameter("id"));
		//Persona persona = (Persona) service.get(userId);
		ModelAndView model = new ModelAndView("listado");
		model.addObject("persona", new Persona());
		return model;		
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteUser(HttpServletRequest request) {
		int personaId = Integer.parseInt(request.getParameter("id"));
		service.delete(personaId);
		return new ModelAndView("redirect:/");		
	}
	
	/*@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute Persona persona) {
		service.saveOrUpdate(persona);
		return new ModelAndView("redirect:/");
	}*/
	@RequestMapping(value = "/detalle_contacto", method = RequestMethod.GET)
	public ModelAndView pep(@ModelAttribute Categoria persona) {
		//service.saveOrUpdate(persona);
		return new ModelAndView("detalle_contacto");
	}
	
}
