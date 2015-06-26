package com.school.model;

// Generated Jun 23, 2015 3:49:09 PM by Hibernate Tools 3.4.0.CR1

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
 * SalesExecutive generated by hbm2java
 */
@Entity
@Table(name = "sales_executive", catalog = "school_db")
public class SalesExecutive implements java.io.Serializable {

	private Integer id;
	private String name;
	private String contactNumber;
	private String email;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set<SalesInfo> salesInfos = new HashSet<SalesInfo>(0);

	public SalesExecutive() {
	}

	public SalesExecutive(String name, String contactNumber, String email,
			Date lastUpdatedOn, Integer lastUpdatedBy, Set<SalesInfo> salesInfos) {
		this.name = name;
		this.contactNumber = contactNumber;
		this.email = email;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.salesInfos = salesInfos;
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

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "contact_number", length = 25)
	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Column(name = "email", length = 200)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salesExecutive")
	public Set<SalesInfo> getSalesInfos() {
		return this.salesInfos;
	}

	public void setSalesInfos(Set<SalesInfo> salesInfos) {
		this.salesInfos = salesInfos;
	}

}
