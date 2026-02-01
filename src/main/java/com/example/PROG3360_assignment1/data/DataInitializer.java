package com.example.PROG3360_assignment1.data;

import com.example.PROG3360_assignment1.entity.Order;
import com.example.PROG3360_assignment1.entity.Product;
import com.example.PROG3360_assignment1.repository.OrderRepository;
import com.example.PROG3360_assignment1.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner initProducts(ProductRepository productRepository) {
        return args -> {
            productRepository.save(new Product("Laptop", 1200.00, 10));
            productRepository.save(new Product("Keyboard", 45.99, 50));
            productRepository.save(new Product("Mouse", 29.99, 100));
            productRepository.save(new Product("Monitor", 249.99, 20));
            productRepository.save(new Product("USB-C Cable", 12.99, 200));
        };
    }

    @Bean
    CommandLineRunner initOrders(OrderRepository orderRepository) {
        return args -> {
            orderRepository.save(new Order(1, 5, 6000.00, "CREATED"));
            orderRepository.save(new Order(2, 10, 459.90, "PACKAGING"));
            orderRepository.save(new Order(3, 16, 479.84, "DELIVERED"));
        };
    }
}
