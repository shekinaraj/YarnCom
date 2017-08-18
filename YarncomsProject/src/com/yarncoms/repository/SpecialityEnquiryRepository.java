package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarncoms.model.SpecialityEnquiry;

public interface SpecialityEnquiryRepository extends JpaRepository<SpecialityEnquiry, Long> {

	List<SpecialityEnquiry> findBySpecialityEnquiryId(Long specialityEnquiryId);
}
