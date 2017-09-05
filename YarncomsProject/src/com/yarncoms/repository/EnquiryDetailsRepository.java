package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarncoms.model.Enquiry;

public interface EnquiryDetailsRepository extends JpaRepository<Enquiry, Long>{
	
	List<Enquiry> findByEnquiryId(Long enquiryId);

}
