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
import com.lucatic.agenda.beans.Direccion;
import com.lucatic.agenda.beans.Persona;
import com.lucatic.agenda.dao.PersonaDAOImpl;
import com.lucatic.agenda.servicios.CategoriaService;
import com.lucatic.agenda.servicios.DepartamentoService;
import com.lucatic.agenda.servicios.DireccionService;
import com.lucatic.agenda.servicios.EmpleadoService;
import com.lucatic.agenda.servicios.PersonaService;
import com.lucatic.agenda.servicios.Service;
import com.lucatic.agenda.servicios.TelefonoService;




@Controller
public class PersonaControllers {
	
	@Autowired
	private PersonaService servicePersona;
	private CategoriaService serviceCategoria;
	private TelefonoService serviceTelefono;
	private EmpleadoService serviceEmpleado;
	private DepartamentoService serviceDepartamento;
	private DireccionService serviceDireccion;
	

	@RequestMapping("/")
	public ModelAndView handleRequest() throws Exception {
		
		System.out.println("--entrando al /home");
		List<Persona> personas =  new ArrayList<Persona>();
		System.out.println("probando ultimo");
		personas = servicePersona.list();
		
		/*for(Persona p : personas){
			System.out.println(p.getEmpleados().getCategorias().getNombre());
		}*/
		
		ModelAndView model = new ModelAndView("listado");
		model.addObject("listado", personas);
		//model.addObject("categorias", categoria);
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
		ModelAndView model = new ModelAndView("modificar");
		model.addObject("persona", new Persona());
		model.addObject("direccion", new Direccion());
		return model;		
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteUser(HttpServletRequest request) {
		int personaId = Integer.parseInt(request.getParameter("id"));
		servicePersona.delete(personaId);
		return new ModelAndView("redirect:/");		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute Persona persona) {
		servicePersona.saveOrUpdate(persona);
		
		return new ModelAndView("redirect:/");
	}
	@RequestMapping(value = "/detalle", method = RequestMethod.GET)
	public ModelAndView pep(@ModelAttribute Persona persona) {
		System.out.println("peta");
		Persona p1= servicePersona.get(1);
		System.out.println(p1.getNombre());
		ModelAndView model = new ModelAndView("detalle_contacto");
		model.addObject("persona", p1);
		System.out.println("hola");
		return model;
	}
	
}
