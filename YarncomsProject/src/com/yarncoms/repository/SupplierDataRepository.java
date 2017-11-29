package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.SupplierData;

public interface SupplierDataRepository extends JpaRepository<SupplierData, Long>{
	
	List<SupplierData> findById(Long id);
	
	@Query("Select sd from SupplierData sd where sd.enquiryId=?1 and sd.supplierName=?2 and sd.supplierQuote=?3 and sd.contactNo=?4 and sd.email=?5 and sd.customerId=?6")
	List<SupplierData> getByTableData(String enquiryId,String supplierName,String supplierQuote,String contactNo,String email,String customerId);
	
}
