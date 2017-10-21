package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	List<Product> findByProductId(Long productId);
	
	//@Transactional
	//@Query("SELECT t1 from Product t1 join t1.Material as t2 with t1.productId = t2.productId left join t1.Quality as t3 with t1.productId = t3.productId where t1.productId =?1")
	@Query("select t1,t2 from Product t1, MaterialTable t2 where t1.productId =?1 AND t1.materialId=t2.materialId")
	List<Product> getProductDetails(Long productId);
//select v.vendorName, c.customerName from Vendor v Left Join v.children c	
	
}
