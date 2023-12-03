package com.cybage.service;



import java.util.List;

import com.cybage.entity.Product;


public interface ProductService {

	

	public List<Product> getAllProduct();

	public Product getProductById(Integer id);

	public String deleteProduct(Integer id);

	public Product editProduct(Product product,Integer id);

	public Product saveProduct(Product product);
	
}