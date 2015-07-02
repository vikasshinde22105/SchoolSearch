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
 * SchoolBankAccountDetails generated by hbm2java
 */
@Entity
@Table(name = "school_bank_account_details")
public class SchoolBankAccountDetails implements java.io.Serializable {

	private Integer id;
	private City city;
	private School school;
	private String bankName;
	private String branchName;
	private Integer accountNumber;
	private Integer accountType;
	private Integer ifscCode;
	private String accountHoldersName;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public SchoolBankAccountDetails() {
	}

	public SchoolBankAccountDetails(City city, School school, String bankName,
			String branchName, Integer accountNumber, Integer accountType,
			Integer ifscCode, String accountHoldersName, Date lastUpdatedOn,
			Integer lastUpdatedBy) {
		this.city = city;
		this.school = school;
		this.bankName = bankName;
		this.branchName = branchName;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.ifscCode = ifscCode;
		this.accountHoldersName = accountHoldersName;
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
	@JoinColumn(name = "city_id")
	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "school_id")
	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Column(name = "bank_name", length = 200)
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Column(name = "branch_name", length = 20)
	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Column(name = "account_number")
	public Integer getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Column(name = "account_type")
	public Integer getAccountType() {
		return this.accountType;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}

	@Column(name = "ifsc_code")
	public Integer getIfscCode() {
		return this.ifscCode;
	}

	public void setIfscCode(Integer ifscCode) {
		this.ifscCode = ifscCode;
	}

	@Column(name = "account_holders_name", length = 200)
	public String getAccountHoldersName() {
		return this.accountHoldersName;
	}

	public void setAccountHoldersName(String accountHoldersName) {
		this.accountHoldersName = accountHoldersName;
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
