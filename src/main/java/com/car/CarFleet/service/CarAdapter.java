package com.car.CarFleet.service;

import java.util.ArrayList;
import java.util.List;

import com.car.CarFleet.domain.Car;

public class CarAdapter {

    public static Car getCarFromCarDTO(CarDTO carDTO){
        return new Car(carDTO.getLicensePlate(), carDTO.getType(), carDTO.getBrand(), 
        carDTO.getprice(), carDTO.isAvailable());
    }
    
    public static CarDTO getCarDTOFromCar(Car car){
        return new CarDTO(car.getLicensePlate(), car.getType(), car.getBrand(), 
        car.getprice(), car.isAvailable());
    }

    public static List<CarDTO> getCarDTOListFromCarList(List<Car> carList){
        List<CarDTO> carDTOs = new ArrayList<>();

        for (Car car : carList) {
            carDTOs.add(new CarDTO(car.getLicensePlate(), car.getType(), car.getBrand(), 
            car.getprice(), car.isAvailable()));
        }

        return carDTOs;
    }
}
