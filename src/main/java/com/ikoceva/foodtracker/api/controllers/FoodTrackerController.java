package com.ikoceva.foodtracker.api.controllers;

import com.ikoceva.foodtracker.api.services.FoodTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodTrackerController {
    @Autowired
    FoodTrackerService foodTrackerService;

    @GetMapping("foodready/{orderNumber}")
    public String getOrderStatus(@PathVariable int orderNumber) {
        return foodTrackerService.checkOrderStatus(orderNumber);
    }
}
