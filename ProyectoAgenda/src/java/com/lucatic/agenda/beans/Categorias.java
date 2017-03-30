package com.lucatic.agenda.beans;
// Generated 30-mar-2017 13:55:39 by Hibernate Tools 5.1.0.Alpha1

import java.util.HashSet;
import java.util.Set;

/**
 * Categorias generated by hbm2java
 */
public class Categorias implements java.io.Serializable {

	private Integer idcategorias;
	private String nombre;
	private String descripcion;
	private Set empleadoses = new HashSet(0);

	public Categorias() {
	}

	public Categorias(String nombre) {
		this.nombre = nombre;
	}

	public Categorias(String nombre, String descripcion, Set empleadoses) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.empleadoses = empleadoses;
	}

	public Integer getIdcategorias() {
		return this.idcategorias;
	}

	public void setIdcategorias(Integer idcategorias) {
		this.idcategorias = idcategorias;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set getEmpleadoses() {
		return this.empleadoses;
	}

	public void setEmpleadoses(Set empleadoses) {
		this.empleadoses = empleadoses;
	}

}
