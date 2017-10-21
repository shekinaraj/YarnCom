package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.Product;

public interface ProductService {
	
	List<Product> list();
	
	List<Product> getById(Long productid);
	
	Product save(Product product);
	
	boolean delete(Long productId);
	
	List<Product> getProductDetails(Long productId);

}
