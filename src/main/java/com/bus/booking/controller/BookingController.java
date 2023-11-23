package com.bus.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.booking.dto.BookingDetailsDTO;
import com.bus.booking.service.BookingDetailsService;

@RestController
@RequestMapping("/book")
@CrossOrigin
public class BookingController {
	@Autowired
	BookingDetailsService bookingDetailsService;
	
	@PostMapping("/ticket")
	public String bookTicket(@RequestBody List<BookingDetailsDTO> bookingDetailsDTOs) {
		
		return bookingDetailsService.saveBooking(bookingDetailsDTOs);
	}

}
