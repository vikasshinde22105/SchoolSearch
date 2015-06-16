package com.school.dao;

import java.util.List;

import com.school.model.ContactInfoExternal;
import com.school.model.ContactInfoInternal;
import com.school.model.School;
import com.school.model.SchoolBasic;

public interface SchoolDao {
 	 public List<SchoolBasic> fetchAll();
	 public School fetchById(int schoolID);
	 public List<School> fetchByName(String name) throws InterruptedException;
	 public List<SchoolBasic> fetchSchoolBasicInfo(int schoolId);
}
