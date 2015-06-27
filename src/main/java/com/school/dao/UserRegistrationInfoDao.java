package com.school.dao;

import com.school.model.UserRegistrationInfo;
import com.school.response.ResponseMessage;

public interface UserRegistrationInfoDao {
	 public ResponseMessage addUserRegistrationInfo(UserRegistrationInfo userRegistrationInfo);
}
