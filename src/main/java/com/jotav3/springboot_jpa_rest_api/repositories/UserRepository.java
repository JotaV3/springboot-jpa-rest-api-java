package com.jotav3.springboot_jpa_rest_api.repositories;

import com.jotav3.springboot_jpa_rest_api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
