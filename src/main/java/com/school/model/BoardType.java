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
 * BoardType generated by hbm2java
 */
@Entity
@Table(name = "board_type")
public class BoardType implements java.io.Serializable {

	private Short id;
	private String boardName;
	private Integer lastUpdatedBy;
	private Date lastUpdatedOn;
	private Integer createdBy;
	private Set<SchoolBoard> schoolBoards = new HashSet<SchoolBoard>(0);

	public BoardType() {
	}

	public BoardType(String boardName) {
		this.boardName = boardName;
	}

	public BoardType(String boardName, Integer lastUpdatedBy,
			Date lastUpdatedOn, Integer createdBy, Set<SchoolBoard> schoolBoards) {
		this.boardName = boardName;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedOn = lastUpdatedOn;
		this.createdBy = createdBy;
		this.schoolBoards = schoolBoards;
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

	@Column(name = "board_name", nullable = false, length = 45)
	public String getBoardName() {
		return this.boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	@Column(name = "last_updated_by")
	public Integer getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(Integer lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_updated_on", length = 19)
	public Date getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	@Column(name = "created_by")
	public Integer getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "boardType")
	public Set<SchoolBoard> getSchoolBoards() {
		return this.schoolBoards;
	}

	public void setSchoolBoards(Set<SchoolBoard> schoolBoards) {
		this.schoolBoards = schoolBoards;
	}

}
