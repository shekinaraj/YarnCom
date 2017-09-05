package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.EnquiryTable;

public interface EnquiryTableService {
	
	List<EnquiryTable> getByEnquiryGridId(Long cvEnquiryId);

	List<EnquiryTable> list();

	EnquiryTable save(EnquiryTable enquiryTable);

	boolean delete(Long cvEnquiryId);

}
