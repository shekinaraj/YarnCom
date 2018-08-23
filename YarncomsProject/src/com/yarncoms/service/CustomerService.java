package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.Customer;

public interface CustomerService {
	
	List<Customer> findByCustomerId(Long customerId);
	
	Customer findBySellerCustomerId(String customerId);

	List<Customer> productToCustomerDetails(String customerId);
	
	Customer findCustomerId(Long customerId);
	
	List<Customer> getBuyerOrSeller(String companyName, String status);

	Customer findCustomerTypeAndCompanyName(String companyName, String status);
	
	List<Customer> getByCompaniesName();
	
	List<Customer> list();
	
	List<Customer> checkForEmailMobile(String email, String mobile);
	
	List<Customer> find(String type, String status);
	
	List<Customer> filter(String customer);

	Customer save(Customer customer);

	boolean delete(String customerId);
	
	List<Customer> getByCountryWiseCustomer(String cust,String otherCountry);
	
	List<Customer> getByCountryWiseAll(String otherCountry);
	
	List<Object> getAllCountry(String type);
	
	List<Object> getAllCountryOtherCountry(String type);
	
	List<Object> getAllForAllCountry();
	
	List<Customer> activeList();
	
	List<Customer> dormantList();
	
	List<Customer> getCustomerByStatusAndType(String status,String type);
	
}
