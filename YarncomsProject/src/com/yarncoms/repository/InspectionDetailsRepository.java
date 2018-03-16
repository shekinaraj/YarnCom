package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.Inspection;

public interface InspectionDetailsRepository extends JpaRepository<Inspection, Long> {
	
	Inspection findByInspectionTableId(Long inspectionTableId);
	
	@Query("SELECT i FROM Inspection i where i.status = ?1 AND i.inspectionDate<=?2 AND i.technicalPerson = ?3")
	List<Inspection> findInspectionWithTech(String status,String date, String tech);

}
