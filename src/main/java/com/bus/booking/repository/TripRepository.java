package com.bus.booking.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bus.booking.entity.TripDetailsEntity;

@Repository
public interface TripRepository extends JpaRepository<TripDetailsEntity, Long> {
	
	@Query("select trip  from TripDetailsEntity trip where origin=?1 and dstination=?2 and availableSeat > 0 and departureDateAndTime between ?3 and ?4")
	public List<TripDetailsEntity> findByOriginDestinationDepaturedate(String origin,String destination, LocalDateTime startDateAndTime,LocalDateTime endDateAndTime);
	

}
