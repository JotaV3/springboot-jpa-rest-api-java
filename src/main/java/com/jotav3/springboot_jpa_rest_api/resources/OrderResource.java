package com.jotav3.springboot_jpa_rest_api.resources;

import com.jotav3.springboot_jpa_rest_api.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderResource {
    @Autowired
    private OrderService service;
}
