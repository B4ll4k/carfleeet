package com.car.CarFleet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.car.CarFleet.service.CarDTO;
import com.car.CarFleet.service.CarService;

@RestController
public class CarController {
    @Autowired
    CarService carService;

    @PostMapping("/cars")
    public ResponseEntity<?> createUpdateCar(@RequestBody CarDTO carDTO){

        carService.createUpdateCar(carDTO);
        return new ResponseEntity<CarDTO>(carDTO, HttpStatus.OK);
    }

    @GetMapping("/cars")
    public ResponseEntity<?> getAllCars(){
        return new ResponseEntity<Cars>(new Cars(carService.getAllCars()), HttpStatus.OK);
    }

    @GetMapping("/cars/{licensePlate}")
    public ResponseEntity<?> getCarByLicense(@PathVariable String licensePlate){
        return new ResponseEntity<CarDTO>(carService.getByLicense(licensePlate), HttpStatus.OK);
    }

    @DeleteMapping("/cars/{licensePlate}")
    public ResponseEntity<HttpStatus> removeCar(@PathVariable String licensePlate){
        carService.removeCar(licensePlate);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/cars/findByType/{type}")
    public ResponseEntity<?> getCarByType(@PathVariable String type){
        return new ResponseEntity<Cars>(new Cars(carService.getByType(type)), HttpStatus.OK);
    }

    @GetMapping("/cars/findByBrand/{brand}")
    public ResponseEntity<?> getCarByBrand(@PathVariable String brand){
        return new ResponseEntity<Cars>(new Cars(carService.getByBrand(brand)), HttpStatus.OK);
    }

    @GetMapping("/cars/findByPrice/{price}")
    public ResponseEntity<?> getCarByPrice(@PathVariable double price){
        return new ResponseEntity<Cars>(new Cars(carService.getByPrice(price)), HttpStatus.OK);
    }
}
