package com.school.dao;

import java.util.List;
import java.util.Map;

import com.school.custom.pojo.SchoolListingRequest;
import com.school.model.School;
import com.school.model.SchoolBasic;

public interface SchoolDao {
 	 public List<SchoolBasic> fetchAll();
	 public School fetchById(int schoolID);
	 public List<School> fetchByName(String name) throws InterruptedException;
	 public List<SchoolBasic> fetchSchoolBasicInfo(int schoolId);
	 public Map<String, List> fetchSchoolListByLattitudeByLongitude(SchoolListingRequest schoolListRequest);
	 public Map<String, List> fetchSchoolListingFilters();
}
