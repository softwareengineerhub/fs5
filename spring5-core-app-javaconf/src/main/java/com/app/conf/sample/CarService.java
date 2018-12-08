package com.app.conf.sample;

import org.springframework.beans.factory.annotation.Autowired;

public class CarService {
    private Car car;
   // @Autowired
    private CarRepository carRepository;

    public void processCar(){
        car.printInfo();
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public CarRepository getCarRepository() {
        return carRepository;
    }

    public void setCarRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
}
