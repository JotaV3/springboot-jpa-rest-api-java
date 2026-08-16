package com.jotav3.springboot_jpa_rest_api.services;

import com.jotav3.springboot_jpa_rest_api.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
}
