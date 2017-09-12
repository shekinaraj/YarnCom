package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarncoms.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	List<Product> findByProductId(Long productId);

}
