package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.SpecialityEnquiry;

public interface SpecialityEnquiryRepository extends JpaRepository<SpecialityEnquiry, Long> {

	List<SpecialityEnquiry> findByEnquiryId(Long enquiryId);
	
	@Query("select pt from Product pt, MaterialTable m, SpecialityEnquiry se where se.enquiryId=?1 and se.yarnCountIn=pt.yarnCountIn and se.count=pt.count and se.specialityPly=pt.ply and se.yarnSpecialityQuality=pt.yarnQuality and se.useFor=pt.useFor and se.specialitySewingMaterial=m.materialName OR se.specialityEmbroideryMaterial=m.materialName and se.purpose=pt.purpose and se.enquiryFor=pt.enquiryFor and se.productDescription=pt.productDescription")
	List<SpecialityEnquiry> getBySpeciality(long enquiryId);
}
