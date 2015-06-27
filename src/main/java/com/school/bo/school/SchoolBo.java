package com.school.bo.school;

import java.util.List;
import java.util.Map;

import com.school.custom.pojo.SchoolListingRequest;
import com.school.model.School;

public interface SchoolBo {
	public List<School> fetchAllSchool();
	public School fetchSchoolById(int schoolId);
	public List<School> fetchSchoolByName(String name) throws InterruptedException;
	public List<School> fetchSchoolBasicInfo(int schoolId);
	public Map<String, List> fetchSchoolListByLattitudeByLongitude(SchoolListingRequest schoolListRequest);
	public Map<String, List> fetchSchoolListingFilters(); 
}
