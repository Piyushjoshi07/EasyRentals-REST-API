package com.EasyRentalsBackup.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.EasyRentalsBackup.model.Car;


@RestController
@RequestMapping("/EasyRentals/display")
public class CarDisplay implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private MongoOperations mongoOperations;
	
	@RequestMapping(value="/filterByYear", method = RequestMethod.GET)
	public @ResponseBody List<Car> getCarByYear() throws Exception 
	{		
		Query query= new Query();	
		query.addCriteria(Criteria.where("year").is("2017")).limit(5);
		return mongoOperations.find(query, Car.class);
	}
	
	@RequestMapping(value="/filterByStyle", method = RequestMethod.GET)
	public @ResponseBody List<Car> getCarByStyle() throws Exception 
	{	
		Query query= new Query();	
	query.addCriteria(Criteria.where("style").is("sedan")).limit(5);
	return mongoOperations.find(query, Car.class);
	}
	
	@RequestMapping(value="/filterByOdometer", method = RequestMethod.GET)
	public @ResponseBody List<Car> getCarByOdometer() throws Exception 
	{
		Query query= new Query();	
		query.addCriteria(Criteria.where("odometer").lt(20000)).limit(5);
		return mongoOperations.find(query, Car.class);
	}
	
}
