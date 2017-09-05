package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarncoms.model.WeavingEnquiry;

public interface WeavingEnquiryRepository extends JpaRepository<WeavingEnquiry, Long>{

	List<WeavingEnquiry> findByWeavingEnquiryId(Long weavingEnquiryId);
}
