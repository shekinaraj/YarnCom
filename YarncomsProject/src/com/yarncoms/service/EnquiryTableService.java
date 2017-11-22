package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.EnquiryTable;

public interface EnquiryTableService {
	
	List<EnquiryTable> getByEnquiryGridId(Long cvEnquiryId);
	
	List<EnquiryTable> getByEnquiryId(String enquiryId);
	
	List<EnquiryTable> getByEnquiryIdToSupplierData(String cvEnquiryId);
	
	List<EnquiryTable> getByEnquiryIdToManageSupplierData(String cvEnquiryId);
	
	List<EnquiryTable> findEnquiry(int level, String status);
	
	List<EnquiryTable> getByDate(String endDate,String startDate);

	List<EnquiryTable> list();

	EnquiryTable save(EnquiryTable enquiryTable);

	boolean delete(Long cvEnquiryId);
	
	List<EnquiryTable> getDiff();
	
//	public boolean addEnquiry(String customerName, long contactNo, String date);
	
	

}
