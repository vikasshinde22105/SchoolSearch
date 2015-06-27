package com.school.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.school.bo.school.SchoolBoImpl;
import com.school.custom.pojo.SchoolListingRequest;
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
	public List<School> fetchByName(@PathVariable String name) throws InterruptedException {
		List<School> fetchedSchool = schoolhome.fetchSchoolByName(name);
		return fetchedSchool;
	}
	
	@RequestMapping(value = "/basic/{schoolId}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
     public List<School> fetchBasicInfo(@PathVariable int schoolId) {
	        return schoolhome.fetchSchoolBasicInfo(schoolId);
	    }

	@RequestMapping(value = "/searchList", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Map<String, List> fetchSchoolListByLattitudeByLongitude( @RequestBody SchoolListingRequest schoolListRequest ) {
		Map<String, List> fetchedSchool = schoolhome.fetchSchoolListByLattitudeByLongitude(schoolListRequest);
		return fetchedSchool;
	}
	
	@RequestMapping(value = "/filters" , method = RequestMethod.GET, produces = "application/json" )
	@ResponseBody
	public Map<String, List> fetchSchoolListingFilters() {
		Map<String, List> schoolSearchFilters = schoolhome.fetchSchoolListingFilters();
		return schoolSearchFilters;	
	}
}
