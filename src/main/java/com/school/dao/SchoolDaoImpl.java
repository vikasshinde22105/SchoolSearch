package com.school.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.school.custom.pojo.SchoolListingRequest;
import com.school.model.School;
import com.school.model.SchoolSearch;
import com.school.util.HibernateUtil;

@Transactional
@Repository
public class SchoolDaoImpl implements SchoolDao{
	public SchoolDaoImpl(){
	    
	}
//	public List<School> fetchAll() {
//		 Session session = HibernateUtil.getSessionFactory().openSession();
//		 List<School> fetchedSchool = (List<School>) session.createCriteria(School.class).list();
//		 return fetchedSchool;
//    }
	
	public List<SchoolSearch> fetchAll() {
		 Session session = HibernateUtil.getSessionFactory().openSession();
		 List<SchoolSearch> fetchedSchool = (List<SchoolSearch>) session.createCriteria(SchoolSearch.class).list();
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
		public List<School> fetchSchoolBasicInfo(int schoolId) {
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

				  List<School> studentBasicInfo = cr.list();
				  return studentBasicInfo;
		}

	@Override
	public Map<String, List> fetchSchoolListByLattitudeByLongitude( SchoolListingRequest schoolListRequest) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		String queryJoin = "";
		String queryCondition = "";
		if(schoolListRequest.getStandardId() != null) {
			queryCondition += " AND ci.standardType = " + schoolListRequest.getStandardId();
			queryJoin += " JOIN s.classInfos ci ";
		}
		
		if(schoolListRequest.getBoardTypeId() != null) {
			queryCondition += " AND bt.id = " + schoolListRequest.getBoardTypeId();
		}
		
		if(schoolListRequest.getSchoolTypeId() != null) {
			queryCondition += " AND si.schoolType.id = " + schoolListRequest.getSchoolTypeId();
		}
		
		if(schoolListRequest.getSchoolMediumId() != null) {
			queryCondition += " AND sm.mediumType.id = " + schoolListRequest.getSchoolMediumId();
		}
		
		if(schoolListRequest.getGenderId() != null) {
			queryCondition += " AND sct.id = " + schoolListRequest.getGenderId();
		}
		
		if(schoolListRequest.getSafetyFacilities() != null) {
			String safetyFacilities = String.join(",", schoolListRequest.getSafetyFacilities());
			queryCondition = " AND sc.id in( " + safetyFacilities + ")";
			queryJoin += " JOIN s.schoolSafetyCatItems ssci JOIN ssci.safetyCategoryItem sci JOIN sci.safetyCategory sc";
		}
		
		if(schoolListRequest.getActivityFacilities() != null) {
			String activityFacilities = String.join(",", schoolListRequest.getActivityFacilities());
			queryCondition = " AND ac.id in( " + activityFacilities + ")";
			queryJoin += " JOIN s.schoolActivityCatItems saci JOIN saci.activityCategoryItem aci JOIN aci.activityCategory ac";
		}
		
		if(schoolListRequest.getInfraFacilities() != null) {
			String infraFacilities = String.join(",", schoolListRequest.getInfraFacilities());
			queryCondition = " AND ic.id in( " + infraFacilities + ")";
			queryJoin += " JOIN s.schoolInfrastructureCatItems sici JOIN sici.infrastructureCategoryItem ici JOIN ici.infrastructureCategory ic";
		}
		
		Query query = session.createQuery("SELECT s.id as id, s.name as name, l.name as locality, c.name as city, "
				+ " mt.title as medium_type, bt.boardName as board, sct.name as school_category, sr.rating as school_rating "
				+ " FROM School s join s.locality l"
				+ " JOIN l.city c"
				+ " JOIN s.schoolMediums sm"
				+ " JOIN sm.mediumType mt "
				+ " JOIN s.schoolBoards sb "
				+ " JOIN sb.boardType bt "
				+ " JOIN s.schoolInfos si "
				+ " JOIN si.schoolCategoryType sct "
				+ " JOIN s.schoolRatings sr " + queryJoin
				+ " WHERE 8250 *  "
				+ " ACOS(COS( RADIANS(" + schoolListRequest.getLattitude() + ") ) * COS( RADIANS( s.latitude ) ) * " 
				+ " COS(RADIANS( s.longitude ) - RADIANS(" + schoolListRequest.getLongitude() + ") ) "
				+ " + SIN(RADIANS("+ schoolListRequest.getLattitude() +")) * SIN(RADIANS(s.latitude)) ) < 3 " + queryCondition )
				.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

		Map<String, List> filterMap = new HashMap<String, List>();
		filterMap.put("schools", query.list());
		filterMap.put("selectedSafetyFacilities", schoolListRequest.getSafetyFacilities());
		filterMap.put("selectedActivityFacilities", schoolListRequest.getActivityFacilities());
		filterMap.put("selectedInfraFacilities", schoolListRequest.getInfraFacilities());
		return filterMap;
	}
	
	@Override
	public Map<String, List> fetchSchoolListingFilters() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Query schoolTypesQuery = session.createQuery("SELECT st.id as school_type_id, st.name as school_type_name FROM SchoolType st ")
				.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		
		Query boardTypesQuery = session.createQuery("SELECT bt.id as board_type_id, bt.boardName as board_name FROM BoardType bt ")
				.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		
		Query mediumTypesQuery = session.createQuery("SELECT mt.id as medium_id, mt.title as medium_title FROM MediumType mt ")
				.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		
		Query activityCategoryQuery = session.createQuery("SELECT ac.id as id, ac.name as name FROM ActivityCategory ac ")
				.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		
		Query safetyCategoryQuery = session.createQuery("SELECT sc.id as id, sc.name as name FROM SafetyCategory sc ")
				.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		
		Query infraCategoryQuery = session.createQuery("SELECT ic.id as id, ic.name as name FROM InfrastructureCategory ic ")
				.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		
		Query schoolCategoryTypeQuery = session.createQuery("SELECT sct.id as id, sct.name as name FROM SchoolCategoryType sct ")
				.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		
		Map<String, List> filterMap = new HashMap<String, List>();
		filterMap.put("schoolTypes", schoolTypesQuery.list());
		filterMap.put("boardTypes", boardTypesQuery.list());
		filterMap.put("mediumTypes", mediumTypesQuery.list());
		filterMap.put("activityFacilities", activityCategoryQuery.list());
		filterMap.put("safetyFacilities", safetyCategoryQuery.list());
		filterMap.put("infraFacilities", infraCategoryQuery.list());
		filterMap.put("schoolCategoryTypes", schoolCategoryTypeQuery.list());
		return filterMap;
	}
}
