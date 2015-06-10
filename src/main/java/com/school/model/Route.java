package com.school.model;

// Generated Jun 9, 2015 5:02:23 PM by Hibernate Tools 4.0.0

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
 * Route generated by hbm2java
 */
@Entity
@Table(name = "route", catalog = "school_db")
public class Route implements java.io.Serializable {

	private Integer id;
	private String name;
	private Byte status;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set userBuses = new HashSet(0);
	private Set busRouteStops = new HashSet(0);
	private Set busRoutes = new HashSet(0);

	public Route() {
	}

	public Route(String name, Byte status, Date lastUpdatedOn,
			Integer lastUpdatedBy, Set userBuses, Set busRouteStops,
			Set busRoutes) {
		this.name = name;
		this.status = status;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.userBuses = userBuses;
		this.busRouteStops = busRouteStops;
		this.busRoutes = busRoutes;
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

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "route")
	public Set getUserBuses() {
		return this.userBuses;
	}

	public void setUserBuses(Set userBuses) {
		this.userBuses = userBuses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "route")
	public Set getBusRouteStops() {
		return this.busRouteStops;
	}

	public void setBusRouteStops(Set busRouteStops) {
		this.busRouteStops = busRouteStops;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "route")
	public Set getBusRoutes() {
		return this.busRoutes;
	}

	public void setBusRoutes(Set busRoutes) {
		this.busRoutes = busRoutes;
	}

}
