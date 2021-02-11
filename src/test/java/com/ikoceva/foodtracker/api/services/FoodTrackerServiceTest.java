package com.ikoceva.foodtracker.api.services;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FoodTrackerServiceTest {

    @InjectMocks
    private FoodTrackerService foodTrackerService;

    @Test(expected = IllegalArgumentException.class)
    public void givenNegativeOrderNumber_whenCheckingStatus_thenThrowException() {
        int orderNumber = -25;
        foodTrackerService.checkOrderStatus(orderNumber);
    }
}