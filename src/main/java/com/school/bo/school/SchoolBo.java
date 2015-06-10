package com.school.bo.school;

import java.util.List;

import com.school.model.School;

public interface SchoolBo {
	public List<School> fetchAllSchool();
	public School fetchSchoolById(int schoolId);
	public List<School> fetchSchoolByName(String name);
	
}
