package com.bus.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus.booking.entity.UserDetailsEntity;

@Repository
public interface RegistrationRepository extends JpaRepository<UserDetailsEntity, String> {
	

}
