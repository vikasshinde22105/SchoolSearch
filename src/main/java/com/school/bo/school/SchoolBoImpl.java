package com.school.bo.school;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.dao.SchoolDaoImpl;
import com.school.model.ContactInfoExternal;
import com.school.model.ContactInfoInternal;
import com.school.model.School;
import com.school.model.SchoolBasic;
 
@Service
public class SchoolBoImpl implements SchoolBo {

	@Autowired
	SchoolDaoImpl schoolhome;

	public List<SchoolBasic> fetchAllSchool() {
	        List<SchoolBasic> fetchedSchool = schoolhome.fetchAll();
	        return fetchedSchool;
	}

	public School fetchSchoolById(int schoolId) {
		School fetchedSchool = schoolhome.fetchById(schoolId);
        return fetchedSchool;
	}

	public List<School> fetchSchoolByName(String name) throws InterruptedException {
		System.out.println("Service"+name);
		List<School> fetchedSchool = schoolhome.fetchByName(name);
		 List<School> schoolList = new ArrayList<School>();

		 for (School school : fetchedSchool) {
	        	School setSchool = new School();
	        	setSchool.setName(school.getName());
	        	setSchool.setId(school.getId());
	        	setSchool.setLandmark(school.getLandmark());
	        	setSchool.setAboutSchool(school.getAboutSchool());
	        	schoolList.add(setSchool);

	        }

		return schoolList;
	}

	@Override
	public List<SchoolBasic> fetchSchoolBasicInfo(int schoolId) {
		 List<SchoolBasic> fetchedSchool = schoolhome.fetchSchoolBasicInfo(schoolId);
	        return fetchedSchool;
	}
	
}
