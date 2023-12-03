//package com.cybage.controller;
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import com.cybage.entity.Order;
//import com.cybage.service.OrderService;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/orders")
//public class OrderController {
//
//    private final OrderService orderService;
//
//    @Autowired
//    public OrderController(OrderService orderService) {
//        this.orderService = orderService;
//    }
//
//    @GetMapping
//    public List<Order> getAllOrders() {
//        return orderService.getAllOrders();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
//        Optional<Order> order = orderService.getOrderById(id);
//        return order.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
//    @PostMapping("/place")
//    public ResponseEntity<Order> placeOrder(@RequestBody Order order) {
//        Order createdOrder = orderService.createOrder(order);
//        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
//    }
//
//    // Other order-related methods
//}
