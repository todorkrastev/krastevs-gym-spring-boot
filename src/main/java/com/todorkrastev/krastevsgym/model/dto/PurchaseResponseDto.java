package com.todorkrastev.krastevsgym.model.dto;

public class PurchaseResponseDto {

    private String orderTrackingNumber;

    public PurchaseResponseDto() {
    }

    public String getOrderTrackingNumber() {
        return orderTrackingNumber;
    }

    public void setOrderTrackingNumber(String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber;
    }
}
