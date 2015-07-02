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
 * UserBus generated by hbm2java
 */
@Entity
@Table(name = "user_bus")
public class UserBus implements java.io.Serializable {

	private Integer id;
	private UserRegistrationInfo userRegistrationInfo;
	private BusStop busStop;
	private Route route;
	private Byte status;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public UserBus() {
	}

	public UserBus(UserRegistrationInfo userRegistrationInfo, BusStop busStop,
			Route route, Byte status, Date lastUpdatedOn, Integer lastUpdatedBy) {
		this.userRegistrationInfo = userRegistrationInfo;
		this.busStop = busStop;
		this.route = route;
		this.status = status;
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
	@JoinColumn(name = "user_id")
	public UserRegistrationInfo getUserRegistrationInfo() {
		return this.userRegistrationInfo;
	}

	public void setUserRegistrationInfo(
			UserRegistrationInfo userRegistrationInfo) {
		this.userRegistrationInfo = userRegistrationInfo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bus_stop_id")
	public BusStop getBusStop() {
		return this.busStop;
	}

	public void setBusStop(BusStop busStop) {
		this.busStop = busStop;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "route_id")
	public Route getRoute() {
		return this.route;
	}

	public void setRoute(Route route) {
		this.route = route;
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

}
