 package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.EnquiryTable;

public interface EnquiryTableRepository extends JpaRepository<EnquiryTable, Long> {
 
	List<EnquiryTable> findByCvEnquiryId(Long cvEnquiryId);
	
	@Query("SELECT e FROM EnquiryTable e where e.enqLevel = ?1 AND e.enqStatus = ?2")
	List<EnquiryTable> findEnquiry(int level,String status);
	
	@Query("SELECT e FROM EnquiryTable e where e.enqLevel = ?1 AND e.enqStatus = ?2 AND e.enqDate<=?3")
	List<EnquiryTable> findEnquiryWithDate(int level,String status,String date);
	
	@Query("SELECT e FROM EnquiryTable e where e.enqLevel = ?1 AND e.enqStatus = ?2 AND e.enqDate<=?3 AND e.technicalPerson = ?4")
	List<EnquiryTable> findEnquiryWithTech(int level,String status,String date, String tech);
	
	@Query("SELECT e FROM EnquiryTable e where e.enquiryId = ?1")
	List<EnquiryTable> findLevel(String enquiryId);
	
	@Query("SELECT e FROM EnquiryTable e where e.enqStatus = ?1 AND e.technicalPerson = ?2")
	List<EnquiryTable> findUsingStatus(String status,String technical);
	
	@Query("SELECT sd FROM SupplierData sd, EnquiryTable e where e.enquiryId=?1 and e.enquiryId= sd.enquiryId and sd.flag='Y'")
	List<EnquiryTable> getByEnquiryIdToSupplierData(String cvEnquiryId);
	
	@Query("SELECT sd FROM SupplierData sd, EnquiryTable e where e.enquiryId=?1 and e.enquiryId= sd.enquiryId and sd.supplierQuote!='Quote Not Received'")
	List<EnquiryTable> getByEnquiryIdToManageSupplierData(String cvEnquiryId);
	
	@Query("SELECT e FROM EnquiryTable e WHERE e.enqDate>=?1 AND e.enqDate<=?2")
	List<EnquiryTable> getByDate(String startDate, String endDate);
	
	@Query("SELECT e FROM EnquiryTable e")
	List<EnquiryTable> getDiff();
  
}
