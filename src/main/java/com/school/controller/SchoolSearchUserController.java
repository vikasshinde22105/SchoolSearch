package com.school.controller;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.school.bo.school.SchoolSearchUserBoImpl;
import com.school.model.SchoolSearchUser;
import com.school.response.ResponseMessage;

@Component
@Controller
@RequestMapping("/user")
public class SchoolSearchUserController
{
	@Autowired
	SchoolSearchUserBoImpl userRegistration;
   
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping( value="/add", method= RequestMethod.POST, produces=MediaType.APPLICATION_JSON )
	@ResponseBody
	public ResponseMessage addUser( @RequestBody SchoolSearchUser schoolSearchUser ) {

		ResponseMessage responseMessage = userRegistration.addUser(schoolSearchUser);
		return responseMessage;
	}
}
