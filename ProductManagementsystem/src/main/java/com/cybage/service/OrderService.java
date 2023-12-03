//package com.cybage.service;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.cybage.entity.Order;
//import com.cybage.repo.OrderRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class OrderService {
//
//    private final OrderRepository orderRepository;
//
//    @Autowired
//    public OrderService(OrderRepository orderRepository) {
//        this.orderRepository = orderRepository;
//    }
//
//    public List<Order> getAllOrders() {
//        return orderRepository.findAll();
//    }
//
//    public Optional<Order> getOrderById(Long id) {
//        return orderRepository.findById(id);
//    }
//
//    public Order createOrder(Order order) {
//        // Additional logic, if needed
//        return orderRepository.save(order);
//    }
//
//    // Other order-related methods
//}
