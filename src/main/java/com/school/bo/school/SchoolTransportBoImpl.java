package com.school.bo.school;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.dao.SchoolTransportDaoImpl;
import com.school.model.BusInfo;
import com.school.model.SchoolBus;

@Service
public class SchoolTransportBoImpl implements SchoolTransportBo {

	@Autowired
	SchoolTransportDaoImpl schoolTransport;
	@Override
	public List<BusInfo> fetchSchoolTransportDetails(int schoolId) {
		 List<BusInfo> fetchedClass = schoolTransport.fetchSchoolTransportDetails(schoolId);
	        return fetchedClass;		
	}
	public List<SchoolBus> fetchSchoolTransport(int schoolId) {
		 List<SchoolBus> fetchedClass = schoolTransport.fetchSchoolTransport(schoolId);
	        return fetchedClass;		
	
	}

}
