package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.CustomerVisit;


public interface CustomerVisitService {
	CustomerVisit findByCustomerId(Long customerVisitId);
	
	CustomerVisit save(CustomerVisit customer);

	List<CustomerVisit> findCustomerVisit();
}
