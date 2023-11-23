package com.bus.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bus.booking.entity.UserDetailsEntity;

@Repository
public interface AuthenticationRepository extends JpaRepository<UserDetailsEntity, String> {
	
	@Query("Select u from UserDetailsEntity u where username=?1 and password=?2")
	public UserDetailsEntity findByUserNameandPassword(String username,String password);
	

}
