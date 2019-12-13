package com.example.shipment.controller;

import com.example.shipment.model.Shipment;
import com.example.shipment.service.ShipmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ShipmentController.class)
public class ShipmentControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private ShipmentService shipmentService;

  @Test
  public void getShipment_Returns200_Success () throws Exception {
    Shipment testShipment = new Shipment();
    testShipment.setTrackingNumber(123);

    RequestBuilder requestBuilder = MockMvcRequestBuilders
        .get("/shipment/123");

    when(shipmentService.findByTrackingNumber(any())).thenReturn(testShipment);

    MvcResult result = mockMvc.perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(content().json("{\"trackingNumber\": 123 }"))
        .andReturn();

    System.out.println(result.getResponse().getContentAsString());
  }

  @Test
  public void createShipment_Returns200_Success () throws Exception {
    Shipment testShipment = new Shipment();
    testShipment.setTrackingNumber(123);

    RequestBuilder requestBuilder = MockMvcRequestBuilders
        .post("/shipment/addshipment/")
        .contentType(MediaType.APPLICATION_JSON)
        .content(createShipmentInJson(123));;

    when(shipmentService.createShipment(any())).thenReturn(testShipment);

    MvcResult result = mockMvc.perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(content().json("{\"trackingNumber\": 123 }"))
        .andReturn();

    System.out.println(result.getResponse().getContentAsString());
  }

  private static String createShipmentInJson (Integer trackingNumber) {
    return "{ \"trackingNumber\": \"" + trackingNumber + "\"}";
  }

}
