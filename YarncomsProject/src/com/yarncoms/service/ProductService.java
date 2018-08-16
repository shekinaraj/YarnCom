package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.Product;

public interface ProductService {
	
	List<Product> list();
	
	List<Product> getById(Long productid);
	
	Product save(Product product);
	
	List<Product> getAllCompanyNames();
	
	boolean delete(Long productId);
	
	List<Product> getProductDetails(Long productId);
	
	List<Product> getProductViaCompanyName(String companyName);
	
	List<Product> getProductViaProductDetails(String detail);
	
	List<Product> getProductIfExist(String customerId,String companyName,String enquiryFor,String count,String yarnPackage,String hankType,String yarnCountIn,String ply,String yarnQuality,String typeofYarn,String yarnType,String material,String purpose,String productDescription);

}
