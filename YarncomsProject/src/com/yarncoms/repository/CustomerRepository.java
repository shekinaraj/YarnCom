package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.yarncoms.model.Customer;
import com.yarncoms.model.UserDetails;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	List<Customer> findByCustomerId(int customerId);
	
	//@Transactional
	//@Query("SELECT c FROM Customer c where c.customerType=?1")
	List<Customer> findByCustomerType(String customer);
	
	@Transactional
	@Query("SELECT c FROM Customer c where c.customerType = ?1 AND c.status = ?2")
	List<Customer> find(String type,String status);	
}
