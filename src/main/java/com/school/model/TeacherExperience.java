package com.school.model;

// Generated Jun 26, 2015 2:39:37 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TeacherExperience generated by hbm2java
 */
@Entity
@Table(name = "teacher_experience", catalog = "school_db")
public class TeacherExperience implements java.io.Serializable {

	private Integer id;
	private Locality locality;
	private TeacherStaffInfo teacherStaffInfo;
	private Byte empType;
	private String organisationName;
	private String location;
	private String designation;
	private Date workedFromDate;
	private Date workedToDate;
	private String experience;
	private Byte isSubjectDesc;
	private Byte isCurrentJob;
	private String interestAreaDesc;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public TeacherExperience() {
	}

	public TeacherExperience(Locality locality,
			TeacherStaffInfo teacherStaffInfo, Byte empType,
			String organisationName, String location, String designation,
			Date workedFromDate, Date workedToDate, String experience,
			Byte isSubjectDesc, Byte isCurrentJob, String interestAreaDesc,
			Date lastUpdatedOn, Integer lastUpdatedBy) {
		this.locality = locality;
		this.teacherStaffInfo = teacherStaffInfo;
		this.empType = empType;
		this.organisationName = organisationName;
		this.location = location;
		this.designation = designation;
		this.workedFromDate = workedFromDate;
		this.workedToDate = workedToDate;
		this.experience = experience;
		this.isSubjectDesc = isSubjectDesc;
		this.isCurrentJob = isCurrentJob;
		this.interestAreaDesc = interestAreaDesc;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "locality_id")
	public Locality getLocality() {
		return this.locality;
	}

	public void setLocality(Locality locality) {
		this.locality = locality;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "teacher_id")
	public TeacherStaffInfo getTeacherStaffInfo() {
		return this.teacherStaffInfo;
	}

	public void setTeacherStaffInfo(TeacherStaffInfo teacherStaffInfo) {
		this.teacherStaffInfo = teacherStaffInfo;
	}

	@Column(name = "emp_type")
	public Byte getEmpType() {
		return this.empType;
	}

	public void setEmpType(Byte empType) {
		this.empType = empType;
	}

	@Column(name = "organisation_name", length = 250)
	public String getOrganisationName() {
		return this.organisationName;
	}

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	@Column(name = "location", length = 250)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "designation", length = 250)
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "worked_from_date", length = 10)
	public Date getWorkedFromDate() {
		return this.workedFromDate;
	}

	public void setWorkedFromDate(Date workedFromDate) {
		this.workedFromDate = workedFromDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "worked_to_date", length = 10)
	public Date getWorkedToDate() {
		return this.workedToDate;
	}

	public void setWorkedToDate(Date workedToDate) {
		this.workedToDate = workedToDate;
	}

	@Column(name = "experience", length = 16777215)
	public String getExperience() {
		return this.experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	@Column(name = "is_subject_desc")
	public Byte getIsSubjectDesc() {
		return this.isSubjectDesc;
	}

	public void setIsSubjectDesc(Byte isSubjectDesc) {
		this.isSubjectDesc = isSubjectDesc;
	}

	@Column(name = "is_current_job")
	public Byte getIsCurrentJob() {
		return this.isCurrentJob;
	}

	public void setIsCurrentJob(Byte isCurrentJob) {
		this.isCurrentJob = isCurrentJob;
	}

	@Column(name = "interest_area_desc", length = 16777215)
	public String getInterestAreaDesc() {
		return this.interestAreaDesc;
	}

	public void setInterestAreaDesc(String interestAreaDesc) {
		this.interestAreaDesc = interestAreaDesc;
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

}
