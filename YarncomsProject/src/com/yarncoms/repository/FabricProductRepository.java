package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.FabricProduct;

public interface FabricProductRepository extends JpaRepository<FabricProduct, Long> {

	List<FabricProduct> findByProductId(long productId);

	@Query("SELECT f.warpCount,f.warpPly,f.weftCount,f.weftPly FROM FabricProduct f")
	List<FabricProduct> getAll();

	@Query("SELECT p.productDescription FROM Customer c, Product p where c.customerId = ?1 AND c.customerId = p.customerId")
	List<FabricProduct> findYarnCount(Long customerId);

	@Query("SELECT fp.construction FROM Customer c, FabricProduct fp where c.customerId = ?1 AND c.customerId = fp.customerId")
	List<FabricProduct> findFabricCount(Long customerId);

}
