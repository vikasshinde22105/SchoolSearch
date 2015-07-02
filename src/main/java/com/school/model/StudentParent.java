package com.school.model;

// Generated Jun 26, 2015 2:39:37 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * StudentParent generated by hbm2java
 */
@Entity
@Table(name = "student_parent")
public class StudentParent implements java.io.Serializable {

	private Integer id;
	private StudentPersonalInfo studentPersonalInfo;
	private ParentInfo parentInfo;
	private Boolean isStatus;
	private Byte isType;

	public StudentParent() {
	}

	public StudentParent(StudentPersonalInfo studentPersonalInfo,
			ParentInfo parentInfo, Boolean isStatus, Byte isType) {
		this.studentPersonalInfo = studentPersonalInfo;
		this.parentInfo = parentInfo;
		this.isStatus = isStatus;
		this.isType = isType;
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
	@JoinColumn(name = "student_id")
	public StudentPersonalInfo getStudentPersonalInfo() {
		return this.studentPersonalInfo;
	}

	public void setStudentPersonalInfo(StudentPersonalInfo studentPersonalInfo) {
		this.studentPersonalInfo = studentPersonalInfo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id")
	public ParentInfo getParentInfo() {
		return this.parentInfo;
	}

	public void setParentInfo(ParentInfo parentInfo) {
		this.parentInfo = parentInfo;
	}

	@Column(name = "is_status")
	public Boolean getIsStatus() {
		return this.isStatus;
	}

	public void setIsStatus(Boolean isStatus) {
		this.isStatus = isStatus;
	}

	@Column(name = "is_type")
	public Byte getIsType() {
		return this.isType;
	}

	public void setIsType(Byte isType) {
		this.isType = isType;
	}

}
