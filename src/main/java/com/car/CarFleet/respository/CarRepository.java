package com.car.CarFleet.respository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.car.CarFleet.domain.Car;

@Repository
public interface CarRepository extends MongoRepository<Car, String>{
    List<Car> findByType(String type);
    List<Car> findByBrand(String brand);
    List<Car> findByPrice(double price);
    Car findByLicensePlate(String licensePlate);
}
