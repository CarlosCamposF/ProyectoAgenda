package com.lucatic.agenda.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import com.lucatic.agenda.beans.Direccion;


public class DireccionesDAOImpl extends DireccionesDAO {
	private SessionFactory sessionFactory;

	public  DireccionesDAOImpl() {

	}

	public DireccionesDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Direccion> list() {
		@SuppressWarnings("unchecked")
		List<Direccion> listDepartamento = (List<Direccion>) sessionFactory.getCurrentSession().createCriteria(Direccion.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listDepartamento;
	}

	@Override
	@Transactional
	public void saveOrUpdate(Direccion item) {
		sessionFactory.getCurrentSession().saveOrUpdate(item);
	}

	@Override
	@Transactional
	public void delete(int id) {
		Direccion userToDelete = new Direccion();
		userToDelete.setIddirecciones(id);
		sessionFactory.getCurrentSession().delete(userToDelete);
	}

	@Override
	@Transactional
	public Direccion get(int id) {
		String hql = "from Direcciones where iddirecciones=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Direccion> listDireccion = (List<Direccion>) query.list();

		if (listDireccion != null && !listDireccion.isEmpty()) {
			return listDireccion.get(0);
		}

		return null;
	}
}
