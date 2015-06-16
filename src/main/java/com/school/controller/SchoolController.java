package com.school.controller;

 import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

 import com.school.bo.school.SchoolBoImpl;
import com.school.errorhandling.WebServiceException;
import com.school.model.ContactInfoInternal;
import com.school.model.School;
import com.school.model.SchoolBasic;

@Controller
@RequestMapping("/school")
public class SchoolController// extends ExceptionHandlerController
{
	@Autowired
	SchoolBoImpl schoolhome;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
     public List<SchoolBasic> fetchAll() {
	        System.out.println("SchoolDao: fetchAll");
	        List<SchoolBasic> fetchedSchool = schoolhome.fetchAllSchool();
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
	public List<School> fetchByName(@PathVariable String name) throws InterruptedException {
		List<School> fetchedSchool = schoolhome.fetchSchoolByName(name);
		return fetchedSchool;
	}
	
	@RequestMapping(value = "/basic/{schoolId}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
     public List<SchoolBasic> fetchBasicInfo(@PathVariable int schoolId) {
	        return schoolhome.fetchSchoolBasicInfo(schoolId);
	    }
	
 
}
