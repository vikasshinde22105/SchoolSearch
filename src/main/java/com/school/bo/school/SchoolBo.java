package com.school.bo.school;

import java.util.List;

import com.school.model.ContactInfoExternal;
import com.school.model.ContactInfoInternal;
import com.school.model.School;
import com.school.model.SchoolBasic;

public interface SchoolBo {
	public List<SchoolBasic> fetchAllSchool();
	public School fetchSchoolById(int schoolId);
	public List<School> fetchSchoolByName(String name) throws InterruptedException;
	 public List<SchoolBasic> fetchSchoolBasicInfo(int schoolId);
 }
