package com.example.clientfe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientFEController {
   @Autowired
   ClientFEService clientFEService;
   @PostMapping("/clientfe/addshipment")
   public Shipment createShipment(@RequestBody Shipment newShipment) {

   }
}
