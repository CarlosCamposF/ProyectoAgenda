package com.lucatic.agenda.beans;
// Generated 30-mar-2017 13:55:39 by Hibernate Tools 5.1.0.Alpha1

import java.util.HashSet;
import java.util.Set;

/**
 * Departamentos generated by hbm2java
 */
public class Departamentos implements java.io.Serializable {

	private Integer iddepartamento;
	private String nombre;
	private Set empleadoses = new HashSet(0);

	public Departamentos() {
	}

	public Departamentos(String nombre) {
		this.nombre = nombre;
	}

	public Departamentos(String nombre, Set empleadoses) {
		this.nombre = nombre;
		this.empleadoses = empleadoses;
	}

	public Integer getIddepartamento() {
		return this.iddepartamento;
	}

	public void setIddepartamento(Integer iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getEmpleadoses() {
		return this.empleadoses;
	}

	public void setEmpleadoses(Set empleadoses) {
		this.empleadoses = empleadoses;
	}

}
