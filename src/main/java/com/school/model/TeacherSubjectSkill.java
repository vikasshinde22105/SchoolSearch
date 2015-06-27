package com.school.model;

// Generated Jun 26, 2015 2:39:37 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TeacherSubjectSkill generated by hbm2java
 */
@Entity
@Table(name = "teacher_subject_skill", catalog = "school_db")
public class TeacherSubjectSkill implements java.io.Serializable {

	private Integer id;
	private Integer teacherStaffId;
	private String handlingSubjectDesc;
	private Boolean isHandlingType;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public TeacherSubjectSkill() {
	}

	public TeacherSubjectSkill(Integer teacherStaffId,
			String handlingSubjectDesc, Boolean isHandlingType,
			Date lastUpdatedOn, Integer lastUpdatedBy) {
		this.teacherStaffId = teacherStaffId;
		this.handlingSubjectDesc = handlingSubjectDesc;
		this.isHandlingType = isHandlingType;
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

	@Column(name = "teacher_staff_id")
	public Integer getTeacherStaffId() {
		return this.teacherStaffId;
	}

	public void setTeacherStaffId(Integer teacherStaffId) {
		this.teacherStaffId = teacherStaffId;
	}

	@Column(name = "handling_subject_desc", length = 300)
	public String getHandlingSubjectDesc() {
		return this.handlingSubjectDesc;
	}

	public void setHandlingSubjectDesc(String handlingSubjectDesc) {
		this.handlingSubjectDesc = handlingSubjectDesc;
	}

	@Column(name = "is_handling_type")
	public Boolean getIsHandlingType() {
		return this.isHandlingType;
	}

	public void setIsHandlingType(Boolean isHandlingType) {
		this.isHandlingType = isHandlingType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "last_updated_on", length = 10)
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
