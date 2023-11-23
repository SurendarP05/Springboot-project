package com.bus.booking.dto;

import java.time.LocalDateTime;

public class BookingDetailsDTO {

	private String passengerName;
	private String passengerGender;
	private String passengerage;
	private String passengerIdProof;
	private String bookedBy;
	private Long tripId;

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

	public Long getTripId() {
		return tripId;
	}

	public void setTripId(Long tripId) {
		this.tripId = tripId;
	}

}
