package com.school.bo.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.dao.SchoolSearchUserDaoImpl;
import com.school.model.SchoolSearchUser;
import com.school.model.UserRegistrationInfo;
import com.school.response.ResponseMessage;
 
@Service
public class SchoolSearchUserBoImpl implements SchoolSearchUserBo {

	@Autowired
	SchoolSearchUserDaoImpl schoolSearchUserDao;

	@Override
	public ResponseMessage addUser(SchoolSearchUser schoolSearchUser) {
		return schoolSearchUserDao.addSchoolSearchUser( schoolSearchUser);
	}
	
}
