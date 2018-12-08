package com.app.conf.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import javax.inject.Inject;

@Configuration
@ComponentScan(value = {"com.app.conf.sample"})
@PropertySource(value = "data.properties")
public class AppConf {

    //@Inject
    @Autowired
    private CarRepository carRepository;


    @Bean(initMethod = "myInit")
    public Car getCar(){
        return new Car();
    }

    @Bean
    @Lazy
    public Car car(){
        return new Car();
    }

    @Bean(value = "car2")
    @Lazy
    @Scope(value = "prototype")
    public Car getCar2(){
        return new Car();
    }

    @Bean(value = {"car3","mycar3"})
    @Lazy
    public Car getCar3(){
        return new Car();
    }

    @Bean
    public CarService carService(){
        CarService carService = new CarService();
        Car car = car();
        //Car car = new Car();
        carService.setCar(car);
        carService.setCarRepository(carRepository);
        return carService;
    }

}
