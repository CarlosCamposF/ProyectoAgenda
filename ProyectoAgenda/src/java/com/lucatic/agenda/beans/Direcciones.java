package com.lucatic.agenda.beans;
// Generated 30-mar-2017 13:55:39 by Hibernate Tools 5.1.0.Alpha1

/**
 * Direcciones generated by hbm2java
 */
public class Direcciones implements java.io.Serializable {

	private Integer iddirecciones;
	private Personas personas;
	private String direccion;
	private String codPostal;
	private String localidad;
	private String provincia;

	public Direcciones() {
	}

	public Direcciones(String direccion, String codPostal, String localidad, String provincia) {
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	public Direcciones(Personas personas, String direccion, String codPostal, String localidad, String provincia) {
		this.personas = personas;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	public Integer getIddirecciones() {
		return this.iddirecciones;
	}

	public void setIddirecciones(Integer iddirecciones) {
		this.iddirecciones = iddirecciones;
	}

	public Personas getPersonas() {
		return this.personas;
	}

	public void setPersonas(Personas personas) {
		this.personas = personas;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodPostal() {
		return this.codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

}
