package com.school.model;

// Generated Jun 26, 2015 2:39:37 PM by Hibernate Tools 3.4.0.CR1

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

/**
 * SchoolClassificationType generated by hbm2java
 */
@Entity
@Table(name = "school_classification_type")
public class SchoolClassificationType implements java.io.Serializable {

	private Short id;
	private String name;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set<SchoolInfo> schoolInfos = new HashSet<SchoolInfo>(0);

	public SchoolClassificationType() {
	}

	public SchoolClassificationType(String name, Date lastUpdatedOn,
			Integer lastUpdatedBy, Set<SchoolInfo> schoolInfos) {
		this.name = name;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.schoolInfos = schoolInfos;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "schoolClassificationType")
	public Set<SchoolInfo> getSchoolInfos() {
		return this.schoolInfos;
	}

	public void setSchoolInfos(Set<SchoolInfo> schoolInfos) {
		this.schoolInfos = schoolInfos;
	}

}
