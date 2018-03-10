package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.CustomerVisit;

public interface CustomerVisitService {
	
	List<CustomerVisit> findByCustomerVisitId(Long customerVisitId);
	
	List<CustomerVisit> findByCompanyName(String company);
	
	List<CustomerVisit> getByTechieName(String technicalPerson);
	
	CustomerVisit save(CustomerVisit customer);

	List<CustomerVisit> findCustomerVisit();
	
	List<CustomerVisit> getAllCompanyNames();
	
	List<CustomerVisit> findUsingPurposeOfVisit(String purpose);
}
