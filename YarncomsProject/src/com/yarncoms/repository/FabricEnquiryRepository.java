package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.FabricEnquiry;

public interface FabricEnquiryRepository extends JpaRepository<FabricEnquiry, Long> {
	
	@Query(name = "EnquiryTable", nativeQuery = true)
	List<FabricEnquiry> findByName(String name);

	FabricEnquiry getByEnquiryId(Long fabricEnquiryId);
	
	@Query("select fp.productId,fp.companyName,fp.customerId from FabricProduct fp, FabricEnquiry fe where fe.enquiryId=?1 and fe.warpCount=fp.warpCount")
	List<FabricEnquiry> getByQuery(Long fabricEnquiryId);

}
