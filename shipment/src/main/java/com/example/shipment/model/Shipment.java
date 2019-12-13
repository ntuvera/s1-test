package com.example.shipment.model;

import javax.persistence.*;

@Entity
@Table(name="shipments")
public class Shipment {
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
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
