package com.school.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SchoolTimelineMilestone.
 * @see com.ptc.model.SchoolTimelineMilestone
 * @author Hibernate Tools
 */
@Stateless
public class SchoolTimelineMilestoneHome {

	private static final Log log = LogFactory
			.getLog(SchoolTimelineMilestoneHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SchoolTimelineMilestone transientInstance) {
		log.debug("persisting SchoolTimelineMilestone instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SchoolTimelineMilestone persistentInstance) {
		log.debug("removing SchoolTimelineMilestone instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SchoolTimelineMilestone merge(
			SchoolTimelineMilestone detachedInstance) {
		log.debug("merging SchoolTimelineMilestone instance");
		try {
			SchoolTimelineMilestone result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchoolTimelineMilestone findById(Integer id) {
		log.debug("getting SchoolTimelineMilestone instance with id: " + id);
		try {
			SchoolTimelineMilestone instance = entityManager.find(
					SchoolTimelineMilestone.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
