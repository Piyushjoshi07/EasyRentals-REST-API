package com.EasyRentalsBackup.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.EasyRentalsBackup.model.Reservation;

@Repository
public interface ReservationRepository extends MongoRepository<Reservation, String>{

	Reservation findById();

}
