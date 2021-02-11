package com.ikoceva.foodtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ikoceva.foodtracker")
public class FoodTrackerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FoodTrackerApplication.class);
    }
}
