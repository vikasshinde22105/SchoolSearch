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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * ClassInfo generated by hbm2java
 */
@Entity
@Table(name = "class_info", catalog = "school_db", uniqueConstraints = @UniqueConstraint(columnNames = {
		"school_id", "standard_id", "ta_id" }))
@JsonIgnoreProperties({ "timeTables"})
public class ClassInfo implements java.io.Serializable {

	private Integer id;
	private TeachingApproachType teachingApproachType;
	private School school;
	private Short standardId;
	private String eligibilityCriteria;
	private Date admissionDeadline;
	private String admissionProcess;
	private Date admissionFrom;
	private Date admissionTo;
	private String howToApply;
	private String feesPaymentTerm;
	private Short totalSeat;
	private Short seatVacant;
	private String specialization;
	private Integer lastUpdatedBy;
	private Date lastUpdatedOn;
	private Set<TimeTable> timeTables = new HashSet<TimeTable>(0);
	
	private Set<ClassSection> classSections = new HashSet<ClassSection>(0);
	private Set<ClassSubjects> classSubjectses = new HashSet<ClassSubjects>(0);
	private Set<TeacherClass> teacherClasses = new HashSet<TeacherClass>(0);
	private Set<StudentPrevSchoolDetail> studentPrevSchoolDetails = new HashSet<StudentPrevSchoolDetail>(0);

	public ClassInfo() {
	}

	public ClassInfo(TeachingApproachType teachingApproachType, School school,
			Short standardId, String eligibilityCriteria,
			Date admissionDeadline, String admissionProcess,
			Date admissionFrom, Date admissionTo, String howToApply,
			String feesPaymentTerm, Short totalSeat, Short seatVacant,
			String specialization, Integer lastUpdatedBy, Date lastUpdatedOn,
			Set timeTables, Set classSections, Set classSubjectses,
			Set teacherClasses, Set studentPrevSchoolDetails) {
		this.teachingApproachType = teachingApproachType;
		this.school = school;
		this.standardId = standardId;
		this.eligibilityCriteria = eligibilityCriteria;
		this.admissionDeadline = admissionDeadline;
		this.admissionProcess = admissionProcess;
		this.admissionFrom = admissionFrom;
		this.admissionTo = admissionTo;
		this.howToApply = howToApply;
		this.feesPaymentTerm = feesPaymentTerm;
		this.totalSeat = totalSeat;
		this.seatVacant = seatVacant;
		this.specialization = specialization;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedOn = lastUpdatedOn;
		this.timeTables = timeTables;
		this.classSections = classSections;
		this.classSubjectses = classSubjectses;
		this.teacherClasses = teacherClasses;
		this.studentPrevSchoolDetails = studentPrevSchoolDetails;
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
	@JoinColumn(name = "ta_id")
	@JsonBackReference
	public TeachingApproachType getTeachingApproachType() {
		return this.teachingApproachType;
	}

	public void setTeachingApproachType(
			TeachingApproachType teachingApproachType) {
		this.teachingApproachType = teachingApproachType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "school_id")
	@JsonBackReference
	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Column(name = "standard_id")
	public Short getStandardId() {
		return this.standardId;
	}

	public void setStandardId(Short standardId) {
		this.standardId = standardId;
	}

	@Column(name = "eligibility_criteria")
	public String getEligibilityCriteria() {
		return this.eligibilityCriteria;
	}

	public void setEligibilityCriteria(String eligibilityCriteria) {
		this.eligibilityCriteria = eligibilityCriteria;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "admission_deadline", length = 10)
	public Date getAdmissionDeadline() {
		return this.admissionDeadline;
	}

	public void setAdmissionDeadline(Date admissionDeadline) {
		this.admissionDeadline = admissionDeadline;
	}

	@Column(name = "admission_process")
	public String getAdmissionProcess() {
		return this.admissionProcess;
	}

	public void setAdmissionProcess(String admissionProcess) {
		this.admissionProcess = admissionProcess;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "admission_from", length = 10)
	public Date getAdmissionFrom() {
		return this.admissionFrom;
	}

	public void setAdmissionFrom(Date admissionFrom) {
		this.admissionFrom = admissionFrom;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "admission_to", length = 10)
	public Date getAdmissionTo() {
		return this.admissionTo;
	}

	public void setAdmissionTo(Date admissionTo) {
		this.admissionTo = admissionTo;
	}

	@Column(name = "how_to_apply", length = 16777215)
	public String getHowToApply() {
		return this.howToApply;
	}

	public void setHowToApply(String howToApply) {
		this.howToApply = howToApply;
	}

	@Column(name = "fees_payment_term", length = 16777215)
	public String getFeesPaymentTerm() {
		return this.feesPaymentTerm;
	}

	public void setFeesPaymentTerm(String feesPaymentTerm) {
		this.feesPaymentTerm = feesPaymentTerm;
	}

	@Column(name = "total_seat")
	public Short getTotalSeat() {
		return this.totalSeat;
	}

	public void setTotalSeat(Short totalSeat) {
		this.totalSeat = totalSeat;
	}

	@Column(name = "seat_vacant")
	public Short getSeatVacant() {
		return this.seatVacant;
	}

	public void setSeatVacant(Short seatVacant) {
		this.seatVacant = seatVacant;
	}

	@Column(name = "specialization", length = 300)
	public String getSpecialization() {
		return this.specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Column(name = "last_updated_by")
	public Integer getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(Integer lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "last_updated_on", length = 10)
	public Date getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "classInfo")
	@JsonManagedReference
	public Set<TimeTable> getTimeTables() {
		return this.timeTables;
	}

	public void setTimeTables(Set<TimeTable> timeTables) {
		this.timeTables = timeTables;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "classInfo")
	@JsonManagedReference
	public Set<ClassSection> getClassSections() {
		return this.classSections;
	}

	public void setClassSections(Set<ClassSection> classSections) {
		this.classSections = classSections;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "classInfo")
	@JsonManagedReference
	public Set<ClassSubjects> getClassSubjectses() {
		return this.classSubjectses;
	}

	public void setClassSubjectses(Set<ClassSubjects> classSubjectses) {
		this.classSubjectses = classSubjectses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "classInfo")
	@JsonManagedReference
	public Set<TeacherClass> getTeacherClasses() {
		return this.teacherClasses;
	}

	public void setTeacherClasses(Set<TeacherClass> teacherClasses) {
		this.teacherClasses = teacherClasses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "classInfo")
	@JsonManagedReference
	public Set<StudentPrevSchoolDetail> getStudentPrevSchoolDetails() {
		return this.studentPrevSchoolDetails;
	}

	public void setStudentPrevSchoolDetails(Set<StudentPrevSchoolDetail> studentPrevSchoolDetails) {
		this.studentPrevSchoolDetails = studentPrevSchoolDetails;
	}

}
