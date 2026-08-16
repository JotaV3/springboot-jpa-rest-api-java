package com.jotav3.springboot_jpa_rest_api.services;

import com.jotav3.springboot_jpa_rest_api.entities.Product;
import com.jotav3.springboot_jpa_rest_api.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> optional = repository.findById(id);
        return optional.get();
    }
}
