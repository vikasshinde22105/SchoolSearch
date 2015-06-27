package com.school.bo.school;

import java.util.List;

import com.school.model.BusInfo;
import com.school.model.SchoolBasic;
import com.school.model.SchoolBus;

public interface SchoolTransportBo {

	public List<BusInfo> fetchSchoolTransportDetails(int schoolId);

}
