package com.EasyRentalsBackup.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.EasyRentalsBackup.model.User;

public interface UserRepository extends MongoRepository<User, Long> {
	public User findByEmail(String email);
	public User findByEmailAndPassword(String email, String password);
	public User findByContactNum(Long contactNum);

}