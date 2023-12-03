package com.cybage.entity;

import java.util.List;

import jakarta.persistence.OneToOne;

public class Order {
	
	public Order(){}

private int orderId;
private List<Product> productList;
@OneToOne
private Product product;
public Order(int orderId, List<Product> productList) {
	super();
	this.orderId = orderId;
	this.productList = productList;
}
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public List<Product> getProductList() {
	return productList;
}
public void setProductList(List<Product> productList) {
	this.productList = productList;
}
@Override
public String toString() {
	return "Order [orderId=" + orderId + ", productList=" + productList + "]";
}
}
