package com.lucatic.agenda.beans;
// Generated 30-mar-2017 13:55:39 by Hibernate Tools 5.1.0.Alpha1

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
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
@Table (name="empleados" , catalog="agenda")
/**
 * Empleados generated by hbm2java
 */
public class Empleado implements java.io.Serializable {

	private Integer idempleados;
	private Categoria categorias;
	private Departamento departamentos;
	private String codEmpleado;
	private String salario;
	private Date fechaAlta;

	public Empleado() {
	}

	public Empleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public Empleado(Categoria categorias, Departamento departamentos, String codEmpleado, String salario,
			Date fechaAlta, Set personases) {
		this.categorias = categorias;
		this.departamentos = departamentos;
		this.codEmpleado = codEmpleado;
		this.salario = salario;
		this.fechaAlta = fechaAlta;

	}

	public Integer getIdempleados() {
		return this.idempleados;
	}

	public void setIdempleados(Integer idempleados) {
		this.idempleados = idempleados;
	}

	public Categoria getCategorias() {
		return this.categorias;
	}

	public void setCategoria(Categoria categorias) {
		this.categorias = categorias;
	}

	public Departamento getDepartamentos() {
		return this.departamentos;
	}

	public void setDepartamentos(Departamento departamentos) {
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

	public void setCategorias(Categoria categorias) {
		this.categorias = categorias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categorias == null) ? 0 : categorias.hashCode());
		result = prime * result + ((codEmpleado == null) ? 0 : codEmpleado.hashCode());
		result = prime * result + ((departamentos == null) ? 0 : departamentos.hashCode());
		result = prime * result + ((fechaAlta == null) ? 0 : fechaAlta.hashCode());
		result = prime * result + ((idempleados == null) ? 0 : idempleados.hashCode());
		result = prime * result + ((salario == null) ? 0 : salario.hashCode());
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
		Empleado other = (Empleado) obj;
		if (categorias == null) {
			if (other.categorias != null)
				return false;
		} else if (!categorias.equals(other.categorias))
			return false;
		if (codEmpleado == null) {
			if (other.codEmpleado != null)
				return false;
		} else if (!codEmpleado.equals(other.codEmpleado))
			return false;
		if (departamentos == null) {
			if (other.departamentos != null)
				return false;
		} else if (!departamentos.equals(other.departamentos))
			return false;
		if (fechaAlta == null) {
			if (other.fechaAlta != null)
				return false;
		} else if (!fechaAlta.equals(other.fechaAlta))
			return false;
		if (idempleados == null) {
			if (other.idempleados != null)
				return false;
		} else if (!idempleados.equals(other.idempleados))
			return false;
		if (salario == null) {
			if (other.salario != null)
				return false;
		} else if (!salario.equals(other.salario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empleado [idempleados=" + idempleados + ", categorias=" + categorias + ", departamentos="
				+ departamentos + ", codEmpleado=" + codEmpleado + ", salario=" + salario + ", fechaAlta=" + fechaAlta
				+"]";
	}

}
