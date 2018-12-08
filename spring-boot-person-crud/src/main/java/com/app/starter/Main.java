package com.app.starter;

import com.app.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Main {

    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }
}
