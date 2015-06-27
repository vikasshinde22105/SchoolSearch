package com.school.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ClassSubjects.
 * @see com.ptc.model.ClassSubjects
 * @author Hibernate Tools
 */
@Stateless
public class ClassSubjectsHome {

	private static final Log log = LogFactory.getLog(ClassSubjectsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ClassSubjects transientInstance) {
		log.debug("persisting ClassSubjects instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ClassSubjects persistentInstance) {
		log.debug("removing ClassSubjects instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ClassSubjects merge(ClassSubjects detachedInstance) {
		log.debug("merging ClassSubjects instance");
		try {
			ClassSubjects result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ClassSubjects findById(Integer id) {
		log.debug("getting ClassSubjects instance with id: " + id);
		try {
			ClassSubjects instance = entityManager
					.find(ClassSubjects.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
