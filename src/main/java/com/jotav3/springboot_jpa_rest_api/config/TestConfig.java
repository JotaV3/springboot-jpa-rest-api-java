package com.jotav3.springboot_jpa_rest_api.config;

import com.jotav3.springboot_jpa_rest_api.entities.Category;
import com.jotav3.springboot_jpa_rest_api.entities.Order;
import com.jotav3.springboot_jpa_rest_api.entities.Product;
import com.jotav3.springboot_jpa_rest_api.entities.User;
import com.jotav3.springboot_jpa_rest_api.entities.enums.OrderStatus;
import com.jotav3.springboot_jpa_rest_api.repositories.CategoryRepository;
import com.jotav3.springboot_jpa_rest_api.repositories.OrderRepository;
import com.jotav3.springboot_jpa_rest_api.repositories.ProductRepository;
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

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Category category1 = new Category(null, "Electronics");
        Category category2 = new Category(null, "Books");
        Category category3 = new Category(null, "Computers");

        Product product1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product product2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product product3 = new Product(null, "MacBook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product product4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product product5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        categoryRepository.saveAll(Arrays.asList(category1, category2, category3));
        productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));

        product1.getCategories().add(category2);
        product2.getCategories().add(category1);
        product2.getCategories().add(category3);
        product3.getCategories().add(category3);
        product4.getCategories().add(category3);
        product5.getCategories().add(category2);

        productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));

        User user1 = new User(null, "joão", "joao@gmail.com", "999999", "1234");
        User user2 = new User(null, "alice", "alice@gmail.com", "888888", "5678");

        Order order1 = new Order(null, Instant.parse("2003-04-19T10:43:44Z"), OrderStatus.CANCELED, user1);
        Order order2 = new Order(null, Instant.parse("2003-07-21T05:26:42Z"), OrderStatus.DELIVERED, user2);
        Order order3 = new Order(null, Instant.parse("2013-10-01T19:29:19Z"), OrderStatus.PAID, user1);

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));
    }
}
