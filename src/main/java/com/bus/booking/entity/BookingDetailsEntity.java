package com.bus.booking.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bookingdetails")
public class BookingDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	private String pnrNO;
	private String passengerName;
	private String passengerGender;
	private String passengerage;
	private String passengerIdProof;
	private String bookedBy;
	private LocalDateTime bookedDateTime;
	@ManyToOne
	@JoinColumn(name = "tripId")
	private TripDetailsEntity tripDetailsEntity;

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public String getPnrNO() {
		return pnrNO;
	}

	public void setPnrNO(String pnrNO) {
		this.pnrNO = pnrNO;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerGender() {
		return passengerGender;
	}

	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}

	public String getPassengerage() {
		return passengerage;
	}

	public void setPassengerage(String passengerage) {
		this.passengerage = passengerage;
	}

	public String getPassengerIdProof() {
		return passengerIdProof;
	}

	public void setPassengerIdProof(String passengerIdProof) {
		this.passengerIdProof = passengerIdProof;
	}

	public String getBookedBy() {
		return bookedBy;
	}

	public void setBookedBy(String bookedBy) {
		this.bookedBy = bookedBy;
	}

	public LocalDateTime getBookedDateTime() {
		return bookedDateTime;
	}

	public void setBookedDateTime(LocalDateTime bookedDateTime) {
		this.bookedDateTime = bookedDateTime;
	}

	public TripDetailsEntity getTripDetailsEntity() {
		return tripDetailsEntity;
	}

	public void setTripDetailsEntity(TripDetailsEntity tripDetailsEntity) {
		this.tripDetailsEntity = tripDetailsEntity;
	}

}
