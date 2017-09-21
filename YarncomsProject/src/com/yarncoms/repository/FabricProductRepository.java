package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.FabricProduct;

public interface FabricProductRepository extends JpaRepository<FabricProduct, Long> {
	
	List<FabricProduct> findByProductId(long productId);
	
	@Query("SELECT f.warpCount,f.warpPly,f.weftCount,f.weftPly FROM FabricProduct f")
	List<FabricProduct> getAll();

}
