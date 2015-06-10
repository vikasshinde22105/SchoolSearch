package com.school.controller;

import java.util.List;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.school.bo.school.SchoolBoImpl;
import com.school.dao.SchoolDaoImpl;
import com.school.errorhandling.WebServiceException;
import com.school.model.School;

@Controller
@RequestMapping("/school")
public class SchoolController// extends ExceptionHandlerController
{
	@Autowired
	SchoolBoImpl schoolhome;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
     public List<School> fetchAll() {
	        System.out.println("SchoolDao: fetchAll");
	        List<School> fetchedSchool = schoolhome.fetchAllSchool();
	        return fetchedSchool;
	    }
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public School fetchById(@PathVariable int id) throws WebServiceException {
		School fetchedSchool = schoolhome.fetchSchoolById(id);
		if(fetchedSchool==null){
			   throw new WebServiceException("NOT FOUND");
		}
		return fetchedSchool;
	}
	
	@RequestMapping(value = "/search/{name}" , method = RequestMethod.GET , produces = "application/json")
	@ResponseBody
	public List<School> fetchByName(@PathVariable String name) {
		System.out.println("Search"+name);
		List<School> fetchedSchool = schoolhome.fetchSchoolByName(name);
		return fetchedSchool;
	}
}
