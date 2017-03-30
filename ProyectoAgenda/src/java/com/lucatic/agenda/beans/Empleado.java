package com.lucatic.agenda.beans;
// Generated 30-mar-2017 13:55:39 by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Empleados generated by hbm2java
 */
public class Empleados implements java.io.Serializable {

	private Integer idempleados;
	private Categorias categorias;
	private Departamentos departamentos;
	private String codEmpleado;
	private String salario;
	private Date fechaAlta;
	private Set personases = new HashSet(0);

	public Empleados() {
	}

	public Empleados(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public Empleados(Categorias categorias, Departamentos departamentos, String codEmpleado, String salario,
			Date fechaAlta, Set personases) {
		this.categorias = categorias;
		this.departamentos = departamentos;
		this.codEmpleado = codEmpleado;
		this.salario = salario;
		this.fechaAlta = fechaAlta;
		this.personases = personases;
	}

	public Integer getIdempleados() {
		return this.idempleados;
	}

	public void setIdempleados(Integer idempleados) {
		this.idempleados = idempleados;
	}

	public Categorias getCategorias() {
		return this.categorias;
	}

	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}

	public Departamentos getDepartamentos() {
		return this.departamentos;
	}

	public void setDepartamentos(Departamentos departamentos) {
		this.departamentos = departamentos;
	}

	public String getCodEmpleado() {
		return this.codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getSalario() {
		return this.salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Set getPersonases() {
		return this.personases;
	}

	public void setPersonases(Set personases) {
		this.personases = personases;
	}

}
