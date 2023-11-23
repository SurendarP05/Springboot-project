package com.bus.booking.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.booking.dto.TripDTO;
import com.bus.booking.entity.TripDetailsEntity;
import com.bus.booking.repository.TripRepository;

@Service
public class TripService {

	@Autowired
	TripRepository tripRepository;

	public String saveTrip(TripDTO tripDTO) {
		try {

			TripDetailsEntity tripDetailsEntity = convertDTOToEntity(tripDTO);
			tripRepository.save(tripDetailsEntity);
		} catch (Exception e) {
			return "failed";
		}
		return "Trip details savd succsfully";
	}

	private TripDetailsEntity convertDTOToEntity(TripDTO tripDTO) {
		TripDetailsEntity tripDetailsEntity = new TripDetailsEntity();
		tripDetailsEntity.setBusNo(tripDTO.getBusNo());
		tripDetailsEntity.setOrigin(tripDTO.getOrigin());
		tripDetailsEntity.setDstination(tripDTO.getDestination());
		tripDetailsEntity.setFarePrice(tripDTO.getFareprice());
		tripDetailsEntity.setDepartureDateAndTime(tripDTO.getDepartureDateAndTime());
		tripDetailsEntity.setAvailableSeat(tripDTO.getAvailableSeat());

		return tripDetailsEntity;
	}
	
	
	public List<TripDTO> retriveTrip(String origin,String destination, String deapatruedate) {
		LocalDateTime startlocalDateTime = LocalDateTime.parse(deapatruedate).toLocalDate().atStartOfDay();
		LocalDateTime endlocalDateTime = LocalDateTime.parse(deapatruedate).toLocalDate().atTime(23,59,59);
		
		List<TripDetailsEntity> tripDetailsList = tripRepository.findByOriginDestinationDepaturedate(origin, destination, startlocalDateTime, endlocalDateTime);
		List<TripDTO> tripDTOs = new ArrayList<>();
		for(TripDetailsEntity tripDetailsEntity :tripDetailsList ) {
			tripDTOs.add(convertEntityToDto(tripDetailsEntity));
		}
		
		return tripDTOs;

		
		
	}
	private TripDTO convertEntityToDto(TripDetailsEntity tripDetailsEntity) {
		TripDTO tripDTO = new TripDTO();
		tripDTO.setBusNo(tripDetailsEntity.getBusNo());
		tripDTO.setOrigin(tripDetailsEntity.getOrigin());
		tripDTO.setDestination(tripDetailsEntity.getDstination());
		tripDTO.setFareprice(tripDetailsEntity.getFarePrice());
		tripDTO.setDepartureDateAndTime(tripDetailsEntity.getDepartureDateAndTime());
		tripDTO.setAvailableSeat(tripDetailsEntity.getAvailableSeat());

		return tripDTO;
	}
}
