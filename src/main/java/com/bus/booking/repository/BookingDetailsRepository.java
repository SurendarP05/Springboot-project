package com.bus.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus.booking.entity.BookingDetailsEntity;

@Repository
public interface BookingDetailsRepository extends JpaRepository<BookingDetailsEntity, Long> {

}
