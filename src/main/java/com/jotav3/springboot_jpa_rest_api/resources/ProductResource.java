package com.jotav3.springboot_jpa_rest_api.resources;

import com.jotav3.springboot_jpa_rest_api.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductResource {
    @Autowired
    private ProductService service;
}
