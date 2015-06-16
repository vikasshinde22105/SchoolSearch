package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 

import com.school.bo.school.ClassBasicBo;
import com.school.model.ClassInfo;

@Controller
@RequestMapping("")
public class ClassBasicController {

	@Autowired
	ClassBasicBo classBasicBo;
	
	

	@RequestMapping(value = "/school/{schoolId}/class", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<ClassInfo> fetchAllClass(@PathVariable int schoolId) {
        return classBasicBo.fetchAll(schoolId);
    }

    @RequestMapping(value = "/school/{schoolId}/class/{classId}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ClassInfo fetchClassById(@PathVariable int classId) {
         ClassInfo info= classBasicBo.fetchById(classId);
         System.out.println("Data"+info.getClassSubjectses());
         return info;
         
    }

}
