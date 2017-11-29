package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.SupplierData;

public interface SupplierDataService {

	List<SupplierData> list();

	List<SupplierData> getById(Long id);
	
	List<SupplierData> getByTableData(String enquiryId,String supplierName,String supplierQuote,String contactNo,String email,String customerId);
	
	SupplierData saveSupplier(SupplierData supplier);

	boolean delete(Long id);

}
