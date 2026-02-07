package com.example.product_service.data;

import com.example.product_service.entity.Product;
import com.example.product_service.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductDataInitializer {
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
}
