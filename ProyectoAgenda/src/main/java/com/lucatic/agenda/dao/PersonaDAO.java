package com.lucatic.agenda.dao;
// Generated 30-mar-2017 13:56:25 by Hibernate Tools 5.1.0.Alpha1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.lucatic.agenda.beans.Persona;

/**
 * Home object for domain model class Personas.
 * @see com.lucatic.agenda.dao.Personas
 * @author Hibernate Tools
 */
public class PersonaDAO {

	private static final Log log = LogFactory.getLog(PersonaDAO.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Persona transientInstance) {
		log.debug("persisting Personas instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Persona instance) {
		log.debug("attaching dirty Personas instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Persona instance) {
		log.debug("attaching clean Personas instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Persona persistentInstance) {
		log.debug("deleting Personas instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Persona merge(Persona detachedInstance) {
		log.debug("merging Personas instance");
		try {
			Persona result = (Persona) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Persona findById(java.lang.Integer id) {
		log.debug("getting Personas instance with id: " + id);
		try {
			Persona instance = (Persona) sessionFactory.getCurrentSession().get("com.lucatic.agenda.dao.Personas",
					id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Persona instance) {
		log.debug("finding Personas instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.lucatic.agenda.dao.Personas")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
