package com.school.dao;

import java.util.List;
import java.util.Map;

import com.school.custom.pojo.SchoolListingRequest;
import com.school.model.School;
import com.school.model.SchoolSearch;

public interface SchoolDao {
 	 public List<SchoolSearch> fetchAll();
	 public School fetchById(int schoolID);
	 public List<School> fetchByName(String name) throws InterruptedException;
	 public List<School> fetchSchoolBasicInfo(int schoolId);
	 public Map<String, List> fetchSchoolListByLattitudeByLongitude(SchoolListingRequest schoolListRequest);
	 public Map<String, List> fetchSchoolListingFilters();
}
