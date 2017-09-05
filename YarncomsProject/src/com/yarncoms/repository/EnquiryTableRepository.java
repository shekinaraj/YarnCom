package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarncoms.model.EnquiryTable;

public interface EnquiryTableRepository extends JpaRepository<EnquiryTable, Long >{
	
	List<EnquiryTable> getByCvEnquiryId(Long cvEnquiryId);

}
