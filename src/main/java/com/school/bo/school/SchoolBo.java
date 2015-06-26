package com.school.bo.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.school.custom.pojo.SchoolListingRequest;
import com.school.model.School;
import com.school.model.SchoolList;

public interface SchoolBo {
	public List<School> fetchAllSchool();
	public School fetchSchoolById(int schoolId);
	public List<School> fetchSchoolByName(String name);
	public Map<String, List> fetchSchoolListByLattitudeByLongitude(SchoolListingRequest schoolListRequest);
	public Map<String, List> fetchSchoolListingFilters();
}
