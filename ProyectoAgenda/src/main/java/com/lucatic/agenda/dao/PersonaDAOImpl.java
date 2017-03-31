package com.lucatic.agenda.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lucatic.agenda.beans.Persona;

public class PersonaDAOImpl extends PersonaDAO{
	@Autowired
	private SessionFactory sessionFactory;

	public PersonaDAOImpl() {

	}

	public PersonaDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Persona> list() {
		@SuppressWarnings("unchecked")
		List<Persona> listUser = (List<Persona>) sessionFactory.getCurrentSession().createCriteria(Persona.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listUser;
	}

	@Override
	@Transactional
	public void saveOrUpdate(Persona item) {
		sessionFactory.getCurrentSession().saveOrUpdate(item);
	}

	@Override
	@Transactional
	public void delete(int id) {
		Persona userToDelete = new Persona();
		userToDelete.setIdpersonas(id);
		sessionFactory.getCurrentSession().delete(userToDelete);
	}

	@Override
	@Transactional
	public Persona get(int id) {
		String hql = "from personas where idpersonas=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Persona> listPersona = (List<Persona>) query.list();

		if (listPersona != null && !listPersona.isEmpty()) {
			return listPersona.get(0);
		}

		return null;
	}
}
