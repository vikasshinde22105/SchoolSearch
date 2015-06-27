package com.school.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SchoolCategoryOptionFeature.
 * @see com.ptc.model.SchoolCategoryOptionFeature
 * @author Hibernate Tools
 */
@Stateless
public class SchoolCategoryOptionFeatureHome {

	private static final Log log = LogFactory
			.getLog(SchoolCategoryOptionFeatureHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SchoolCategoryOptionFeature transientInstance) {
		log.debug("persisting SchoolCategoryOptionFeature instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SchoolCategoryOptionFeature persistentInstance) {
		log.debug("removing SchoolCategoryOptionFeature instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SchoolCategoryOptionFeature merge(
			SchoolCategoryOptionFeature detachedInstance) {
		log.debug("merging SchoolCategoryOptionFeature instance");
		try {
			SchoolCategoryOptionFeature result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchoolCategoryOptionFeature findById(Integer id) {
		log.debug("getting SchoolCategoryOptionFeature instance with id: " + id);
		try {
			SchoolCategoryOptionFeature instance = entityManager.find(
					SchoolCategoryOptionFeature.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
