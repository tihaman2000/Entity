package com.poly.Entity;
// Generated Oct 6, 2020, 8:38:42 AM by Hibernate Tools 5.1.10.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Seat generated by hbm2java
 */
@Entity
@Table(name = "Seat", schema = "dbo", catalog = "MovieManagement")
public class Seat implements java.io.Serializable {

	private Integer seatId;
	private Serializable seatName;
	private Integer roomId;

	public Seat() {
	}

	public Seat(Serializable seatName, Integer roomId) {
		this.seatName = seatName;
		this.roomId = roomId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "seatId", unique = true, nullable = false)
	public Integer getSeatId() {
		return this.seatId;
	}

	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
	}

	@Column(name = "seatName")
	public Serializable getSeatName() {
		return this.seatName;
	}

	public void setSeatName(Serializable seatName) {
		this.seatName = seatName;
	}

	@Column(name = "roomId")
	public Integer getRoomId() {
		return this.roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

}
