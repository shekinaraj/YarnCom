package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.CustomerVisit;

public interface CustomerVisitRepository extends JpaRepository<CustomerVisit, Long> {
	
	List<CustomerVisit> findByCustomerVisitId(Long customerVisitId);
	
	@Query("select cv.companyName from CustomerVisit cv")
	List<CustomerVisit> getAllCompanyName();
	
	@Query("select c from CustomerVisit c where c.companyName=?1")
	List<CustomerVisit> getByCompanyName(String company);
}
