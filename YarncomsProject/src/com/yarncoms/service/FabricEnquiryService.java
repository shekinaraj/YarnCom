package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.FabricEnquiry;

public interface FabricEnquiryService {
	
	List<FabricEnquiry> list();
	List<FabricEnquiry> getByFabricEnquiryId(Long fabricEnquiryId);
	FabricEnquiry save(FabricEnquiry fabric);
	boolean delete(Long fabricEnquiryId);

}
