package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.school.bo.school.SchoolBoImpl;
import com.school.dao.SchoolDaoImpl;
import com.school.model.School;

@Controller
@RequestMapping("/school")
public class SchoolController {
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
    public School fetchById(int id) {
		School fetchedSchool = schoolhome.fetchSchoolById(id);
        return fetchedSchool;
	}

}
