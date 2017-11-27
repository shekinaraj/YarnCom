package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.WeavingEnquiry;

public interface WeavingEnquiryRepository extends JpaRepository<WeavingEnquiry, Long>{

	List<WeavingEnquiry> findByEnquiryId(Long enquiryId);
	
	@Query("select pt from Product pt, MaterialTable m, WeavingEnquiry we where we.enquiryId=?1 and we.weavingYarnCountIn=pt.weavingYarnCountIn and we.count=pt.count and we.weavingPly=pt.ply and we.weavingYarnQuality=pt.yarnQuality and we.weavingVirginMaterial=m.materialName OR we.weavingRingSpunMaterial=m.materialName OR we.weavingRingSpunDoubleMaterial=m.materialName and we.purpose=pt.purpose and we.enquiryFor=pt.enquiryFor and we.productDescription=pt.productDescription")
	List<WeavingEnquiry> getByWeaving(long enquiryId);
}
