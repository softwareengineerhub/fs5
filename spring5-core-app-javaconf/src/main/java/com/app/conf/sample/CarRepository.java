package com.app.conf.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CarRepository {

    @Value(value = "${car.price}")
    private int carPrice;

    @Override
    public String toString() {
        return "CarRepository{" +
                "carPrice=" + carPrice +
                '}';
    }
}
