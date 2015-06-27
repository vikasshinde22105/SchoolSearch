package com.school.custom.pojo;

import java.util.List;

public class SchoolListingRequest {
	String longitude;
	String lattitude;
	Integer standardId;
	Integer boardTypeId;
	Integer schoolTypeId;
	Integer schoolMediumId;
	Integer genderId;
	List<String> safetyFacilities;
	List<String> activityFacilities;
	List<String> infraFacilities;

	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLattitude() {
		return lattitude;
	}
	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}
	public Integer getStandardId() {
		return standardId;
	}
	public void setStandardId(Integer standardId) {
		this.standardId = standardId;
	}
	public Integer getBoardTypeId() {
		return boardTypeId;
	}
	public void setBoardTypeId(Integer boardTypeId) {
		this.boardTypeId = boardTypeId;
	}
	public Integer getSchoolTypeId() {
		return schoolTypeId;
	}
	public void setSchoolTypeId(Integer schoolTypeId) {
		this.schoolTypeId = schoolTypeId;
	}
	public Integer getSchoolMediumId() {
		return schoolMediumId;
	}
	public void setSchoolMediumId(Integer schoolMediumId) {
		this.schoolMediumId = schoolMediumId;
	}
	public Integer getGenderId() {
		return genderId;
	}
	public void setGenderId(Integer genderId) {
		this.genderId = genderId;
	}

	public List<String> getSafetyFacilities() {
		return safetyFacilities;
	}
	public void setSafetyFacilities(List<String> safetyFacilities) {
		this.safetyFacilities = safetyFacilities;
	}
	public List<String> getActivityFacilities() {
		return activityFacilities;
	}
	public void setActivityFacilities(List<String> activityFacilities) {
		this.activityFacilities = activityFacilities;
	}
	public List<String> getInfraFacilities() {
		return infraFacilities;
	}
	public void setInfraFacilities(List<String> infraFacilities) {
		this.infraFacilities = infraFacilities;
	}

}
