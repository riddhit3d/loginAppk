package com.cybage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}