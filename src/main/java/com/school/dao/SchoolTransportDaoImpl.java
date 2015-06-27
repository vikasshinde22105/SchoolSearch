package com.school.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.school.model.BusInfo;
import com.school.model.SchoolBus;

@Transactional
@Repository
public class SchoolTransportDaoImpl {

	public List<BusInfo> fetchSchoolTransportDetails(int schoolId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<SchoolBus> fetchSchoolTransport(int schoolId) {
		// TODO Auto-generated method stub
		return null;
	}

}
