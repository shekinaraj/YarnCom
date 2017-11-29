package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.FabricEnquiry;

public interface FabricEnquiryService {

	List<FabricEnquiry> list();

	FabricEnquiry getByFabricEnquiryId(Long fabricEnquiryId);

	List<FabricEnquiry> getByQuery(long fabricEnquiryId);
	
	FabricEnquiry save(FabricEnquiry fabric);

	boolean delete(Long fabricEnquiryId);

}
