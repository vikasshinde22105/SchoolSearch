package com.school.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.school.custom.pojo.SchoolListingRequest;
import com.school.model.School;
import com.school.util.HibernateUtil;

@Transactional
@Repository
public class SchoolDaoImpl implements SchoolDao{
	 public List<School> fetchAll() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        List<School> fetchedSchool = (List<School>) session.createCriteria(School.class).list();
	        System.out.println("DEBUG: includeAll ");
	        return fetchedSchool;
	    }

		public School fetchById(int schoolID) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        School fetchedSchool = (School) session.get(School.class, schoolID);
	        return fetchedSchool;
		}

		@Override
		public List<School> fetchByName(String name) {
			/*System.out.println("Data object");
			Session session = null;
			Criteria criteria = session.createCriteria(School.class);
			//if(name){
				criteria.add(Restrictions.eq("id",name));
			//}
						criteria.addOrder(Order.asc("name"));
		 System.out.println(name+"query"+criteria.toString());
			return criteria.list();
			
			*/
			Session session = HibernateUtil.getSessionFactory().openSession();
			Criteria criteria=session.createCriteria(School.class);
					criteria.add(Restrictions.eq("name", name));
					//criteria.createAlias("classSections", "section");
				//	criteria.add(Restrictions.eq("section.name", classSectionName).ignoreCase());
					//String hql = "FROM ClassInfo AS E";
					//Query query = session.createQuery(hql);
					//List results = query.list();
					return   criteria.list();
			
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
