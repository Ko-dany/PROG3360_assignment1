package com.example.order_service.controller;

import com.example.order_service.entity.Order;
import com.example.order_service.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("")
    public List<Order> GetAllOrders(){
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Order> GetProductById(@PathVariable int id){
        return orderRepository.findById(id);
    }

    @PostMapping("")
    public Order AddProduct(@RequestBody Order order){
        return orderRepository.save(order);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id){
        orderRepository.deleteById(id);
    }
}