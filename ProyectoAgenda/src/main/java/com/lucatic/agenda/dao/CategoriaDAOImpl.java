package com.lucatic.agenda.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lucatic.agenda.beans.Categoria;



public class CategoriaDAOImpl implements CategoriaDAO{
	@Autowired
	private SessionFactory sessionFactory;

	public CategoriaDAOImpl() {

	}

	public CategoriaDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@Transactional
	public List<Categoria> list() {
		@SuppressWarnings("unchecked")
		List<Categoria> listUser = (List<Categoria>) sessionFactory.getCurrentSession().createCriteria(Categoria.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listUser;
	}

	
	@Transactional
	public void saveOrUpdate(Categoria item) {
		sessionFactory.getCurrentSession().saveOrUpdate(item);
	}

	
	@Transactional
	public void delete(int id) {
		Categoria userToDelete = new Categoria();
		userToDelete.setIdcategorias(id);
		sessionFactory.getCurrentSession().delete(userToDelete);
	}

	
	@Transactional
	public Categoria get(int id) {
		String hql = "from categoria where idcategorias=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Categoria> listPersona = (List<Categoria>) query.list();

		if (listPersona != null && !listPersona.isEmpty()) {
			return listPersona.get(0);
		}

		return null;
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}
}
