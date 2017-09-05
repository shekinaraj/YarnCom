package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarncoms.model.YarnEnquiry;

public interface YarnEnquiryRepository extends JpaRepository<YarnEnquiry, Long> {

	List<YarnEnquiry> findByYarnEnquiryId(Long yarnEnquiryId);

}
