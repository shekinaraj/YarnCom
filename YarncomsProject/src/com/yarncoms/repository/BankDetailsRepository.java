package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarncoms.model.BankDetails;

public interface BankDetailsRepository extends JpaRepository<BankDetails, Long>{

	List<BankDetails> findByCustomerId(Long customerId);
	
}
