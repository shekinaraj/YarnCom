package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.SpecialityEnquiry;

public interface SpecialityEnquiryService {
	
	List<SpecialityEnquiry> list();

	List<SpecialityEnquiry> findBySpecialityEnquiryId(Long specialityEnquiryId);

	SpecialityEnquiry save(SpecialityEnquiry specialityEnquiry);
	
	boolean delete(Long specialityEnquiryId);

}
