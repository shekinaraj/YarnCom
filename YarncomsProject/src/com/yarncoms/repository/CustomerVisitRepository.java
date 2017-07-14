package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yarncoms.model.CustomerVisit;


public interface CustomerVisitRepository extends JpaRepository<CustomerVisit, Long> {
	
	CustomerVisit findByCustomerId(Long customerId);
}
