package com.EasyRentalsBackup.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.EasyRentalsBackup.model.CarDetails;

public interface CarDetailsRepository extends MongoRepository<CarDetails, Long> {

}
