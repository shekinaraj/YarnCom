package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarncoms.model.CustomerProduct;

public interface CustomerProductRepository extends JpaRepository<CustomerProduct, Long> {
	
	List<CustomerProduct> findByCustomerProductId(Long customerProductId);
	
	/*@Query("SELECT p.productId,p.productDescription,fp.construction,fp.productId "
			+ "From Product p,FabricProduct fp, CustomerProduct cp where cp.customerId=?1 "
			+ "AND cp.customerId = fp.customerId AND cp.customerId = p.customerId")*/
	List<CustomerProduct> findByCustomerId(String customerId);

}
