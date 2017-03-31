package com.lucatic.agenda.beans;
// Generated 30-mar-2017 13:55:39 by Hibernate Tools 5.1.0.Alpha1

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
@Table (name="categorias" , catalog="agenda")
public class Categoria implements java.io.Serializable {

	private Integer idcategorias;
	private String nombre;
	private String descripcion;
	private List <Empleado>  cat_empleados= new ArrayList();
	
	
	
	public Categoria() {
		
	}
	
	public Categoria(Integer idcategorias, String nombre, String descripcion, List<Empleado> cat_empleados) {
		super();
		this.idcategorias = idcategorias;
		this.nombre = nombre;
		this.descripcion = descripcion;
		
	}

	public Integer getIdcategorias() {
		return idcategorias;
	}
	public void setIdcategorias(Integer idcategorias) {
		this.idcategorias = idcategorias;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<Empleado> getCat_empleados() {
		return cat_empleados;
	}
	public void setCat_empleados(List<Empleado> cat_empleados) {
		this.cat_empleados = cat_empleados;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cat_empleados == null) ? 0 : cat_empleados.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((idcategorias == null) ? 0 : idcategorias.hashCode());
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
		Categoria other = (Categoria) obj;
		if (cat_empleados == null) {
			if (other.cat_empleados != null)
				return false;
		} else if (!cat_empleados.equals(other.cat_empleados))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (idcategorias == null) {
			if (other.idcategorias != null)
				return false;
		} else if (!idcategorias.equals(other.idcategorias))
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
		return "Categoria [idcategorias=" + idcategorias + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", cat_empleados=" + cat_empleados + "]";
	}

	
	
}
