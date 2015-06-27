package com.school.bo.school;

import com.school.model.UserRegistrationInfo;
import com.school.response.ResponseMessage;

public interface UserRegistrationInfoBo {
	public ResponseMessage addUser(UserRegistrationInfo userRegistrationInfo);
}
