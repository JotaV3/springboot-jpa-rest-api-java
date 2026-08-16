package com.jotav3.springboot_jpa_rest_api.services;

import com.jotav3.springboot_jpa_rest_api.entities.Order;
import com.jotav3.springboot_jpa_rest_api.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }
}
