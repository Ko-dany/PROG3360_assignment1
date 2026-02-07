package com.example.product_service.controller;

import com.example.product_service.entity.Product;
import com.example.product_service.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("")
    public List<Product> GetAllProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> GetProductById(@PathVariable int id){
        return productRepository.findById(id);
    }

    @PostMapping("")
    public Product AddProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id){
        productRepository.deleteById(id);
    }
}