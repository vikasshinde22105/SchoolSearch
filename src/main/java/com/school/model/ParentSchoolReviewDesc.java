package com.school.model;

// Generated Jun 9, 2015 5:02:23 PM by Hibernate Tools 4.0.0

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
 * ParentSchoolReviewDesc generated by hbm2java
 */
@Entity
@Table(name = "parent_school_review_desc", catalog = "school_db")
public class ParentSchoolReviewDesc implements java.io.Serializable {

	private Integer id;
	private School school;
	private ParentInfo parentInfo;
	private Date reviewedOn;
	private Byte status;
	private String description;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public ParentSchoolReviewDesc() {
	}

	public ParentSchoolReviewDesc(School school, ParentInfo parentInfo,
			Date reviewedOn, Byte status, String description,
			Date lastUpdatedOn, Integer lastUpdatedBy) {
		this.school = school;
		this.parentInfo = parentInfo;
		this.reviewedOn = reviewedOn;
		this.status = status;
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
	@JoinColumn(name = "school_id")
	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id")
	public ParentInfo getParentInfo() {
		return this.parentInfo;
	}

	public void setParentInfo(ParentInfo parentInfo) {
		this.parentInfo = parentInfo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "reviewed_on", length = 10)
	public Date getReviewedOn() {
		return this.reviewedOn;
	}

	public void setReviewedOn(Date reviewedOn) {
		this.reviewedOn = reviewedOn;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	@Column(name = "description", length = 16777215)
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
