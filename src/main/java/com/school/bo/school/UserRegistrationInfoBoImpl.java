package com.school.bo.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.dao.UserRegistrationInfoDaoImpl;
import com.school.model.UserRegistrationInfo;
import com.school.response.ResponseMessage;
 
@Service
public class UserRegistrationInfoBoImpl implements UserRegistrationInfoBo {

	@Autowired
	UserRegistrationInfoDaoImpl userRegistrationInfo;

	@Override
	public ResponseMessage addUser(UserRegistrationInfo newUserRegistrationInfo) {
		return userRegistrationInfo.addUserRegistrationInfo( newUserRegistrationInfo);
	}
	
}
