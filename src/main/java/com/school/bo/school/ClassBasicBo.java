package com.school.bo.school;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 

import com.school.dao.ClassBasicDao;
import com.school.model.ClassInfo;

@Service
public class ClassBasicBo {
	@Autowired
	ClassBasicDao classBasic;
	
	 public List<ClassInfo> fetchAll(int schoolId) {
	        System.out.println("SchoolDao: fetchAll");
	        List<ClassInfo> fetchedClass = classBasic.fetchAll(schoolId);
	        return fetchedClass;
	    }

	public ClassInfo fetchById(int id) {
		ClassInfo fetchedClass = classBasic.fetchById(id);
        return fetchedClass;
	}
	
	public List<ClassInfo> fetchClassSectionById(int classId, String sectionName){
		System.out.println("SectionDao");
		List<ClassInfo> fetchedSection = classBasic.fetchSectioById(classId, sectionName);
		return fetchedSection;

	}


}
