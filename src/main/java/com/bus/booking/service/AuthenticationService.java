package com.bus.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.booking.entity.UserDetailsEntity;
import com.bus.booking.repository.AuthenticationRepository;

@Service
public class AuthenticationService {
	@Autowired
	AuthenticationRepository authenticationRepository;
	
	public String authenticateUser(String username, String password) {
		UserDetailsEntity userdetailsEntity = authenticationRepository.findByUserNameandPassword(username, password);
		if(userdetailsEntity!=null) {
			return "Success";
			
		}
		return "failed";
	}
	

}
