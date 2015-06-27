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
 * SchoolMedium generated by hbm2java
 */
@Entity
@Table(name = "school_medium", catalog = "school_db")
public class SchoolMedium implements java.io.Serializable {

	private Integer id;
	private MediumType mediumType;
	private School school;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public SchoolMedium() {
	}

	public SchoolMedium(MediumType mediumType, School school,
			Date lastUpdatedOn, Integer lastUpdatedBy) {
		this.mediumType = mediumType;
		this.school = school;
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
	@JoinColumn(name = "medium_id")
	public MediumType getMediumType() {
		return this.mediumType;
	}

	public void setMediumType(MediumType mediumType) {
		this.mediumType = mediumType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "school_id")
	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
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
