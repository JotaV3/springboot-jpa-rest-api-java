package com.jotav3.springboot_jpa_rest_api.config;

import com.jotav3.springboot_jpa_rest_api.entities.User;
import com.jotav3.springboot_jpa_rest_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "joão", "joao@gmail.com", "999999", "1234");
        User user2 = new User(null, "alice", "alice@gmail.com", "888888", "5678");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
