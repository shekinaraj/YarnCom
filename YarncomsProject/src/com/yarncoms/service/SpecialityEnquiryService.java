package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.SpecialityEnquiry;

public interface SpecialityEnquiryService {
	
	List<SpecialityEnquiry> list();

	List<SpecialityEnquiry> findByEnquiryId(Long enquiryId);

	SpecialityEnquiry save(SpecialityEnquiry specialityEnquiry);
	
	boolean delete(Long specialityEnquiryId);

}
