package com.example.shipment.controller;

import com.example.shipment.model.Shipment;
import com.example.shipment.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShipmentController {
    @Autowired
    ShipmentService shipmentService;

    @PostMapping("/shipment/addshipment/")
    public Shipment addShipment(@RequestBody Shipment newShipment){
        return shipmentService.createShipment(newShipment);
    }

    @GetMapping("/shipment/{tracking}")
    public Shipment findShipment(@PathVariable Integer tracking){
         return shipmentService.findByTrackingNumber(tracking);
    }


}
