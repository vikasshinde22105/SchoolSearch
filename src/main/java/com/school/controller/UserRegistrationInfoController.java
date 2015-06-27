package com.school.controller;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.school.bo.school.UserRegistrationInfoBoImpl;
import com.school.model.UserRegistrationInfo;
import com.school.response.ResponseMessage;

@Component
@Controller
@RequestMapping("/user")
public class UserRegistrationInfoController
{
	@Autowired
	UserRegistrationInfoBoImpl userRegistration;
   
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping( value="/add", method= RequestMethod.POST, produces=MediaType.APPLICATION_JSON )
	@ResponseBody
	public ResponseMessage addUser() {

		UserRegistrationInfo userRegistrationInfo = new UserRegistrationInfo();
		userRegistrationInfo.setFirstName(request.getParameter("firstName"));
		userRegistrationInfo.setLastName(request.getParameter("lastName"));
		userRegistrationInfo.setMobile(request.getParameter("mobile"));
		userRegistrationInfo.setEmail(request.getParameter("email"));
		userRegistrationInfo.setPassword(request.getParameter("password"));
		ResponseMessage responseMessage = userRegistration.addUser(userRegistrationInfo);
		return responseMessage;
	}
}
