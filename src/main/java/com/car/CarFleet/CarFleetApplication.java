package com.car.CarFleet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.car.CarFleet.service.CarService;

@SpringBootApplication
@EnableMongoRepositories
public class CarFleetApplication {
	@Autowired
	CarService carService;
	public static void main(String[] args) {
		SpringApplication.run(CarFleetApplication.class, args);
	}

}
