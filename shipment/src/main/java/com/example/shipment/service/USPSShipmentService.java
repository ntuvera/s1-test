package com.example.shipment.service;

import com.example.shipment.model.Shipment;

public interface USPSShipmentService {
    Shipment findByTrackingNumber(String trackingNumber);
}
