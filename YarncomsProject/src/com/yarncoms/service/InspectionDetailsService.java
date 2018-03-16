package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.Inspection;

public interface InspectionDetailsService {
	
	List<Inspection> list();

	Inspection findByInspectionTableId(Long inspectionTableId);
	
	List<Inspection> findInspectionWithTech(String status,String date, String tech);
	
	Inspection save(Inspection inspect);
	
	List<Inspection> getByQuery();


}
