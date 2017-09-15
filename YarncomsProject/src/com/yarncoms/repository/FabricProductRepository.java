package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarncoms.model.FabricProduct;

public interface FabricProductRepository extends JpaRepository<FabricProduct, Long> {
	
	List<FabricProduct> findByProductId(long productId);

}
