package com.school.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

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

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * TeachingApproachType generated by hbm2java
 */
@Entity
@Table(name = "teaching_approach_type", catalog = "school_db")
public class TeachingApproachType implements java.io.Serializable {

	private Short id;
	private String name;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set<ClassInfo> classInfos = new HashSet<ClassInfo>(0);

	public TeachingApproachType() {
	}

	public TeachingApproachType(String name, Date lastUpdatedOn,
			Integer lastUpdatedBy, Set classInfos) {
		this.name = name;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.classInfos = classInfos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "teachingApproachType")
	@JsonManagedReference
	public Set<ClassInfo> getClassInfos() {
		return this.classInfos;
	}

	public void setClassInfos(Set<ClassInfo> classInfos) {
		this.classInfos = classInfos;
	}

}
