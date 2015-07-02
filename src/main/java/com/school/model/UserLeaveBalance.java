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
 * UserLeaveBalance generated by hbm2java
 */
@Entity
@Table(name = "user_leave_balance")
public class UserLeaveBalance implements java.io.Serializable {

	private Integer id;
	private UserRegistrationInfo userRegistrationInfo;
	private RoleLeaveTracking roleLeaveTracking;
	private Float noOfDays;
	private String description;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public UserLeaveBalance() {
	}

	public UserLeaveBalance(UserRegistrationInfo userRegistrationInfo,
			RoleLeaveTracking roleLeaveTracking, Float noOfDays,
			String description, Date lastUpdatedOn, Integer lastUpdatedBy) {
		this.userRegistrationInfo = userRegistrationInfo;
		this.roleLeaveTracking = roleLeaveTracking;
		this.noOfDays = noOfDays;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_leave_tracking_id")
	public RoleLeaveTracking getRoleLeaveTracking() {
		return this.roleLeaveTracking;
	}

	public void setRoleLeaveTracking(RoleLeaveTracking roleLeaveTracking) {
		this.roleLeaveTracking = roleLeaveTracking;
	}

	@Column(name = "no_of_days", precision = 9, scale = 3)
	public Float getNoOfDays() {
		return this.noOfDays;
	}

	public void setNoOfDays(Float noOfDays) {
		this.noOfDays = noOfDays;
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
