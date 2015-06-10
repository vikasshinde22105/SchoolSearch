package com.school.bo.school;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.dao.SchoolDaoImpl;
import com.school.model.School;
 
@Service
public class SchoolBoImpl  {

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
	

}
