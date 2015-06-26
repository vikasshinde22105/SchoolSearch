package com.school.model;

import java.util.ArrayList;

public class SchoolList {

	Integer id;
	String name;
	String locality;
	String city;
	ArrayList<String> schoolMediums;
	ArrayList<String> schoolBoards;
	ArrayList<Float> schoolFees;
	Integer vacantSeats;

	public Integer getVacantSeats() {
		return vacantSeats;
	}
	public void setVacantSeats(Integer vacantSeats) {
		this.vacantSeats = vacantSeats;
	}
	public ArrayList<Float> getSchoolFees() {
		return schoolFees;
	}
	public void setSchoolFees(ArrayList<Float> schoolFees) {
		this.schoolFees = schoolFees;
	}
	public ArrayList<String> getSchoolBoards() {
		return schoolBoards;
	}
	public void setSchoolBoards(ArrayList<String> schoolBoards) {
		this.schoolBoards = schoolBoards;
	}
	ArrayList<String> schoolCategories;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public ArrayList<String> getSchoolMediums() {
		return schoolMediums;
	}
	public void setSchoolMediums(ArrayList<String> schoolMediums) {
		this.schoolMediums = schoolMediums;
	}
	public ArrayList<String> getSchoolCategories() {
		return schoolCategories;
	}
	public void setSchoolCategories(ArrayList<String> schoolCategories) {
		this.schoolCategories = schoolCategories;
	}
	
	
}
