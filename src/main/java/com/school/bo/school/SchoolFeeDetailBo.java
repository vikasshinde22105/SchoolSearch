package com.school.bo.school;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.dao.SchoolDaoImpl;
import com.school.dao.SchoolFeeDao;
import com.school.model.School;
import com.school.model.SchoolFeeDetail;

@Service
public class SchoolFeeDetailBo {
	
	@Autowired
	SchoolFeeDao schoolhome;

	public List<SchoolFeeDetail> fetchSchoolFeeInfo(int schoolId) {
		 List<SchoolFeeDetail> fetchedSchool = schoolhome.fetchSchoolFeeInfo(schoolId);
	        return fetchedSchool;
	}

}
