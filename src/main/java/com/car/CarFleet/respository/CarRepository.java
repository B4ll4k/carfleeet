package com.car.CarFleet.respository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.car.CarFleet.domain.Car;

@Repository
public interface CarRepository extends MongoRepository<Car, String>{
    List<Car> findByType(String type);
    List<Car> findByBrand(String brand);
    List<Car> findByPrice(double price);
    Car findByLicensePlate(String licensePlate);

    @Query("select c from Car c where c.isAvailable = true and c.type = :type")
    List<Car> searchByType(@Param("type") String type);
    @Query("select c from Car c where c.isAvailable = true and c.brand = :brand")
    List<Car> searchByBrand(String brand);
    @Query("select c from Car c where c.isAvailable = true and c.price = :price")
    List<Car> searchByPrice(double price);
    @Query("select c from Car c where c.isAvailable = true and c.licensePlate = :licensePlate")
    Car searchByLicensePlate(String licensePlate);
    @Query("select c from Car c where c.isAvailable = true")
    List<Car> searchAll();
}
