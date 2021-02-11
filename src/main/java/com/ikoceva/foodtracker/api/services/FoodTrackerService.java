package com.ikoceva.foodtracker.api.services;

import com.google.common.base.Preconditions;
import org.springframework.stereotype.Service;

@Service
public class FoodTrackerService {

    public String checkOrderStatus(int orderNumber) {
        Preconditions.checkArgument(orderNumber > 0, "Invalid order number");
        return getDummyOrderStatus(orderNumber);
    }

    private String getDummyOrderStatus(int orderNumber) {

        switch (orderNumber) {
            case 10:
                return "Order accepted";
            case 20:
                return "Order is being prepared";

            case 30:
                return "Order is ready";

            case 40:
                return "Order is being delivered";
            case 50:
                return "Order delivered";
            default:
                return "Order is being processed";
        }
    }
}
