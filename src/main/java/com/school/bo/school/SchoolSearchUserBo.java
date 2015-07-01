package com.school.bo.school;

import com.school.model.SchoolSearchUser;
import com.school.response.ResponseMessage;

public interface SchoolSearchUserBo {
	public ResponseMessage addUser(SchoolSearchUser schoolSearchUser);
}
