package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.SpecialityEnquiry;

public interface SpecialityEnquiryRepository extends JpaRepository<SpecialityEnquiry, Long> {

	List<SpecialityEnquiry> findByEnquiryId(Long enquiryId);
	
	@Query("select pt.productId,pt.companyName,pt.customerId from Product pt, MaterialTable m, SpecialityEnquiry se where se.enquiryId=?1 and se.yarnCountIn=pt.yarnCountIn and se.purpose=pt.purpose and se.yarnSpecialityQuality=pt.yarnQuality and se.specialitySewingMaterial=m.materialName or se.specialityEmbroideryMaterial=m.materialName and se.specialityBlendRatio=m.BlendRatio")
	List<SpecialityEnquiry> getBySpeciality(long enquiryId);
}
