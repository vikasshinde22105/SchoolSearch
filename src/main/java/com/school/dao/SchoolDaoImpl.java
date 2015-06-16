package com.school.dao;

import java.beans.Expression;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.school.model.ClassInfo;
import com.school.model.ContactInfoExternal;
import com.school.model.ContactInfoInternal;
import com.school.model.School;
import com.school.model.SchoolBasic;
import com.school.util.HibernateUtil;

@Transactional
@Repository
public class SchoolDaoImpl implements SchoolDao{
	public SchoolDaoImpl(){
	    
	}
	 public List<SchoolBasic> fetchAll() {
	     Session session = HibernateUtil.getSessionFactory().openSession();
	        List<SchoolBasic> fetchedSchool = (List<SchoolBasic>) session.createCriteria(SchoolBasic.class).list();
	        System.out.println("DEBUG: includeAll ");
	        return fetchedSchool;
	    }

		public School fetchById(int schoolID) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        School fetchedSchool = (School) session.get(School.class, schoolID);
	        return fetchedSchool;
		}

		@Override
		public List<School> fetchByName(String name) throws InterruptedException  {

			Session session = HibernateUtil.getSessionFactory().openSession();
			FullTextSession fullTextSession = Search.getFullTextSession(session);
			fullTextSession.createIndexer().startAndWait();
			
		         
		        QueryBuilder queryBuilder = fullTextSession.getSearchFactory().buildQueryBuilder().forEntity(School.class).get();
		        org.apache.lucene.search.Query luceneQuery = queryBuilder.keyword().onFields("name","landmark").matching(name).createQuery();
		 
		        // wrap Lucene query in a javax.persistence.Query
		        org.hibernate.Query fullTextQuery = fullTextSession.createFullTextQuery(luceneQuery, School.class);
		        @SuppressWarnings("unchecked")
				List<School> contactList = fullTextQuery.list();
		        fullTextSession.close();
		        return contactList;				
		}

		@SuppressWarnings("unchecked")
		public List<SchoolBasic> fetchSchoolBasicInfo(int schoolId) {
			Session session = HibernateUtil.getSessionFactory().openSession();
//			String hql = "Select S FROM School S WHERE S.id ="+schoolId;
//			Query query = session.createQuery(hql);
//			List<School> results = query.list();
//			return results;
			Criteria cr = session.createCriteria(School.class)
				    .add(Restrictions.eq("id", schoolId));
//				    .setProjection(Projections.projectionList()
//				      .add(Projections.property("id"), "id")
//				      .add(Projections.property("name"), "name"))
//				    .setResultTransformer(Transformers.aliasToBean(SchoolBasic.class));

				  List<SchoolBasic> studentBasicInfo = cr.list();
				  return studentBasicInfo;
		}
 
}
