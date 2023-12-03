package com.cybage.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.entity.Cart;
import com.cybage.service.CartService;

@RestController
public class CartController {
	@Autowired
	private CartService cartService;
	@GetMapping("/addToCart/{productId}")
public Cart addToCart(@PathVariable(name="productId")Integer productId){
		return cartService.addToCart(productId);
	
}
	
	
	   @GetMapping("/{cartId}")
	    public ResponseEntity<Cart> getCartItemById(@PathVariable Integer cartId) {
	        Optional<Cart> cart = cartService.getCartById(cartId);
	        return cart.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
	                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	    }
//	   @GetMapping("/getcartDetails")
//	   public List<Cart> getCartDetails(){
//		   return cartService.getCatDetails();
//	   }
	   }
	  

