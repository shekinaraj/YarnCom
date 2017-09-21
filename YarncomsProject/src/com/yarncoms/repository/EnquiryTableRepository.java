package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.EnquiryTable;

public interface EnquiryTableRepository extends JpaRepository<EnquiryTable, Long> {

	List<EnquiryTable> findByCvEnquiryId(Long cvEnquiryId);
	
	@Query("SELECT e FROM EnquiryTable e where e.enqLevel = ?1 AND e.enqStatus = ?2")
	List<EnquiryTable> findEnquiry(int level,String status);	

	@Query("SELECT e.enquiryId FROM EnquiryTable e")
	List<EnquiryTable> findColumn();
	
	
	@Query("SELECT e FROM EnquiryTable e WHERE e.enqDate>=?1 AND e.enqDate<=?2")
	List<EnquiryTable> getByDate(String startDate, String endDate);
	

}
