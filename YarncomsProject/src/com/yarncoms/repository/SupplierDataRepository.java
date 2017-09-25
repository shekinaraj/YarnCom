package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarncoms.model.SupplierData;

public interface SupplierDataRepository extends JpaRepository<SupplierData, Long>{
	
	List<SupplierData> findById(Long id);
	
}
