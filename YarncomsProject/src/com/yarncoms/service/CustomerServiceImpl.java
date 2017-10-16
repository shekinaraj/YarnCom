package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yarncoms.model.Customer;
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
	public boolean delete(int customerId) {
		// TODO Auto-generated method stub
		return false;
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
	public List<Customer> findYarnFabricFormula(Long customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findYarnFabricFormula(customerId);
	}

}
