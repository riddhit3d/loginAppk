package com.cybage.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository< Cart,Integer>{
//	 public List<Cart> findByUser(User user);
}
