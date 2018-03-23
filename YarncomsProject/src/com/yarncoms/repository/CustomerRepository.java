package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.yarncoms.model.Customer;
import com.yarncoms.model.CustomerVisit;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	List<Customer> findByCustomerId(Long customerId);
	
	Customer CustomerId(Long customerId);
	
	@Query("select c from Customer c where c.customerId=?1")
	Customer findBySellerCustomerId(String customerId);
	
	//@Transactional
	//@Query("SELECT c FROM Customer c where c.customerType=?1")
	List<Customer> findByCustomerType(String customer);
	
	@Query("select c.companyName from Customer c where c.status='Open'")
	List<Customer> getByCompaniesName();
	
	@Query("SELECT c FROM Customer c where c.companyName = ?1 AND c.status = ?2")
	List<Customer> getBuyerOrSeller(String companyName, String status);
	
	@Transactional
	@Query("SELECT c FROM Customer c where c.customerType = ?1 AND c.status = ?2 OR c.customerType = 'Both' AND c.status = ?2")
	List<Customer> find(String type,String status);
	
	@Query("select c.customerId from Customer c where c.contactPersonEmail=?1 and c.mobileNo=?2")
	List<Customer> checkForEmailMobile(String email, String mobile);
	
	@Query("select c from Customer c where c.customerId=?1")
	List<Customer> productToCustomerDetails(String customerId);
	
	@Query("select c from Customer c where c.companyName=?1 and c.status=?2")
	Customer findCustomerTypeAndCompanyName(String companyName,String status);
	
}
