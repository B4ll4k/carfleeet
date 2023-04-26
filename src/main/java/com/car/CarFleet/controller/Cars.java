package com.car.CarFleet.controller;

import java.util.Collection;

import com.car.CarFleet.service.CarDTO;

public class Cars {
    Collection<CarDTO> cars;

    public Collection<CarDTO> getCars() {
        return cars;
    }

    public Cars(Collection<CarDTO> cars) {
        this.cars = cars;
    }
}
