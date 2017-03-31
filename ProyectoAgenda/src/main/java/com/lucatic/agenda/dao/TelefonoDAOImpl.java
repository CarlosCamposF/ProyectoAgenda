package com.lucatic.agenda.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.lucatic.agenda.beans.Telefono;

public class TelefonoDAOImpl extends TelefonoDAO{
	private SessionFactory sessionFactory;

	public TelefonoDAOImpl() {

	}

	public TelefonoDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Telefono> list() {
		@SuppressWarnings("unchecked")
		List<Telefono> listDepartamento = (List<Telefono>) sessionFactory.getCurrentSession().createCriteria(Telefono.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listDepartamento;
	}

	@Override
	@Transactional
	public void saveOrUpdate(Telefono item) {
		sessionFactory.getCurrentSession().saveOrUpdate(item);
	}

	@Override
	@Transactional
	public void delete(int id) {
		Telefono userToDelete = new Telefono();
		userToDelete.setIdtelefonos(id);
		sessionFactory.getCurrentSession().delete(userToDelete);
	}

	@Override
	@Transactional
	public Telefono get(int id) {
		String hql = "from telefonos where idtelefonos=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Telefono> listTelefono = (List<Telefono>) query.list();

		if (listTelefono != null && !listTelefono.isEmpty()) {
			return listTelefono.get(0);
		}

		return null;
	}
}