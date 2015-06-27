package com.school.dao;

import java.util.List;

import com.school.model.BusInfo;
import com.school.model.SchoolBus;

public interface SchoolTransportDao {
	public List<BusInfo> fetchSchoolTransportDetails(int schoolId) ;

	List<SchoolBus> fetchSchoolTransport(int schoolId);

}
