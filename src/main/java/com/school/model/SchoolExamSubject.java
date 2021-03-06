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
 * SchoolExamSubject generated by hbm2java
 */
@Entity
@Table(name = "school_exam_subject")
public class SchoolExamSubject implements java.io.Serializable {

	private Integer id;
	private SchoolExam schoolExam;
	private Subject subject;
	private Float maxMarks;
	private Date conductedOn;
	private Byte status;
	private Byte isDeleted;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set<StudentMarksReport> studentMarksReports = new HashSet<StudentMarksReport>(
			0);

	public SchoolExamSubject() {
	}

	public SchoolExamSubject(SchoolExam schoolExam, Subject subject,
			Float maxMarks, Date conductedOn, Byte status, Byte isDeleted,
			Date lastUpdatedOn, Integer lastUpdatedBy,
			Set<StudentMarksReport> studentMarksReports) {
		this.schoolExam = schoolExam;
		this.subject = subject;
		this.maxMarks = maxMarks;
		this.conductedOn = conductedOn;
		this.status = status;
		this.isDeleted = isDeleted;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.studentMarksReports = studentMarksReports;
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
	@JoinColumn(name = "school_exam_id")
	public SchoolExam getSchoolExam() {
		return this.schoolExam;
	}

	public void setSchoolExam(SchoolExam schoolExam) {
		this.schoolExam = schoolExam;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Column(name = "max_marks", precision = 9, scale = 3)
	public Float getMaxMarks() {
		return this.maxMarks;
	}

	public void setMaxMarks(Float maxMarks) {
		this.maxMarks = maxMarks;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "conducted_on", length = 10)
	public Date getConductedOn() {
		return this.conductedOn;
	}

	public void setConductedOn(Date conductedOn) {
		this.conductedOn = conductedOn;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	@Column(name = "is_deleted")
	public Byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "schoolExamSubject")
	public Set<StudentMarksReport> getStudentMarksReports() {
		return this.studentMarksReports;
	}

	public void setStudentMarksReports(
			Set<StudentMarksReport> studentMarksReports) {
		this.studentMarksReports = studentMarksReports;
	}

}
