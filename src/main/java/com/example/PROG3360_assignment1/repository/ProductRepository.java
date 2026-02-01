package com.example.PROG3360_assignment1.repository;

import com.example.PROG3360_assignment1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
