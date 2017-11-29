package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yarncoms.model.SupplierData;
import com.yarncoms.repository.SupplierDataRepository;

@Service
public class SupplierDataServiceImpl implements SupplierDataService{

	@Resource
	private SupplierDataRepository supplierDataRepository;
	
	
	@Override
	public List<SupplierData> list() {
		// TODO Auto-generated method stub
		return supplierDataRepository.findAll();
	}

	@Override
	public List<SupplierData> getById(Long id) {
		// TODO Auto-generated method stub
		return supplierDataRepository.findById(id);
	}
	
	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SupplierData saveSupplier(SupplierData supplier) {
		// TODO Auto-generated method stub
		return supplierDataRepository.save(supplier);
	}

	@Override
	public List<SupplierData> getByTableData(String enquiryId, String supplierName,
			String contactNo, String email, String customerId) {
		// TODO Auto-generated method stub
		return supplierDataRepository.getByTableData(enquiryId, supplierName, contactNo, email, customerId);
	}

}
