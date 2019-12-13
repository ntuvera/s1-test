package com.example.shipment.repository;

import com.example.shipment.model.Shipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends CrudRepository<Shipment, Integer> {
    Shipment findByTrackingNumber(Integer trackingNumber);
}
