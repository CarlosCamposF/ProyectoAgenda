package com.lucatic.agenda.beans;
// Generated 30-mar-2017 13:55:39 by Hibernate Tools 5.1.0.Alpha1

/**
 * Telefonos generated by hbm2java
 */
public class Telefonos implements java.io.Serializable {

	private Integer idtelefonos;
	private Personas personas;
	private String telefono;

	public Telefonos() {
	}

	public Telefonos(Personas personas, String telefono) {
		this.personas = personas;
		this.telefono = telefono;
	}

	public Integer getIdtelefonos() {
		return this.idtelefonos;
	}

	public void setIdtelefonos(Integer idtelefonos) {
		this.idtelefonos = idtelefonos;
	}

	public Personas getPersonas() {
		return this.personas;
	}

	public void setPersonas(Personas personas) {
		this.personas = personas;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
