package com.jotav3.springboot_jpa_rest_api.repositories;

import com.jotav3.springboot_jpa_rest_api.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
