package com.EasyRentalsBackup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Circle;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import com.EasyRentalsBackup.model.Car;

@Component
public class GeoSearchService {


	@Autowired
	private MongoOperations mongoOperations;
	
	public List<Car> findAll()
	{
		return mongoOperations.findAll(Car.class);
	}
	
	public List<Car> findByDistance(float longitude, float latitude, int distance, boolean withDriver, boolean withoutDriver )
	{
		Point basePoint = new Point(longitude, latitude);
		
		Distance radius= new Distance(distance, Metrics.KILOMETERS);
		
		Circle area= new Circle(basePoint, radius);
		
		Query query= new Query();
		
		query.addCriteria(Criteria.where("address.geoLocation").withinSphere(area).and("withDriver").is(withDriver).and("withoutDriver").is(withoutDriver));
		return mongoOperations.find(query, Car.class);
	}

	
}
