package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yarncoms.model.CustomerVisit;
import com.yarncoms.repository.CustomerVisitRepository;

@Service
public class CustomerVisitServiceImpl implements CustomerVisitService {
	
	@Resource
	private CustomerVisitRepository customerVisitRepository;
	
	@Override
	public CustomerVisit save(CustomerVisit customer) {
		return customerVisitRepository.save(customer);
	}
	
	@Override
	public List<CustomerVisit> findByCustomerVisitId(Long customerId) {
		// TODO Auto-generated method stub
		return customerVisitRepository.findByCustomerVisitId(customerId);
	}

	@Override
	public List<CustomerVisit> findCustomerVisit() {
		// TODO Auto-generated method stub
		return customerVisitRepository.findAll();
	}

	@Override
	public List<CustomerVisit> getAllCompanyNames() {
		// TODO Auto-generated method stub
		return customerVisitRepository.getAllCompanyName();
	}

	@Override
	public List<CustomerVisit> findByCompanyName(String company) {
		// TODO Auto-generated method stub
		return customerVisitRepository.getByCompanyName(company);
	}

}
