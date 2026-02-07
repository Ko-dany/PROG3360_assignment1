package com.example.order_service.data;

import com.example.order_service.entity.Order;
import com.example.order_service.repository.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderDataInitializer {
    @Bean
    CommandLineRunner initOrders(OrderRepository orderRepository) {
        return args -> {
            orderRepository.save(new Order(1, 5, 6000.00, "CREATED"));
            orderRepository.save(new Order(2, 10, 459.90, "PACKAGING"));
            orderRepository.save(new Order(3, 16, 479.84, "DELIVERED"));
        };
    }
}
