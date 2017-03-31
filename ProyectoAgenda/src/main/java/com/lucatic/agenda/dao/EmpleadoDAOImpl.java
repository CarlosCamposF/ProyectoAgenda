package com.lucatic.agenda.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.lucatic.agenda.beans.Empleado;

public class EmpleadoDAOImpl extends EmpleadoDAO{
	private SessionFactory sessionFactory;

	public  EmpleadoDAOImpl() {

	}

	public EmpleadoDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Empleado> list() {
		@SuppressWarnings("unchecked")
		List<Empleado> listDepartamento = (List<Empleado>) sessionFactory.getCurrentSession().createCriteria(Empleado.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listDepartamento;
	}

	@Override
	@Transactional
	public void saveOrUpdate(Empleado item) {
		sessionFactory.getCurrentSession().saveOrUpdate(item);
	}

	@Override
	@Transactional
	public void delete(int id) {
		Empleado userToDelete = new Empleado();
		userToDelete.setIdempleados(id);
		sessionFactory.getCurrentSession().delete(userToDelete);
	}

	@Override
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
}
