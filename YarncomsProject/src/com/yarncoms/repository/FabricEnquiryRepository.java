package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarncoms.model.FabricEnquiry;

public interface FabricEnquiryRepository extends JpaRepository<FabricEnquiry, Long> {

	List<FabricEnquiry> getByFabricEnquiryId(Long fabricEnquiryId);

}
