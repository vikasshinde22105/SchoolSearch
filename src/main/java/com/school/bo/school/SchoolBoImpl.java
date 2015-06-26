package com.school.bo.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.custom.pojo.SchoolListingRequest;
import com.school.dao.SchoolDaoImpl;
import com.school.model.School;
import com.school.model.SchoolList;
 
@Service
public class SchoolBoImpl implements SchoolBo {

	@Autowired
	SchoolDaoImpl schoolhome;

	public List<School> fetchAllSchool() {
	        List<School> fetchedSchool = schoolhome.fetchAll();
	        return fetchedSchool;
	}

	public School fetchSchoolById(int schoolId) {
		School fetchedSchool = schoolhome.fetchById(schoolId);
        return fetchedSchool;
	}

	public List<School> fetchSchoolByName(String name) {
		System.out.println("Service"+name);
		List<School> fetchedSchool = schoolhome.fetchByName(name);
		return fetchedSchool;
	}
	
	public Map<String, List> fetchSchoolListByLattitudeByLongitude(SchoolListingRequest schoolListRequest) {
		Map<String, List> schools = schoolhome.fetchSchoolListByLattitudeByLongitude( schoolListRequest );
		return schools;
	}
	
	public Map<String, List> fetchSchoolListingFilters() {
		Map<String, List> schools = schoolhome.fetchSchoolListingFilters();
		return schools;
	}
}
