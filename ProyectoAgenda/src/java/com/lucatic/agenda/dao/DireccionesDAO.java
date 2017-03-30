package com.lucatic.agenda.dao;
// Generated 30-mar-2017 13:56:25 by Hibernate Tools 5.1.0.Alpha1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Direcciones.
 * @see com.lucatic.agenda.dao.Direcciones
 * @author Hibernate Tools
 */
public class DireccionesHome {

	private static final Log log = LogFactory.getLog(DireccionesHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Direcciones transientInstance) {
		log.debug("persisting Direcciones instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Direcciones instance) {
		log.debug("attaching dirty Direcciones instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Direcciones instance) {
		log.debug("attaching clean Direcciones instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Direcciones persistentInstance) {
		log.debug("deleting Direcciones instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Direcciones merge(Direcciones detachedInstance) {
		log.debug("merging Direcciones instance");
		try {
			Direcciones result = (Direcciones) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Direcciones findById(java.lang.Integer id) {
		log.debug("getting Direcciones instance with id: " + id);
		try {
			Direcciones instance = (Direcciones) sessionFactory.getCurrentSession()
					.get("com.lucatic.agenda.dao.Direcciones", id);
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

	public List findByExample(Direcciones instance) {
		log.debug("finding Direcciones instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.lucatic.agenda.dao.Direcciones")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
