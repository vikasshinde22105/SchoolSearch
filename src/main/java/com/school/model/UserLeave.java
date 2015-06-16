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

/**
 * UserLeave generated by hbm2java
 */
@Entity
@Table(name = "user_leave", catalog = "school_db")
public class UserLeave implements java.io.Serializable {

	private Integer id;
	private UserRegistrationInfo userRegistrationInfo;
	private Short leaveType;
	private Date leaveFrom;
	private Date leaveTo;
	private Boolean isApproved;
	private String description;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public UserLeave() {
	}

	public UserLeave(UserRegistrationInfo userRegistrationInfo,
			Short leaveType, Date leaveFrom, Date leaveTo, Boolean isApproved,
			String description, Date lastUpdatedOn, Integer lastUpdatedBy) {
		this.userRegistrationInfo = userRegistrationInfo;
		this.leaveType = leaveType;
		this.leaveFrom = leaveFrom;
		this.leaveTo = leaveTo;
		this.isApproved = isApproved;
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
	@JoinColumn(name = "user_id")
	public UserRegistrationInfo getUserRegistrationInfo() {
		return this.userRegistrationInfo;
	}

	public void setUserRegistrationInfo(
			UserRegistrationInfo userRegistrationInfo) {
		this.userRegistrationInfo = userRegistrationInfo;
	}

	@Column(name = "leave_type")
	public Short getLeaveType() {
		return this.leaveType;
	}

	public void setLeaveType(Short leaveType) {
		this.leaveType = leaveType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "leave_from", length = 10)
	public Date getLeaveFrom() {
		return this.leaveFrom;
	}

	public void setLeaveFrom(Date leaveFrom) {
		this.leaveFrom = leaveFrom;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "leave_to", length = 10)
	public Date getLeaveTo() {
		return this.leaveTo;
	}

	public void setLeaveTo(Date leaveTo) {
		this.leaveTo = leaveTo;
	}

	@Column(name = "is_approved")
	public Boolean getIsApproved() {
		return this.isApproved;
	}

	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
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
