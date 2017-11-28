package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.SpecialityEnquiry;

public interface SpecialityEnquiryRepository extends JpaRepository<SpecialityEnquiry, Long> {

	List<SpecialityEnquiry> findByEnquiryId(Long enquiryId);
	
	@Query("select pt from Product pt, SpecialityEnquiry se where se.enquiryId=?1 and se.productDescription=pt.productDescription")
	List<SpecialityEnquiry> getBySpeciality(long enquiryId);
}
