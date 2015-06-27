package com.school.model;

// Generated Jun 26, 2015 2:39:37 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * StudentSchoolFeeInfoId generated by hbm2java
 */
@Embeddable
public class StudentSchoolFeeInfoId implements java.io.Serializable {

	private Integer id;
	private Integer schoolFeeDetailId;
	private Integer studentId;
	private Date paidOn;
	private Boolean isPaymentComplete;
	private Float amountPaid;
	private Integer parentId;
	private Integer description;
	private Boolean isDeleted;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public StudentSchoolFeeInfoId() {
	}

	public StudentSchoolFeeInfoId(Integer id, Integer schoolFeeDetailId,
			Integer studentId, Date paidOn, Boolean isPaymentComplete,
			Float amountPaid, Integer parentId, Integer description,
			Boolean isDeleted, Date lastUpdatedOn, Integer lastUpdatedBy) {
		this.id = id;
		this.schoolFeeDetailId = schoolFeeDetailId;
		this.studentId = studentId;
		this.paidOn = paidOn;
		this.isPaymentComplete = isPaymentComplete;
		this.amountPaid = amountPaid;
		this.parentId = parentId;
		this.description = description;
		this.isDeleted = isDeleted;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@Column(name = "id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "school_fee_detail_id")
	public Integer getSchoolFeeDetailId() {
		return this.schoolFeeDetailId;
	}

	public void setSchoolFeeDetailId(Integer schoolFeeDetailId) {
		this.schoolFeeDetailId = schoolFeeDetailId;
	}

	@Column(name = "student_id")
	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	@Column(name = "paid_on", length = 10)
	public Date getPaidOn() {
		return this.paidOn;
	}

	public void setPaidOn(Date paidOn) {
		this.paidOn = paidOn;
	}

	@Column(name = "is_payment_complete")
	public Boolean getIsPaymentComplete() {
		return this.isPaymentComplete;
	}

	public void setIsPaymentComplete(Boolean isPaymentComplete) {
		this.isPaymentComplete = isPaymentComplete;
	}

	@Column(name = "amount_paid", precision = 9, scale = 3)
	public Float getAmountPaid() {
		return this.amountPaid;
	}

	public void setAmountPaid(Float amountPaid) {
		this.amountPaid = amountPaid;
	}

	@Column(name = "parent_id")
	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Column(name = "description")
	public Integer getDescription() {
		return this.description;
	}

	public void setDescription(Integer description) {
		this.description = description;
	}

	@Column(name = "is_deleted")
	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StudentSchoolFeeInfoId))
			return false;
		StudentSchoolFeeInfoId castOther = (StudentSchoolFeeInfoId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getSchoolFeeDetailId() == castOther
						.getSchoolFeeDetailId()) || (this
						.getSchoolFeeDetailId() != null
						&& castOther.getSchoolFeeDetailId() != null && this
						.getSchoolFeeDetailId().equals(
								castOther.getSchoolFeeDetailId())))
				&& ((this.getStudentId() == castOther.getStudentId()) || (this
						.getStudentId() != null
						&& castOther.getStudentId() != null && this
						.getStudentId().equals(castOther.getStudentId())))
				&& ((this.getPaidOn() == castOther.getPaidOn()) || (this
						.getPaidOn() != null && castOther.getPaidOn() != null && this
						.getPaidOn().equals(castOther.getPaidOn())))
				&& ((this.getIsPaymentComplete() == castOther
						.getIsPaymentComplete()) || (this
						.getIsPaymentComplete() != null
						&& castOther.getIsPaymentComplete() != null && this
						.getIsPaymentComplete().equals(
								castOther.getIsPaymentComplete())))
				&& ((this.getAmountPaid() == castOther.getAmountPaid()) || (this
						.getAmountPaid() != null
						&& castOther.getAmountPaid() != null && this
						.getAmountPaid().equals(castOther.getAmountPaid())))
				&& ((this.getParentId() == castOther.getParentId()) || (this
						.getParentId() != null
						&& castOther.getParentId() != null && this
						.getParentId().equals(castOther.getParentId())))
				&& ((this.getDescription() == castOther.getDescription()) || (this
						.getDescription() != null
						&& castOther.getDescription() != null && this
						.getDescription().equals(castOther.getDescription())))
				&& ((this.getIsDeleted() == castOther.getIsDeleted()) || (this
						.getIsDeleted() != null
						&& castOther.getIsDeleted() != null && this
						.getIsDeleted().equals(castOther.getIsDeleted())))
				&& ((this.getLastUpdatedOn() == castOther.getLastUpdatedOn()) || (this
						.getLastUpdatedOn() != null
						&& castOther.getLastUpdatedOn() != null && this
						.getLastUpdatedOn()
						.equals(castOther.getLastUpdatedOn())))
				&& ((this.getLastUpdatedBy() == castOther.getLastUpdatedBy()) || (this
						.getLastUpdatedBy() != null
						&& castOther.getLastUpdatedBy() != null && this
						.getLastUpdatedBy()
						.equals(castOther.getLastUpdatedBy())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37
				* result
				+ (getSchoolFeeDetailId() == null ? 0 : this
						.getSchoolFeeDetailId().hashCode());
		result = 37 * result
				+ (getStudentId() == null ? 0 : this.getStudentId().hashCode());
		result = 37 * result
				+ (getPaidOn() == null ? 0 : this.getPaidOn().hashCode());
		result = 37
				* result
				+ (getIsPaymentComplete() == null ? 0 : this
						.getIsPaymentComplete().hashCode());
		result = 37
				* result
				+ (getAmountPaid() == null ? 0 : this.getAmountPaid()
						.hashCode());
		result = 37 * result
				+ (getParentId() == null ? 0 : this.getParentId().hashCode());
		result = 37
				* result
				+ (getDescription() == null ? 0 : this.getDescription()
						.hashCode());
		result = 37 * result
				+ (getIsDeleted() == null ? 0 : this.getIsDeleted().hashCode());
		result = 37
				* result
				+ (getLastUpdatedOn() == null ? 0 : this.getLastUpdatedOn()
						.hashCode());
		result = 37
				* result
				+ (getLastUpdatedBy() == null ? 0 : this.getLastUpdatedBy()
						.hashCode());
		return result;
	}

}