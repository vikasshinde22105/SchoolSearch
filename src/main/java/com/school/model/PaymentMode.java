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
 * PaymentMode generated by hbm2java
 */
@Entity
@Table(name = "payment_mode")
public class PaymentMode implements java.io.Serializable {

	private Short id;
	private String title;
	private String description;
	private Byte isDeleted;
	private Byte isOnline;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set<SchoolPaymentMode> schoolPaymentModes = new HashSet<SchoolPaymentMode>(
			0);

	public PaymentMode() {
	}

	public PaymentMode(String title, String description, Byte isDeleted,
			Byte isOnline, Date lastUpdatedOn, Integer lastUpdatedBy,
			Set<SchoolPaymentMode> schoolPaymentModes) {
		this.title = title;
		this.description = description;
		this.isDeleted = isDeleted;
		this.isOnline = isOnline;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.schoolPaymentModes = schoolPaymentModes;
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

	@Column(name = "title", length = 200)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "description", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "is_deleted")
	public Byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Column(name = "is_online")
	public Byte getIsOnline() {
		return this.isOnline;
	}

	public void setIsOnline(Byte isOnline) {
		this.isOnline = isOnline;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "paymentMode")
	public Set<SchoolPaymentMode> getSchoolPaymentModes() {
		return this.schoolPaymentModes;
	}

	public void setSchoolPaymentModes(Set<SchoolPaymentMode> schoolPaymentModes) {
		this.schoolPaymentModes = schoolPaymentModes;
	}

}
