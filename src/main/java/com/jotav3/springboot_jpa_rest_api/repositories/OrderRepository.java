package com.jotav3.springboot_jpa_rest_api.repositories;

import com.jotav3.springboot_jpa_rest_api.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
