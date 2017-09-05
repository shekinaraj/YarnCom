package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarncoms.model.Knitting;

public interface KnittingEnquiryRepository extends JpaRepository<Knitting, Long> {

	List<Knitting> getByKnittingId(Long knittingId);

}
