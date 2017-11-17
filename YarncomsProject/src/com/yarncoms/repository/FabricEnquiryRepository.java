package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.FabricEnquiry;

public interface FabricEnquiryRepository extends JpaRepository<FabricEnquiry, Long> {
	
	@Query(name = "EnquiryTable", nativeQuery = true)
	List<FabricEnquiry> findByName(String name);

	FabricEnquiry getByEnquiryId(Long fabricEnquiryId);
	
	@Query("select fp.productId,fp.companyName,fp.customerId from FabricProduct fp, FabricEnquiry fe where fe.enquiryId=?1 and fe.warpPly=fp.warpPly and fe.warpCount=fp.warpCount and fe.weftCount=fp.weftCount and fe.epi=fp.epi and fe.ppi=fp.ppi and fe.width=fp.width and fe.weaveType=fp.weaveType and fe.selvedge=fp.selvedge and fe.material=fp.material and fe.construction=fp.construction")
	List<FabricEnquiry> getByQuery(Long fabricEnquiryId);

}
