package com.car.CarFleet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.CarFleet.respository.CarRepository;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    
}
