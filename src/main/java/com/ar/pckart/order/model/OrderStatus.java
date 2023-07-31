package com.ar.pckart.order.model;

public enum OrderStatus {
    
	CANCELLED("cancelled"),
    DELIVERED("Delivered"),
    ORDERED("Ordered"),
    RETURNED("Returned"),
    SHIPPED("Shipped"),
    PROCESSING("Processing");
    
    private final String status;
    
    private OrderStatus(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return status;
    }
}
