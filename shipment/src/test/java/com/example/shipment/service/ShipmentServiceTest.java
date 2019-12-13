package com.example.shipment.service;


import com.example.shipment.model.Shipment;
import com.example.shipment.repository.ShipmentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class ShipmentServiceTest {
  @InjectMocks
  ShipmentServiceImpl shipmentService;

  @Mock
  ShipmentRepository shipmentRepository;

  @Test
  public void getShipment_Shipment_Success() {
    Shipment testShipment = new Shipment();

    when(shipmentRepository.findByTrackingNumber(any())).thenReturn(testShipment);
    Shipment foundShipment = shipmentService.findByTrackingNumber(123);
    assertEquals(foundShipment, testShipment);
  }

  @Test
  public void createShipment_Shipment_Success() {
    Shipment testShipment = new Shipment();

    when(shipmentRepository.save(any())).thenReturn(testShipment);
    Shipment createdShipment = shipmentService.createShipment(testShipment);

    assertEquals(createdShipment, testShipment);
  }


}
