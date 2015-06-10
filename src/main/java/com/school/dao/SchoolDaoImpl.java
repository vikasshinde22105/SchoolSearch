package com.school.dao;

import java.beans.Expression;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

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

}
