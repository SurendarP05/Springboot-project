package com.bus.booking.dto;

import java.time.LocalDateTime;

public class TripDTO {
	private String busNo;
	private String origin;
	private String destination;
	private LocalDateTime departureDateAndTime;
	private Integer fareprice;
	private Integer availableSeat;

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDateTime getDepartureDateAndTime() {
		return departureDateAndTime;
	}

	public void setDepartureDateAndTime(LocalDateTime departureDateAndTime) {
		this.departureDateAndTime = departureDateAndTime;
	}

	public Integer getFareprice() {
		return fareprice;
	}

	public void setFareprice(Integer fareprice) {
		this.fareprice = fareprice;
	}

	public Integer getAvailableSeat() {
		return availableSeat;
	}

	public  void setAvailableSeat(Integer availableSeat) {
		this.availableSeat = availableSeat;
	}

}
