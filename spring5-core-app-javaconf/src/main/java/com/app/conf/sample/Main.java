package com.app.conf.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConf.class);

        Car getCar = (Car) ctx.getBean("getCar");
        getCar.printInfo();
        Car getCar2 = (Car) ctx.getBean("getCar");
        System.out.println(getCar.hashCode());
        System.out.println(getCar2.hashCode());
        System.out.println("---------------------");

        Car car2 = (Car) ctx.getBean("car2");
        //getCar.printInfo();
        Car car2B = (Car) ctx.getBean("car2");
        System.out.println(car2.hashCode());
        System.out.println(car2B.hashCode());


        System.out.println("---------------------");
        Car car3 = (Car) ctx.getBean("car3");
        Car mycar3 = (Car) ctx.getBean("mycar3");
        System.out.println(car3.hashCode());
        System.out.println(mycar3.hashCode());

        System.out.println("--------------------");
        CarService carService = ctx.getBean(CarService.class);
        carService.processCar();

        System.out.println("--------------------");
        CarRepository carRepository = ctx.getBean(CarRepository.class);
        System.out.println(carRepository);




    }
}
