package com.bus.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.booking.dto.TripDTO;
import com.bus.booking.service.TripService;

@RestController
@RequestMapping("/trip")
@CrossOrigin
public class TripController {

	@Autowired
	TripService tripService;

	@PostMapping("/savetrip")
	public String saveTrip(@RequestBody TripDTO tripDTO) {
		System.out.println("trip Saved");
		return tripService.saveTrip(tripDTO);
	}
	@GetMapping("/gettrip/{origin}/{destination}/{deapatruedate}")
	public List<TripDTO> retriveTrip(@PathVariable String origin,@PathVariable String destination, @PathVariable String deapatruedate) {
		
		return tripService.retriveTrip(origin, destination, deapatruedate);
	}
}
