package com.example.clientfe.service;

import com.example.clientfe.bean.Shipment;
import com.example.clientfe.feignclient.ShipmentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientFEServiceImpl implements ClientFEService {
    @Autowired
    ShipmentClient shipmentClient;

    @Override
    public Shipment createShipment(Shipment newShipment) {
        System.out.println(newShipment);
        return shipmentClient.createShipment(newShipment);
    }
    @Override
    public Shipment findByTrackingNumber(Integer trackingNumber) {

        return shipmentClient.getShipmentByTrackingNumber(trackingNumber);
    }
}
