package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yarncoms.model.Inspection;
import com.yarncoms.repository.InspectionDetailsRepository;

@Service
public class InspectionDetailsServiceImpl implements InspectionDetailsService {
	
	@Resource
	private InspectionDetailsRepository inspectionDetailsRepository;

	@Override
	public List<Inspection> list() {
		// TODO Auto-generated method stub
		return inspectionDetailsRepository.findAll();
	}

	@Override
	public Inspection findByInspectionTableId(Long inspectionTableId) {
		// TODO Auto-generated method stub
		return inspectionDetailsRepository.findByInspectionTableId(inspectionTableId);
	}

	@Override
	public Inspection save(Inspection inspect) {
		// TODO Auto-generated method stub
		return inspectionDetailsRepository.save(inspect);
	}

	@Override
	public List<Inspection> getByQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Inspection> findInspectionWithTech(String status, String date, String tech) {
		// TODO Auto-generated method stub
		return inspectionDetailsRepository.findInspectionWithTech(status, date, tech);
	}

}
