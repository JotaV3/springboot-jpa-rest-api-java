package com.jotav3.springboot_jpa_rest_api.repositories;

import com.jotav3.springboot_jpa_rest_api.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
