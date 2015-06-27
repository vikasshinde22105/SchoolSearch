package com.school.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SchoolBus.
 * @see com.ptc.model.SchoolBus
 * @author Hibernate Tools
 */
@Stateless
public class SchoolBusHome {

	private static final Log log = LogFactory.getLog(SchoolBusHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SchoolBus transientInstance) {
		log.debug("persisting SchoolBus instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SchoolBus persistentInstance) {
		log.debug("removing SchoolBus instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SchoolBus merge(SchoolBus detachedInstance) {
		log.debug("merging SchoolBus instance");
		try {
			SchoolBus result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchoolBus findById(Integer id) {
		log.debug("getting SchoolBus instance with id: " + id);
		try {
			SchoolBus instance = entityManager.find(SchoolBus.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
