package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.Customer;

public interface CustomerService {
	
	List<Customer> findByCustomerId(Long customerId);

	List<Customer> productToCustomerDetails(String customerId);
	
	Customer findCustomerId(Long customerId);

	List<Customer> list();
	
	List<Customer> checkForEmailMobile(String email, String mobile);
	
	List<Customer> find(String type, String status);
	
	List<Customer> filter(String customer);

	Customer save(Customer customer);

	boolean delete(int customerId);

}
