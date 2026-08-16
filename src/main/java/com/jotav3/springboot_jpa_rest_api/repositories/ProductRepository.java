package com.jotav3.springboot_jpa_rest_api.repositories;

import com.jotav3.springboot_jpa_rest_api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
