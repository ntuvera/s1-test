package com.example.shipment.service;

import com.example.shipment.model.Shipment;
import org.springframework.stereotype.Service;

@Service
public class USPSShipmentImpl implements USPSShipmentService {
        @Override
        public Shipment findByTrackingNumber(String trackingNumber) {
                return null;
        }
}

