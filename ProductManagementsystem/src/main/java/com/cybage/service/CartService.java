package com.cybage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cybage.entity.Cart;
import com.cybage.entity.Product;
import com.cybage.repo.CartRepository;
import com.cybage.repo.ProductRepository;

@Service
public class CartService {
	@Autowired
	private CartRepository cartRepository;
//	private UserRepo userRepo; 
	private ProductRepository productRepository;
	
	public Cart addToCart(Integer productId) {
		Product product=productRepository.findById(productId).get();
//		String username=JwtRequestFilter.CURENT_USER;
		
//		
//		if (username!=null) {
//			user =userRepo.findBId(username).get();
//		}
		if(product!=null) {
			
			Cart cart =new Cart(product);
			cartRepository.save(cart);
			
		}
		return null;
		
		
		
	}

	public Optional<Cart> getCartById(Integer cartId) {
		// TODO Auto-generated method stub
		return cartRepository.findById(cartId);
	}
	
	
//	public List<Cart> getCartDetails(){
////		String username =JwtRequestFilter.Current_User;
////		User user UserRepository.findById(username.get();
//		return cartRepository.findByUser(user);
//	}
//	
	 
}
