package com.example.clientfe.controller;

import com.example.clientfe.bean.Shipment;
import com.example.clientfe.service.ClientFEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientFEController {
   @Autowired
   ClientFEService clientFEService;
   @PostMapping("/clientfe/addshipment")
   public Shipment createShipment(@RequestBody Shipment newShipment) {
      return clientFEService.createShipment(newShipment);
   }

   @GetMapping("/clientfe/{trackingNumber}")
   public Shipment createShipment(@PathVariable Integer trackingNumber) {
      return clientFEService.findByTrackingNumber(trackingNumber);
   }

}
