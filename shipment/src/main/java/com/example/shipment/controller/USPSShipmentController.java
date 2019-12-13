package com.example.shipment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class USPSShipmentController {
    @GetMapping("/shipment/{tracking}")
    public Shipment findShipment(@PathVariable String tracking){
        // return null;
    }

}
