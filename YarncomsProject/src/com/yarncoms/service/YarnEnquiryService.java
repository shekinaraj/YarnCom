package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.YarnEnquiry;

public interface YarnEnquiryService {
	
	List<YarnEnquiry> list();

	List<YarnEnquiry> findByYarnEnquiryId(Long yarnEnquiryId);

	YarnEnquiry save(YarnEnquiry yarn);
	
	boolean delete(Long yarnEnquiryId);

}
