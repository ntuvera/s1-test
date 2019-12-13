package com.example.clientfe.bean;

public class Shipment {
    private Long id;
    private Integer trackingNumber;

    public Shipment() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(Integer trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}
