package com.example.clientfe.service;

import com.example.clientfe.bean.Shipment;

public interface ClientFEService {
    Shipment createShipment(Shipment newShipment);
    Shipment findByTrackingNumber(Integer trackingNumber);

}
