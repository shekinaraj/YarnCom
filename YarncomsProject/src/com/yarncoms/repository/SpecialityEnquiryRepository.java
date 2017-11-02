package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.SpecialityEnquiry;

public interface SpecialityEnquiryRepository extends JpaRepository<SpecialityEnquiry, Long> {

	List<SpecialityEnquiry> findByEnquiryId(Long enquiryId);
	
	@Query("select pt.productId,pt.companyName,pt.customerId from Product pt, MaterialTable m, SpecialityEnquiry se where se.enquiryId=?1 and se.specialityBlendRatio=m.BlendRatio and se.yarnCountIn=pt.yarnCountIn and se.specialityPly=pt.ply and se.useFor=pt.useFor and se.count=pt.count and se.yarnSpecialityQuality=m.yarnQuality and se.productDescription=pt.productDescription")
	List<SpecialityEnquiry> getBySpeciality(long enquiryId);
}
