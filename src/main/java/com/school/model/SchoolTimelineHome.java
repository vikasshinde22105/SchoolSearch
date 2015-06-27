package com.school.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SchoolTimeline.
 * @see com.ptc.model.SchoolTimeline
 * @author Hibernate Tools
 */
@Stateless
public class SchoolTimelineHome {

	private static final Log log = LogFactory.getLog(SchoolTimelineHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SchoolTimeline transientInstance) {
		log.debug("persisting SchoolTimeline instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SchoolTimeline persistentInstance) {
		log.debug("removing SchoolTimeline instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SchoolTimeline merge(SchoolTimeline detachedInstance) {
		log.debug("merging SchoolTimeline instance");
		try {
			SchoolTimeline result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchoolTimeline findById(Integer id) {
		log.debug("getting SchoolTimeline instance with id: " + id);
		try {
			SchoolTimeline instance = entityManager.find(SchoolTimeline.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
