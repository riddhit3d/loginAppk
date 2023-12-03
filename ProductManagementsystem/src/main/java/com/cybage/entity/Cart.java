package com.cybage.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Cart {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer cartId;
@OneToOne
private Product product;
public Cart(Product product) {
	super();
	this.product = product;
}
//@OneToOne
//private User user;
public Integer getCartId() {
	return cartId;
}
public void setCartId(Integer cartId) {
	this.cartId = cartId;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public Object get() {
	// TODO Auto-generated method stub
	return null;
}


}
