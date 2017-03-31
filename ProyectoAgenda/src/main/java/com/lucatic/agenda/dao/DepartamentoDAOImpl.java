package com.lucatic.agenda.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import com.lucatic.agenda.beans.Departamento;


public class DepartamentoDAOImpl implements DepartamentoDAO{
	
	private SessionFactory sessionFactory;

	public  DepartamentoDAOImpl() {

	}

	public DepartamentoDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Transactional
	public List<Departamento> list() {
		@SuppressWarnings("unchecked")
		List<Departamento> listDepartamento = (List<Departamento>) sessionFactory.getCurrentSession().createCriteria(Departamento.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listDepartamento;
	}

	@Transactional
	public void saveOrUpdate(Departamento item) {
		sessionFactory.getCurrentSession().saveOrUpdate(item);
	}

	
	@Transactional
	public void delete(int id) {
		Departamento userToDelete = new Departamento();
		userToDelete.setIddepartamento(id);
		sessionFactory.getCurrentSession().delete(userToDelete);
	}

	
	@Transactional
	public Departamento get(int id) {
		String hql = "from departamentos where iddepartamento=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Departamento> listDepartamento = (List<Departamento>) query.list();

		if (listDepartamento != null && !listDepartamento.isEmpty()) {
			return listDepartamento.get(0);
		}

		return null;
	}

	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
