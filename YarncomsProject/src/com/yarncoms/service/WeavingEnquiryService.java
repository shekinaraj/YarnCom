package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.WeavingEnquiry;

public interface WeavingEnquiryService {

	List<WeavingEnquiry> findByWeavingEnquiryId(Long weavingEnquiryId);

	WeavingEnquiry save(WeavingEnquiry weavingEnquiry);

	List<WeavingEnquiry> findAllWeavingEnquiry();

	boolean delete(Long weavingEnquiryId);

}
