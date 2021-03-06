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
 * StudentAttendance generated by hbm2java
 */
@Entity
@Table(name = "student_attendance")
public class StudentAttendance implements java.io.Serializable {

	private Integer id;
	private AttendanceInfo attendanceInfo;
	private StudentPersonalInfo studentPersonalInfo;
	private TeacherStaffInfo teacherStaffInfo;
	private Boolean isPresent;
	private Date attendanceDate;
	private String rollNo;
	private String description;

	public StudentAttendance() {
	}

	public StudentAttendance(AttendanceInfo attendanceInfo,
			StudentPersonalInfo studentPersonalInfo,
			TeacherStaffInfo teacherStaffInfo, Boolean isPresent,
			Date attendanceDate, String rollNo, String description) {
		this.attendanceInfo = attendanceInfo;
		this.studentPersonalInfo = studentPersonalInfo;
		this.teacherStaffInfo = teacherStaffInfo;
		this.isPresent = isPresent;
		this.attendanceDate = attendanceDate;
		this.rollNo = rollNo;
		this.description = description;
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
	public AttendanceInfo getAttendanceInfo() {
		return this.attendanceInfo;
	}

	public void setAttendanceInfo(AttendanceInfo attendanceInfo) {
		this.attendanceInfo = attendanceInfo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	public StudentPersonalInfo getStudentPersonalInfo() {
		return this.studentPersonalInfo;
	}

	public void setStudentPersonalInfo(StudentPersonalInfo studentPersonalInfo) {
		this.studentPersonalInfo = studentPersonalInfo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "teacher_id")
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

	@Temporal(TemporalType.DATE)
	@Column(name = "attendance_date", length = 10)
	public Date getAttendanceDate() {
		return this.attendanceDate;
	}

	public void setAttendanceDate(Date attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	@Column(name = "roll_no", length = 50)
	public String getRollNo() {
		return this.rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	@Column(name = "description", length = 16777215)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
