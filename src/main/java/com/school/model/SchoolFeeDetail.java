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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SchoolFeeDetail generated by hbm2java
 */
@Entity
@Table(name = "school_fee_detail", catalog = "school_db")
public class SchoolFeeDetail implements java.io.Serializable {

	private Integer id;
	private BillingCycleType billingCycleType;
	private School school;
	private ClassInfo classInfo;
	private ClassSection classSection;
	private FeeType feeType;
	private Date feeTermStartDate;
	private Date feeTermEndDate;
	private Float amount;
	private Date payByDate;
	private String description;
	private Boolean isDeleted;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set<StudentSchoolFeeInfo> studentSchoolFeeInfos = new HashSet<StudentSchoolFeeInfo>(
			0);

	public SchoolFeeDetail() {
	}

	public SchoolFeeDetail(BillingCycleType billingCycleType, School school,
			ClassInfo classInfo, ClassSection classSection, FeeType feeType,
			Date feeTermStartDate, Date feeTermEndDate, Float amount,
			Date payByDate, String description, Boolean isDeleted,
			Date lastUpdatedOn, Integer lastUpdatedBy,
			Set<StudentSchoolFeeInfo> studentSchoolFeeInfos) {
		this.billingCycleType = billingCycleType;
		this.school = school;
		this.classInfo = classInfo;
		this.classSection = classSection;
		this.feeType = feeType;
		this.feeTermStartDate = feeTermStartDate;
		this.feeTermEndDate = feeTermEndDate;
		this.amount = amount;
		this.payByDate = payByDate;
		this.description = description;
		this.isDeleted = isDeleted;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.studentSchoolFeeInfos = studentSchoolFeeInfos;
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
	@JoinColumn(name = "billing_cycle_id")
	public BillingCycleType getBillingCycleType() {
		return this.billingCycleType;
	}

	public void setBillingCycleType(BillingCycleType billingCycleType) {
		this.billingCycleType = billingCycleType;
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
	@JoinColumn(name = "class_id")
	public ClassInfo getClassInfo() {
		return this.classInfo;
	}

	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "section_id")
	public ClassSection getClassSection() {
		return this.classSection;
	}

	public void setClassSection(ClassSection classSection) {
		this.classSection = classSection;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fee_type_id")
	public FeeType getFeeType() {
		return this.feeType;
	}

	public void setFeeType(FeeType feeType) {
		this.feeType = feeType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fee_term_start_date", length = 10)
	public Date getFeeTermStartDate() {
		return this.feeTermStartDate;
	}

	public void setFeeTermStartDate(Date feeTermStartDate) {
		this.feeTermStartDate = feeTermStartDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fee_term_end_date", length = 10)
	public Date getFeeTermEndDate() {
		return this.feeTermEndDate;
	}

	public void setFeeTermEndDate(Date feeTermEndDate) {
		this.feeTermEndDate = feeTermEndDate;
	}

	@Column(name = "amount", precision = 9, scale = 3)
	public Float getAmount() {
		return this.amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "pay_by_date", length = 10)
	public Date getPayByDate() {
		return this.payByDate;
	}

	public void setPayByDate(Date payByDate) {
		this.payByDate = payByDate;
	}

	@Column(name = "description", length = 300)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "is_deleted")
	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "schoolFeeDetail")
	public Set<StudentSchoolFeeInfo> getStudentSchoolFeeInfos() {
		return this.studentSchoolFeeInfos;
	}

	public void setStudentSchoolFeeInfos(
			Set<StudentSchoolFeeInfo> studentSchoolFeeInfos) {
		this.studentSchoolFeeInfos = studentSchoolFeeInfos;
	}

}
