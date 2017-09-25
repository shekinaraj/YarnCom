package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.SupplierData;

public interface SupplierDataService {

	List<SupplierData> list();

	List<SupplierData> getById(Long id);

	SupplierData save(SupplierData supplier);

	boolean delete(Long id);

}
