package com.school.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ClassInfo.
 * @see com.ptc.model.ClassInfo
 * @author Hibernate Tools
 */
@Stateless
public class ClassInfoHome {

	private static final Log log = LogFactory.getLog(ClassInfoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ClassInfo transientInstance) {
		log.debug("persisting ClassInfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ClassInfo persistentInstance) {
		log.debug("removing ClassInfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ClassInfo merge(ClassInfo detachedInstance) {
		log.debug("merging ClassInfo instance");
		try {
			ClassInfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ClassInfo findById(Integer id) {
		log.debug("getting ClassInfo instance with id: " + id);
		try {
			ClassInfo instance = entityManager.find(ClassInfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
