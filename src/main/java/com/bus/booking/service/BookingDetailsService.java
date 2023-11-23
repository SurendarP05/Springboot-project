package com.bus.booking.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.booking.dto.BookingDetailsDTO;
import com.bus.booking.entity.BookingDetailsEntity;
import com.bus.booking.entity.TripDetailsEntity;
import com.bus.booking.repository.BookingDetailsRepository;
import com.bus.booking.repository.TripRepository;

@Service
public class BookingDetailsService {
	
	@Autowired
	BookingDetailsRepository bookingDetailsRepository;
	@Autowired
	TripRepository tripRepository;
	
	private String pnrNo;
	private TripDetailsEntity tripDetailsEntity;
	private Integer numberOfTicket;

	public String saveBooking(List<BookingDetailsDTO> bookingDetailsDTOs) {
		
		
		
		for(BookingDetailsDTO bookingDetailsDTO : bookingDetailsDTOs) {
			BookingDetailsEntity bookingDetailsEntity = covertDtoToEntity(bookingDetailsDTO);
			
			bookingDetailsRepository.save(bookingDetailsEntity);
		}
		
		numberOfTicket = bookingDetailsDTOs.size();
		updateAvailableSeat();
		return " Ticket booked SuccesFully,Your PNR Number is " +pnrNo;
		
	}
	private BookingDetailsEntity covertDtoToEntity(BookingDetailsDTO bookingDetailsDTO) {
		BookingDetailsEntity bookingDetailsEntity = new BookingDetailsEntity();
		bookingDetailsEntity.setPassengerName(bookingDetailsDTO.getPassengerName());
		bookingDetailsEntity.setPassengerGender(bookingDetailsDTO.getPassengerGender());
		bookingDetailsEntity.setPassengerage(bookingDetailsDTO.getPassengerage());
		bookingDetailsEntity.setPassengerIdProof(bookingDetailsDTO.getPassengerIdProof());
		bookingDetailsEntity.setBookedBy(bookingDetailsDTO.getBookedBy());
		bookingDetailsEntity.setBookedDateTime(LocalDateTime.now());
		bookingDetailsEntity.setPnrNO(generatePnrNo(bookingDetailsDTO));
		
		
		tripDetailsEntity = tripRepository.findById(bookingDetailsDTO.getTripId()).get();
		bookingDetailsEntity.setTripDetailsEntity(tripDetailsEntity);
		return bookingDetailsEntity;
		
	}
	
	
	private String generatePnrNo(BookingDetailsDTO bookingDetailsDTO ) {
		pnrNo = bookingDetailsDTO.getPassengerName().substring(0, 3)+ bookingDetailsDTO.getTripId()+Math.random();
		
		return pnrNo;
	}
	 private void updateAvailableSeat() {
		 int seatAvailable = tripDetailsEntity.getAvailableSeat()- numberOfTicket;
		 tripDetailsEntity.setAvailableSeat(seatAvailable);
		 tripRepository.save(tripDetailsEntity);
	 }
}
