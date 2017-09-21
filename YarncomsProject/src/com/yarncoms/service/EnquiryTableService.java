package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.EnquiryTable;

public interface EnquiryTableService {
	
	List<EnquiryTable> getByEnquiryGridId(Long cvEnquiryId);
	
	List<EnquiryTable> findEnquiry(int level, String status);
	
	List<EnquiryTable> findColumn();
	
	List<EnquiryTable> getByDate(String startDate, String endDate);

	List<EnquiryTable> list();

	EnquiryTable save(EnquiryTable enquiryTable);

	boolean delete(Long cvEnquiryId);
	
//	public boolean addEnquiry(String customerName, long contactNo, String date);
	
	

}
