package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.yarncoms.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	List<Customer> findByCustomerId(Long customerId);
	
	Customer CustomerId(Long customerId);
	
	@Query("select c from Customer c where c.customerId=?1")
	Customer findBySellerCustomerId(String customerId);
	
	//@Transactional
	//@Query("SELECT c FROM Customer c where c.customerType=?1")
	List<Customer> findByCustomerType(String customer);
	
	@Transactional
	@Query("SELECT c FROM Customer c where c.customerType = ?1 AND c.status = ?2")
	List<Customer> find(String type,String status);
	
	@Query("select c.customerId from Customer c where c.contactPersonEmail=?1 and c.mobileNo=?2")
	List<Customer> checkForEmailMobile(String email, String mobile);
	
	@Query("select c from Customer c where c.customerId=?1")
	List<Customer> productToCustomerDetails(String customerId);
	
}
