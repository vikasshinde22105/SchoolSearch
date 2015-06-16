package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.school.bo.school.SchoolBoImpl;
import com.school.bo.school.SchoolFeeDetailBo;
import com.school.model.School;
import com.school.model.SchoolFeeDetail;

@Controller
@RequestMapping("")
public class SchoolFeeDetailsController {

	@Autowired
	SchoolFeeDetailBo schoolhome;
	
	@RequestMapping(value = "/school/{schoolId}/feeDetail", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
     public List<SchoolFeeDetail> fetchAll(@PathVariable int schoolId) {
	        List<SchoolFeeDetail> fetchedSchool = schoolhome.fetchSchoolFeeInfo(schoolId);
	        return fetchedSchool;
	    }

}
