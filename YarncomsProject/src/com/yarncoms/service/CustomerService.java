package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.Customer;

public interface CustomerService {
	
	List<Customer> findByCustomerId(Long customerId);
	
	Customer findCustomerId(Long customerId);

	List<Customer> list();
	
	List<Customer> find(String type, String status);
	
	List<Customer> filter(String customer);

	Customer save(Customer customer);

	boolean delete(int customerId);

}
