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
	
	@Query("select p from Product p where p.companyName =?1")
	List<Product> getProductViaCompanyName(String companyName);
	
	@Query("select p from Product p where p.productDescription =?1")
	List<Product> getProductViaProductDetails(String detail);
	
	@Query("select p from Product p where p.customerId=?1 and p.companyName=?2 and enquiryFor=?3 and p.count=?4 and p.yarnPackage=?5 and p.hankType=?6 and p.yarnCountIn=?7 and p.ply=?8 and p.yarnQuality=?9 and p.typeofYarn=?10 and p.yarnType=?11 and p.material=?12 and p.purpose=?13 and p.productDescription =?14")
	List<Product> getProductIfExist(String customerId,String companyName,String enquiryFor,String count,String yarnPackage,String hankType,String yarnCountIn,String ply,String yarnQuality,String typeofYarn,String yarnType,String material,String purpose,String productDescription);
	
	@Query("select p.companyName from Product p")
	List<Product> getAllCompanyNames();
	
}
