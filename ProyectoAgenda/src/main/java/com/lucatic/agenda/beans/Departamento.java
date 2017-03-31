package com.lucatic.agenda.beans;
// Generated 30-mar-2017 13:55:39 by Hibernate Tools 5.1.0.Alpha1

import java.util.*;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="departamentos" , catalog="agenda")
/**
 * Departamento generated by hbm2java
 */
public class Departamento implements java.io.Serializable {

	private Integer iddepartamento;
	private String nombre;
	private List <Empleado> dep_empleados = new ArrayList();

	public Departamento() {
	}

	public Departamento(String nombre) {
		this.nombre = nombre;
	}

	public Departamento(String nombre, Set empleadoses) {
		this.nombre = nombre;
		
	}
	public String addEmpleado(Empleado emp){
		if(this.dep_empleados.add(emp)){
			return "Empleado agregado correctamente al departamento";
		}else{
			return "Error agregando al empleado en el departamento";
		}
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dep_empleados == null) ? 0 : dep_empleados.hashCode());
		result = prime * result + ((iddepartamento == null) ? 0 : iddepartamento.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		if (dep_empleados == null) {
			if (other.dep_empleados != null)
				return false;
		} else if (!dep_empleados.equals(other.dep_empleados))
			return false;
		if (iddepartamento == null) {
			if (other.iddepartamento != null)
				return false;
		} else if (!iddepartamento.equals(other.iddepartamento))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Departamento [iddepartamento=" + iddepartamento + ", nombre=" + nombre + ", dep_empleados="
				+ dep_empleados + "]";
	}

	

}