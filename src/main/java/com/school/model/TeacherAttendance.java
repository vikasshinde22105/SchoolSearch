package com.school.model;

// Generated Jun 16, 2015 4:57:47 PM by Hibernate Tools 4.0.0

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

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * TeacherAttendance generated by hbm2java
 */
@Entity
@Table(name = "teacher_attendance", catalog = "school_db")
public class TeacherAttendance implements java.io.Serializable {

	private Integer id;
	private AttendanceInfo attendanceInfo;
	private TeacherStaffInfo teacherStaffInfo;
	private Boolean isPresent;
	private String description;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public TeacherAttendance() {
	}

	public TeacherAttendance(AttendanceInfo attendanceInfo,
			TeacherStaffInfo teacherStaffInfo, Boolean isPresent,
			String description, Date lastUpdatedOn, Integer lastUpdatedBy) {
		this.attendanceInfo = attendanceInfo;
		this.teacherStaffInfo = teacherStaffInfo;
		this.isPresent = isPresent;
		this.description = description;
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
	@JoinColumn(name = "attendance_id")
	@JsonBackReference
	public AttendanceInfo getAttendanceInfo() {
		return this.attendanceInfo;
	}

	public void setAttendanceInfo(AttendanceInfo attendanceInfo) {
		this.attendanceInfo = attendanceInfo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "teacher_staff_id")
	public TeacherStaffInfo getTeacherStaffInfo() {
		return this.teacherStaffInfo;
	}

	public void setTeacherStaffInfo(TeacherStaffInfo teacherStaffInfo) {
		this.teacherStaffInfo = teacherStaffInfo;
	}

	@Column(name = "is_present")
	public Boolean getIsPresent() {
		return this.isPresent;
	}

	public void setIsPresent(Boolean isPresent) {
		this.isPresent = isPresent;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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
