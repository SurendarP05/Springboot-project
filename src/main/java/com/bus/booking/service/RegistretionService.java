package com.bus.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.booking.dto.RegistrationDTO;
import com.bus.booking.entity.UserDetailsEntity;
import com.bus.booking.repository.RegistrationRepository;

@Service
public class RegistretionService {
 
	@Autowired
	 RegistrationRepository registrationRepository;
	
	public String saveUser(RegistrationDTO registrationDTO) {
		try {
			registrationRepository.save(convertDtoToEntity(registrationDTO));
		} catch (Exception e) {
			return "Failed";
			}
			return "success";
	}
	   
	private UserDetailsEntity convertDtoToEntity(RegistrationDTO registrationDTO) {
		UserDetailsEntity userDetailsEntity = new UserDetailsEntity();
		userDetailsEntity.setUsername(registrationDTO.getUsername());
		userDetailsEntity.setPassword(registrationDTO.getPassword());
		userDetailsEntity.setAddress(registrationDTO.getAddress());
		userDetailsEntity.setMobileno(registrationDTO.getMobileno());
		userDetailsEntity.setStatus(registrationDTO.getStatus());
		userDetailsEntity.setEmailid(registrationDTO.getEmailid());
		userDetailsEntity.setGender(registrationDTO.getGender());
		
		return userDetailsEntity;
	}
}
