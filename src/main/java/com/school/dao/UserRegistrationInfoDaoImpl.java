package com.school.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.school.model.UserRegistrationInfo;
import com.school.response.ResponseMessage;
import com.school.util.HibernateUtil;

@Repository
public class UserRegistrationInfoDaoImpl implements UserRegistrationInfoDao {

	public ResponseMessage addUserRegistrationInfo( UserRegistrationInfo userRegistrationInfo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx;
        tx = session.beginTransaction();
        ResponseMessage responseMessage = new ResponseMessage();
        try {
        	session.save("UserRegistrationInfo",userRegistrationInfo );
        	tx.commit();
        	session.flush();
        	responseMessage.setStatus(true);
        	responseMessage.setDescription("User Registered successfully.");
	    } catch(javax.validation.ConstraintViolationException e) {
	    	ArrayList<String> errors = new ArrayList<String>();
	    	Set<ConstraintViolation<?>> s = e.getConstraintViolations();
	    	Iterator<ConstraintViolation<?>> i = s.iterator();
	    	while (i.hasNext()) {
	    		ConstraintViolation<?> cv = i.next();
	    		errors.add(cv.getMessage());
	    	}
	    	responseMessage.setStatus(false);
        	responseMessage.setDescription("User registration failed.");
	    	responseMessage.setErrors(errors);
	    }    
	    session.close();
	    return responseMessage;
	}

}
