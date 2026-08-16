package com.jotav3.springboot_jpa_rest_api.resources;

import com.jotav3.springboot_jpa_rest_api.entities.Order;
import com.jotav3.springboot_jpa_rest_api.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderResource {
    @Autowired
    private OrderService service;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> orderList = service.findAll();
        return ResponseEntity.ok().body(orderList);
    }
}
