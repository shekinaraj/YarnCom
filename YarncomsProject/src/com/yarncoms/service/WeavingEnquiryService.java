package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.WeavingEnquiry;

public interface WeavingEnquiryService {

	List<WeavingEnquiry> findByEnquiryId(Long enquiryId);
	
	List<WeavingEnquiry> getByWeaving(long enquiryId);

	WeavingEnquiry save(WeavingEnquiry weavingEnquiry);

	List<WeavingEnquiry> findAllWeavingEnquiry();

	boolean delete(Long enquiryId);

}
