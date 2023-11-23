package com.bus.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bus.booking.service.AuthenticationService;

@RestController
@RequestMapping("/authentiction")
@CrossOrigin
public class AuthenticationController {
	@Autowired
	AuthenticationService authenticationService;

	@GetMapping("/login")
	public String authenticate(@RequestParam String username, @RequestParam String password) {
		return authenticationService.authenticateUser(username, password);

	}

}
