package com.school.dao;

import java.util.List;

import com.school.model.School;

public interface SchoolDao {
 	 public List<School> fetchAll();
	 public School fetchById(int schoolID);
	 public List<School> fetchByName(String name);
}
