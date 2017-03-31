package com.lucatic.agenda.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.lucatic.agenda.beans.Empleado;
import com.lucatic.agenda.beans.Persona;

public class EmpleadoDAOImpl implements EmpleadoDAO{
	private SessionFactory sessionFactory;

	public  EmpleadoDAOImpl() {

	}

	public EmpleadoDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@Transactional
	public List<Empleado> list() {
		@SuppressWarnings("unchecked")
		List<Empleado> listDepartamento = (List<Empleado>) sessionFactory.getCurrentSession().createCriteria(Empleado.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listDepartamento;
	}

	
	@Transactional
	public void saveOrUpdate(Empleado item) {
		sessionFactory.getCurrentSession().saveOrUpdate(item);
	}

	
	@Transactional
	public void delete(int id) {
		Empleado userToDelete = new Empleado();
		userToDelete.setIdempleados(id);
		sessionFactory.getCurrentSession().delete(userToDelete);
	}

	
	@Transactional
	public Empleado get(int id) {
		String hql = "from empleados where idempleado=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Empleado> listEmpleado = (List<Empleado>) query.list();

		if (listEmpleado != null && !listEmpleado.isEmpty()) {
			return listEmpleado.get(0);
		}

		return null;
	}

	

	public List<Empleado> getDep(String dep) {
		String hql = "from empleados a, departamentos b where a.idDepartamento=b.iddepartamento b.nombre like %" + dep+"%";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Empleado> listEmpleado = (List<Empleado>) query.list();

		if (listEmpleado != null && !listEmpleado.isEmpty()) {
			return listEmpleado;
		}

		return null;
	}

	public List<Empleado> getCat(String cat) {
		String hql = "from empleados a, categorias b where a.idCategoria=b.idcategorias b.nombre like %" + cat+"%";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Empleado> listEmpleado = (List<Empleado>) query.list();

		if (listEmpleado != null && !listEmpleado.isEmpty()) {
			return listEmpleado;
		}
		return null;
	}

	public List<Empleado> getSalario(int salario1, int salario2) {
		String hql = "from empleados where salario between "+salario1+" AND "+salario2 ;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Empleado> listEmpleado = (List<Empleado>) query.list();

		if (listEmpleado != null && !listEmpleado.isEmpty()) {
			return listEmpleado;
		}
		return null;
	}
	
	public void close() {
		// TODO Auto-generated method stub
		
	}
}
