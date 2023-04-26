package com.car.CarFleet.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Car {
    @Id
    private  String licensePlate;
    private String type;
    private String brand;
    private double priceperDay;
    private boolean isAvailable;

    

    public String getLicensePlate() {
        return licensePlate;
    }



    public String getType() {
        return type;
    }



    public String getBrand() {
        return brand;
    }



    public double getPriceperDay() {
        return priceperDay;
    }



    public boolean isAvailable() {
        return isAvailable;
    }



    public Car(String licensePlate, String type, String brand, double priceperDay, boolean isAvailable) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.brand = brand;
        this.priceperDay = priceperDay;
        this.isAvailable = isAvailable;
    }
    

}
