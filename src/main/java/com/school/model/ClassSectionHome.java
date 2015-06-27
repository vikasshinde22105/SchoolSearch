package com.school.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ClassSection.
 * @see com.ptc.model.ClassSection
 * @author Hibernate Tools
 */
@Stateless
public class ClassSectionHome {

	private static final Log log = LogFactory.getLog(ClassSectionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ClassSection transientInstance) {
		log.debug("persisting ClassSection instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ClassSection persistentInstance) {
		log.debug("removing ClassSection instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ClassSection merge(ClassSection detachedInstance) {
		log.debug("merging ClassSection instance");
		try {
			ClassSection result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ClassSection findById(Integer id) {
		log.debug("getting ClassSection instance with id: " + id);
		try {
			ClassSection instance = entityManager.find(ClassSection.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
