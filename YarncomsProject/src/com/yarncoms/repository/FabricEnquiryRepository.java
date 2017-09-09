package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.FabricEnquiry;

public interface FabricEnquiryRepository extends JpaRepository<FabricEnquiry, Long> {
	
	@Query(name = "EnquiryTable", nativeQuery = true)
	List<FabricEnquiry> findByName(String name);

	List<FabricEnquiry> getByEnquiryId(Long fabricEnquiryId);

}
