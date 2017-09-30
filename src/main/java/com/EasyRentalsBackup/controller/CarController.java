
package com.EasyRentalsBackup.controller;



import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.EasyRentalsBackup.model.Car;
import com.EasyRentalsBackup.model.Reservation;
import com.EasyRentalsBackup.repository.CarRepository;
import com.EasyRentalsBackup.repository.ReservationRepository;
import com.EasyRentalsBackup.service.GeoSearchService;


@CrossOrigin(origins="*")
@RestController
@EnableAutoConfiguration
@RequestMapping("/EasyRentals/car")

public class CarController implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	@Autowired
	private GeoSearchService service;
	
	@RequestMapping(value="/listyourcar", method=RequestMethod.PUT )
	public String addcar(@RequestBody Car listyourcar)
	{
		carRepository.save(listyourcar);
		return "{\"Value\":\"Saved\"}";
	}	

	@RequestMapping(value="/deleteCar", method= RequestMethod.DELETE)
	public String deleteCar(@RequestParam(value="licenseNum") String licenseNum)
	{
		carRepository.delete(licenseNum);
		
		return "{\"value\":\"Deleted successfully\"}";
		
	}
	
	
	@RequestMapping(value="/getCarList", method = RequestMethod.GET)
	public @ResponseBody List<Car> getAllCar() throws Exception 
	{
		//List<Car> cars =carRepository.findAll();
		return  carRepository.findAll();
	}

	
	@RequestMapping(value="/findByDistance", method= RequestMethod.GET)
	public List<Car> findByDistance(@RequestParam(value="long") float longitude, @RequestParam(value="lat") float latitude, @RequestParam(value= "dist") int distance, @RequestParam(value="withDriver") boolean withDriver, @RequestParam(value="withoutDriver") boolean withoutDriver, @RequestParam(value="startDate") String startdate, @RequestParam(value="endDate") String enddate)
	{
		List<Car> filteredCar= service.findByDistance(longitude, latitude, distance, withDriver, withoutDriver);
		List<Reservation> reservationDoc= reservationRepository.findAll();
		
		for(int i=0;i<=filteredCar.size();i++)
		{
			for(int j=0; j<=reservationDoc.size();j++)
			{
			
			}	
		}
		return filteredCar;
	}
	
	
	@RequestMapping(value="/findByUser", method= RequestMethod.GET)
	public List<Car> findByUser(@RequestParam(value="contactNum") Long contactNum)
	{
		List<Car> userCar= carRepository.findByContactNum(contactNum);
		return userCar;
	}
	
	}
