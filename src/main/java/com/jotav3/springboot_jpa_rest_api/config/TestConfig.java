package com.jotav3.springboot_jpa_rest_api.config;

import com.jotav3.springboot_jpa_rest_api.entities.Category;
import com.jotav3.springboot_jpa_rest_api.entities.Order;
import com.jotav3.springboot_jpa_rest_api.entities.User;
import com.jotav3.springboot_jpa_rest_api.entities.enums.OrderStatus;
import com.jotav3.springboot_jpa_rest_api.repositories.CategoryRepository;
import com.jotav3.springboot_jpa_rest_api.repositories.OrderRepository;
import com.jotav3.springboot_jpa_rest_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        Category category1 = new Category(null, "Electronics");
        Category category2 = new Category(null, "Books");
        Category category3 = new Category(null, "Computers");

        User user1 = new User(null, "joão", "joao@gmail.com", "999999", "1234");
        User user2 = new User(null, "alice", "alice@gmail.com", "888888", "5678");

        Order order1 = new Order(null, Instant.parse("2003-04-19T10:43:44Z"), OrderStatus.CANCELED, user1);
        Order order2 = new Order(null, Instant.parse("2003-07-21T05:26:42Z"), OrderStatus.DELIVERED, user2);
        Order order3 = new Order(null, Instant.parse("2013-10-01T19:29:19Z"), OrderStatus.PAID, user1);

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));
        categoryRepository.saveAll(Arrays.asList(category1, category2, category3));
    }
}
