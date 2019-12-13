package com.example.clientfe.feignclient;

import com.example.clientfe.bean.Shipment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@FeignClient(name="shipment")
public interface ShipmentClient {
    @PostMapping(value="/shipment/addshipment/")
    public Shipment createShipment(@RequestBody Shipment newShipment);

    @GetMapping(value="/shipment/{trackingNumber}")
    public Shipment getShipmentByTrackingNumber(@PathVariable Integer trackingNumber);
}
