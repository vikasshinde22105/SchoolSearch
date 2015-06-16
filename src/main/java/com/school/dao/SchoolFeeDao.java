package com.school.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.school.model.SchoolFeeDetail;
import com.school.util.HibernateUtil;

@Transactional
@Repository
public class SchoolFeeDao {

	@SuppressWarnings("unchecked")
	public List<SchoolFeeDetail> fetchSchoolFeeInfo(int schoolId) {
		Session session = HibernateUtil.getSessionFactory().openSession();
//		String hql = "Select S FROM SchoolFeeDetail S WHERE S.id ="+schoolId;
//		Query query = session.createQuery(hql);
//		List<SchoolFeeDetail> results = query.list();
//		return results;
 		Criteria cr = session.createCriteria(SchoolFeeDetail.class)
			    .add(Restrictions.eq("school.id", schoolId));
			  List<SchoolFeeDetail> studentBasicInfo = cr.list();
			  return studentBasicInfo;
	}

}
