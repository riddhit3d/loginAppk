package com.cybage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.entity.OrderInput;
import com.cybage.entity.Product;
import com.cybage.service.OrderDetailService;
import com.cybage.service.ProductService;
//import com.cybage.service.ProductService;

@RestController
public class OderDetailController {
@Autowired
private OrderDetailService orderDetailService;
private ProductService productService;

	@PostMapping("/placeOrder")
	public void placeOrder(@RequestBody OrderInput orderInput)
	{
		OrderDetailService.placeOrder(orderInput);
	}

	public OrderDetailService getOrderDetailService() {
		return orderDetailService;
	}

	public void setOrderDetailService(OrderDetailService orderDetailService) {
		this.orderDetailService = orderDetailService;
	}
	@PostMapping("/saveOrder")
	public ResponseEntity<?> saveOrderDetail(@RequestBody OrderInput orderInput) {
		return new ResponseEntity<>(orderDetailService.saveOrderDetail(orderInput), HttpStatus.CREATED);
	}
	@GetMapping("/orderhistory")
	public ResponseEntity<?> getAllOrderDetail() {
		return new ResponseEntity<>(orderDetailService.getAllOrderDetail(), HttpStatus.OK);
	}
	}


