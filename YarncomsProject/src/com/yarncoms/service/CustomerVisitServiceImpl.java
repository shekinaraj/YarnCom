package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.CustomerVisit;
import com.yarncoms.repository.CustomerVisitRepository;


public class CustomerVisitServiceImpl implements CustomerVisitService {
	private CustomerVisitRepository customerVisitRepository;
	
	@Override
	public CustomerVisit save(CustomerVisit customer) {
		return customerVisitRepository.save(customer);
	}
	
	@Override
	public CustomerVisit findByCustomerId(Long customerId) {
		// TODO Auto-generated method stub
		return customerVisitRepository.findOne(customerId);
	}

	@Override
	public List<CustomerVisit> findCustomerVisit() {
		// TODO Auto-generated method stub
		return customerVisitRepository.findAll();
	}
}
