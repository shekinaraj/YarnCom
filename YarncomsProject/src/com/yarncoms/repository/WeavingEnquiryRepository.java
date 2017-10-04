package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.WeavingEnquiry;

public interface WeavingEnquiryRepository extends JpaRepository<WeavingEnquiry, Long>{

	List<WeavingEnquiry> findByEnquiryId(Long enquiryId);
	
	@Query("select pt.productId,pt.companyName,pt.customerId from Product pt, MaterialTable m, WeavingEnquiry we where we.enquiryId=?1 and we.weavingYarnCountIn=pt.yarnCountIn and we.purpose=pt.purpose and we.weavingYarnQuality=pt.yarnQuality and we.material=m.materialName and we.blendRatio=m.BlendRatio")
	List<WeavingEnquiry> getByWeaving(long enquiryId);
}
