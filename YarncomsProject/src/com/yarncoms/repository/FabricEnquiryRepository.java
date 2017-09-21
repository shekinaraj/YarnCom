package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.FabricEnquiry;

public interface FabricEnquiryRepository extends JpaRepository<FabricEnquiry, Long> {
	
	@Query(name = "EnquiryTable", nativeQuery = true)
	List<FabricEnquiry> findByName(String name);

	FabricEnquiry getByEnquiryId(Long fabricEnquiryId);
	
	/*@Query("select fe from FabricEnquiry fe where fe.enquiryId=?1 UNION ( select fp from FabricProduct fp where fp.warpCount= fe.warpCount AND fp.weftCount= fe.weftCount AND fp.warpCoreDenier=fe.warpCoreDenier)")
	List<FabricEnquiry> getByQuery(Long fabricEnquiryId);*/

}
