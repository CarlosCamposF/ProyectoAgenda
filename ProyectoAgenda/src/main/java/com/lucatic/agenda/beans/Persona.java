package com.lucatic.agenda.beans;
// Generated 30-mar-2017 13:55:39 by Hibernate Tools 5.1.0.Alpha1

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Personas generated by hbm2java
 */
public class Persona implements java.io.Serializable {

	private Integer idpersonas;
	private Empleado empleados;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private Date fechaNacimiento;
	private List<Direccion> direccioneses = new ArrayList();
	private List<Telefono> telefonoses = new ArrayList();

	public Persona() {
	}

	public Persona(String nombre, String apellido1) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}

	public Persona(Empleado empleados, String nombre, String apellido1, String apellido2, String dni,
			Date fechaNacimiento, List direccioneses, List telefonoses) {
		this.empleados = empleados;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.direccioneses = direccioneses;
		this.telefonoses = telefonoses;
	}
	public void addTelefono(Telefono telefono){
		this.telefonoses.add(telefono);
	}
	public void addDireccion(Direccion direccion){
		this.direccioneses.add(direccion);
	}
	public String deleteTelefono(Telefono telefono){
		if(telefonoses.remove(telefono)){
			return "Telefono eliminado correctamente";
		}else{
			return "Error al eliminar, telefono no encontrado";
		}
	}
	public String deleteDireccion(Direccion direccion){
		if(direccioneses.remove(direccion)){
			return "Direccion eliminada correctamente";
		}else{
			return "Error al eliminar, direccion no encontrado";
		}
				
	}

	public Integer getIdpersonas() {
		return this.idpersonas;
	}

	public void setIdpersonas(Integer idpersonas) {
		this.idpersonas = idpersonas;
	}

	public Empleado getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(Empleado empleados) {
		this.empleados = empleados;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return this.apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return this.apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public List getDireccioneses() {
		return this.direccioneses;
	}

	public void setDireccioneses(List direccioneses) {
		this.direccioneses = direccioneses;
	}

	public List getTelefonoses() {
		return this.telefonoses;
	}

	public void setTelefonoses(List telefonoses) {
		this.telefonoses = telefonoses;
	}

}
