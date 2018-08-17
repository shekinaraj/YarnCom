package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yarncoms.model.Customer;
import com.yarncoms.model.UserDetails;
import com.yarncoms.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Resource
	private CustomerRepository customerRepository; 

	@Override
	public List<Customer> findByCustomerId(Long customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findByCustomerId(customerId);
	}

	@Override
	public List<Customer> list() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public boolean delete(String customerId) {
		try {
			Customer customer = new Customer();
			customer.setCustomerId(customerId);;
			customerRepository.delete(customer);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List<Customer> filter(String customer) {
		// TODO Auto-generated method stub
		return customerRepository.findByCustomerType(customer);
	}

	@Override
	public List<Customer> find(String type, String status) {
		// TODO Auto-generated method stub
		System.out.println(status);
		return customerRepository.find(type, status);
	}

	@Override
	public Customer findCustomerId(Long customerId) {
		// TODO Auto-generated method stub
		return customerRepository.CustomerId(customerId);
	}
	
	@Override
	public List<Customer> checkForEmailMobile(String email, String mobile) {
		// TODO Auto-generated method stub
		return customerRepository.checkForEmailMobile(email, mobile);
	}

	@Override
	public List<Customer> productToCustomerDetails(String customerId) {
		// TODO Auto-generated method stub
		return customerRepository.productToCustomerDetails(customerId);
	}

	@Override
	public Customer findBySellerCustomerId(String customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findBySellerCustomerId(customerId);
	}

	@Override
	public Customer findCustomerTypeAndCompanyName(String companyName, String status) {
		// TODO Auto-generated method stub
		return customerRepository.findCustomerTypeAndCompanyName(companyName, status);
	}
	
	@Override
	public List<Customer> getByCompaniesName(){
		// TODO Auto-generated method stub
		return customerRepository.getByCompaniesName();
	}
	
	@Override
	public List<Customer> getBuyerOrSeller(String companyName, String status){
		// TODO Auto-generated method stub
				return customerRepository.getBuyerOrSeller(companyName, status);
	}

	@Override
	public List<Customer> getByCountryWiseCustomer(String cust,String otherCountry) {
		// TODO Auto-generated method stub
		return customerRepository.getByCountryWiseCustomer(cust,otherCountry);
	}

	@Override
	public List<Object> getAllCountry() {
		// TODO Auto-generated method stub
		return customerRepository.getAllCountry();
	}

}
