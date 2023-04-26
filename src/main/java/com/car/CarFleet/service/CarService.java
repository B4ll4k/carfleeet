package com.car.CarFleet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.CarFleet.respository.CarRepository;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    public void createUpdateCar(CarDTO carDTO){
        carRepository.save(CarAdapter.getCarFromCarDTO(carDTO));
    }

    public void removeCar(String licensePlate){
        carRepository.deleteById(licensePlate);
    }

    public List<CarDTO> getAllCars(){
        return CarAdapter.getCarDTOListFromCarList(carRepository.findAll());
    }

    public CarDTO getByLicense(String license){
        return CarAdapter.getCarDTOFromCar(carRepository.findByLicensePlate(license));
    }

    public CarDTO searchByLicense(String license){
        return CarAdapter.getCarDTOFromCar(carRepository.searchByLicensePlate(license));
    }

    public List<CarDTO> getByPrice(double price){
        return CarAdapter.getCarDTOListFromCarList(carRepository.findByPrice(price));
    }

    public List<CarDTO> searchByPrice(double price){
        return CarAdapter.getCarDTOListFromCarList(carRepository.searchByPrice(price));
    }

    public List<CarDTO> getByType(String type){
        return CarAdapter.getCarDTOListFromCarList(carRepository.findByType(type));
    }

    public List<CarDTO> searchByType(String type){
        return CarAdapter.getCarDTOListFromCarList(carRepository.searchByType(type));
    }

    public List<CarDTO> getByBrand(String brand){
        return CarAdapter.getCarDTOListFromCarList(carRepository.findByBrand(brand));
    }

    public List<CarDTO> searchByBrand(String brand){
        return CarAdapter.getCarDTOListFromCarList(carRepository.searchByBrand(brand));
    }

}
