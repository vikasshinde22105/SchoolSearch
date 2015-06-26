package com.school.dao;

import java.util.List;
import java.util.Map;

import com.school.custom.pojo.SchoolListingRequest;
import com.school.model.School;

public interface SchoolDao {
 	 public List<School> fetchAll();
	 public School fetchById(int schoolID);
	 public List<School> fetchByName(String name);
	 public Map<String, List> fetchSchoolListByLattitudeByLongitude(SchoolListingRequest schoolListRequest);
	 public Map<String, List> fetchSchoolListingFilters();
}
