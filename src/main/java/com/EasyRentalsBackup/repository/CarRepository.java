package com.EasyRentalsBackup.repository;

import java.util.List;
//import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.data.geo.Distance;
//import org.springframework.data.geo.GeoResults;
//import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.EasyRentalsBackup.model.Car;
//import com.mongodb.client.model.geojson.Point;
@Repository
public interface CarRepository extends MongoRepository<Car, Long>{
//List<Car> findByLocation(String location);
//List<Car> findByzipcode(Long zipcode);
/*List<Car> findByStyle(String style);
List<Car> findByYear(String Year);
List<Car> findByOdometer(String odometer);
List<Car> findByMake(String make);
List<Car> findAllCar();*/
	 //GeoResults<Car> findByLocationNear(Point location, Distance distance);

List<Car> findByYear(String year);

List<Car> findByStyle(String string);


	//List<Car> find(Query query, Class<Car> class1);
}
