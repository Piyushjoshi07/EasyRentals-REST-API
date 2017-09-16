package com.EasyRentalsBackup.controller;

//import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.EasyRentalsBackup.model.Reservation;
import com.EasyRentalsBackup.repository.ReservationRepository;


@RestController
@RequestMapping("/EasyRentals/reservation")
public class ReservationController {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addReservation(@RequestBody Reservation reservationdtls)
	{
	
			reservationRepository.findAll();
			reservationRepository.save(reservationdtls);
			return "Your Reservation is completed successfully."
					+ "Thank you for booking for with us";	
		
	}
	
	
	@RequestMapping(value="/find/{id}", method=RequestMethod.GET)
	public @ResponseBody Reservation findReservationById(@PathVariable("id") String ID) 
	{
		
		Reservation r= reservationRepository.findOne(ID);
		return r;
	}

	
	
	
}
