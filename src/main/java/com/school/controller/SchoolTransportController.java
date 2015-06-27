package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.school.bo.school.SchoolTransportBoImpl;
import com.school.model.BusInfo;
import com.school.model.SchoolBus;

@Controller
@RequestMapping("")
public class SchoolTransportController {

	@Autowired
	SchoolTransportBoImpl schoolTransport;
	
	@RequestMapping(value = "/school/{schoolId}/transport", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
     public List<BusInfo> fetchAll(@PathVariable int schoolId) {
	        List<BusInfo> fetchedSchool = schoolTransport.fetchSchoolTransportDetails(schoolId);
	        return fetchedSchool;
	    }
	
	@RequestMapping(value = "/school/{schoolId}/transport1", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
     public List<SchoolBus> fetchTransport(@PathVariable int schoolId) {
	        List<SchoolBus> fetchedSchool = schoolTransport.fetchSchoolTransport(schoolId);
	        return fetchedSchool;
	    }
}
