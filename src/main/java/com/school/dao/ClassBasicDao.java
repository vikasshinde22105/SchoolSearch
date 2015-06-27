package com.school.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.school.model.ClassInfo;
import com.school.util.HibernateUtil;


@Transactional
@Repository
public class ClassBasicDao {

	@SuppressWarnings("unchecked")
	public List<ClassInfo> fetchAll(int schoolId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria=session.createCriteria(ClassInfo.class);
		criteria.add(Restrictions.eq("school.id", schoolId));
        return criteria.list();
    }

	public ClassInfo fetchById(int classID) {
        System.out.println("UserDAO: fetch");
        System.out.println("UserDAO: START - fetching user from the database by user ID");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        ClassInfo fetchedClass = (ClassInfo) session.get(ClassInfo.class, classID);
        System.out.println("UserDAO: END - fetching user from the database by user ID");
        return fetchedClass;
	}
	
	public List fetchSectioById(int classID , String classSectionName){
		Session session = HibernateUtil.getSessionFactory().openSession();
		String hql = "FROM ClassInfo AS E";
		Query query = session.createQuery(hql);
		List results = query.list();
		return   results;
	}

}
