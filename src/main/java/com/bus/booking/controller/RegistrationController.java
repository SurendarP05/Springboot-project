package com.bus.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.booking.dto.RegistrationDTO;
import com.bus.booking.service.RegistretionService;

@RestController
@RequestMapping("/registration")
@CrossOrigin
public class RegistrationController {
	
	@Autowired
	RegistretionService registretionService;
	@PostMapping("/saveuser")
	public String register(@RequestBody RegistrationDTO registrationDTO) {
		System.out.println(" Inside Registration");
		return registretionService.saveUser(registrationDTO);
	}

}
