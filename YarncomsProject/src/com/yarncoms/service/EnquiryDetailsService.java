package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.Enquiry;

public interface EnquiryDetailsService {
	
	List<Enquiry> findByEnquiryId(Long enquiryId);
	
	Enquiry save(Enquiry enquiry);

	List<Enquiry> findAllEnquiry();
	
	boolean delete(Long enquiryId);


}
