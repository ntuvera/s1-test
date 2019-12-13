package com.example.shipment.service;

import com.example.shipment.model.Shipment;

public interface ShipmentService {
    Shipment findByTrackingNumber(Integer trackingNumber);
    Shipment createShipment(Shipment newShipment);
}
