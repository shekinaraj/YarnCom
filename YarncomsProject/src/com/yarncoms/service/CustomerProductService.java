package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.CustomerProduct;

public interface CustomerProductService {
	
	List<CustomerProduct> list();
	
	CustomerProduct save(CustomerProduct customer);

	List<CustomerProduct> findByCustomerProductId(Long customerProductId);
	
	List<CustomerProduct> findByCustomerId(String customerId);
	
	public boolean delete(Long customerProductId);
	
	List<CustomerProduct> getYarnOrFabric(String enquiryFor);
	
}
