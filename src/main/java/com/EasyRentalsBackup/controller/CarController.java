
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
import com.EasyRentalsBackup.repository.CarRepository;
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
	private GeoSearchService service;
	
	@RequestMapping(value="/listyourcar", method=RequestMethod.POST )
	public String addcar(@RequestBody Car listyourcar)
	{
		carRepository.save(listyourcar);
		return "{\"Value\":\"Saved\"}";
	}	
	
	/*@RequestMapping( value="/getCarList/{zipcode}")
	public List<Car> getCarDetails(@PathVariable(value="zipcode") Long zipcode ) 
	{
	List<Car> carDetails=(List<Car>)carRepository.findByzipcode(zipcode);
	return carDetails;
	}*/
	
	
	@RequestMapping(value="/getCarList", method = RequestMethod.GET)
	public @ResponseBody List<Car> getAllCar() throws Exception 
	{
		//List<Car> cars =carRepository.findAll();
		return  carRepository.findAll();
	}

	
	@RequestMapping(value="/findByDistance", method= RequestMethod.GET)
	public List<Car> findByDistance(@RequestParam(value="long") float longitude, @RequestParam(value="lat") float latitude, @RequestParam(value= "dist") int distance, @RequestParam(value="withDriver") boolean withDriver, @RequestParam(value="withoutDriver") boolean withoutDriver)
	{
		return service.findByDistance(longitude, latitude, distance, withDriver, withoutDriver);
	}
	
	
	}
