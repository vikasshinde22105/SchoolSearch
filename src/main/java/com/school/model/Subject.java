package com.school.model;

// Generated Jun 16, 2015 4:57:47 PM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Subject generated by hbm2java
 */
@Entity
@Table(name = "subject", catalog = "school_db")
public class Subject implements java.io.Serializable {

	private Integer id;
	private String name;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set<TimeTable> timeTables = new HashSet<TimeTable>(0);
	private Set<ClassSubjects> classSubjectses = new HashSet<ClassSubjects>(0);
	private Set<SchoolExamSubject> schoolExamSubjects = new HashSet<SchoolExamSubject>(
			0);
	private Set<TeacherSubject> teacherSubjects = new HashSet<TeacherSubject>(0);

	public Subject() {
	}

	public Subject(String name, Date lastUpdatedOn, Integer lastUpdatedBy,
			Set<TimeTable> timeTables, Set<ClassSubjects> classSubjectses,
			Set<SchoolExamSubject> schoolExamSubjects,
			Set<TeacherSubject> teacherSubjects) {
		this.name = name;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.timeTables = timeTables;
		this.classSubjectses = classSubjectses;
		this.schoolExamSubjects = schoolExamSubjects;
		this.teacherSubjects = teacherSubjects;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_updated_on", length = 19)
	public Date getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	@Column(name = "last_updated_by")
	public Integer getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(Integer lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subject")
	public Set<TimeTable> getTimeTables() {
		return this.timeTables;
	}

	public void setTimeTables(Set<TimeTable> timeTables) {
		this.timeTables = timeTables;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subject")
	public Set<ClassSubjects> getClassSubjectses() {
		return this.classSubjectses;
	}

	public void setClassSubjectses(Set<ClassSubjects> classSubjectses) {
		this.classSubjectses = classSubjectses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subject")
	public Set<SchoolExamSubject> getSchoolExamSubjects() {
		return this.schoolExamSubjects;
	}

	public void setSchoolExamSubjects(Set<SchoolExamSubject> schoolExamSubjects) {
		this.schoolExamSubjects = schoolExamSubjects;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subject")
	public Set<TeacherSubject> getTeacherSubjects() {
		return this.teacherSubjects;
	}

	public void setTeacherSubjects(Set<TeacherSubject> teacherSubjects) {
		this.teacherSubjects = teacherSubjects;
	}

}
