package com.cybage.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	private String orderFullName;
	private String orderFullAddress;
	private String ContactNumber;
	private String AlternateContactNumber;
	private String orderStatus;
//	private Double orderAmount;
	@OneToOne
	private Product product;
//....................................................########	private User user;

	public Integer getOrderId() {
		return orderId;
	}
	public OrderDetail(String orderFullName, String orderFullAddress, String contactNumber, String alternateContactNumber,
		String orderStatus, Product product) {
	super();
	this.orderFullName = orderFullName;
	this.orderFullAddress = orderFullAddress;
	this.ContactNumber = contactNumber;
	this.AlternateContactNumber = alternateContactNumber;
	this.orderStatus = orderStatus;
	this.product = product;
}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderFullName() {
		return orderFullName;
	}
	public void setOrderFullName(String orderFullName) {
		this.orderFullName = orderFullName;
	}
	public String getOrderFullOrder() {
		return orderFullAddress;
	}
	public void setOrderFullOrder(String orderFullAddress) {
		this.orderFullAddress = orderFullAddress;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getAlternateContactNumber() {
		return AlternateContactNumber;
	}
	public void setAlternateContactNumber(String alternateContactNumber) {
		AlternateContactNumber = alternateContactNumber;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}


}
