package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yarncoms.model.EnquiryTable;
import com.yarncoms.repository.EnquiryTableRepository;

@Service
public class EnquiryTableServiceImpl implements EnquiryTableService {

	@Resource
	EnquiryTableRepository enquiryTableRepository;
	
	@Override
	public List<EnquiryTable> getByEnquiryGridId(Long cvEnquiryId) {
		// TODO Auto-generated method stub
		return enquiryTableRepository.findByCvEnquiryId(cvEnquiryId);
	}

	@Override
	public List<EnquiryTable> list() {
		// TODO Auto-generated method stub
		return enquiryTableRepository.findAll();
	}

	@Override
	public EnquiryTable save(EnquiryTable enquiryTable) {
		// TODO Auto-generated method stub
		return enquiryTableRepository.save(enquiryTable);
	}

	@Override
	public boolean delete(Long cvEnquiryId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<EnquiryTable> findEnquiry(int level, String status) {
		// TODO Auto-generated method stub
		return enquiryTableRepository.findEnquiry(level, status);
	}


	@Override
	public List<EnquiryTable> getByDate(String startDate, String endDate) {
		// TODO Auto-generated method stub
		return enquiryTableRepository.getByDate(startDate, endDate);
	}

	@Override
	public List<EnquiryTable> getDiff() {
		// TODO Auto-generated method stub
		return enquiryTableRepository.getDiff();
	}

	@Override
	public List<EnquiryTable> getByEnquiryIdToSupplierData(String cvEnquiryId) {
		// TODO Auto-generated method stub
		return enquiryTableRepository.getByEnquiryIdToSupplierData(cvEnquiryId);
	}

	@Override
	public List<EnquiryTable> getByEnquiryIdToManageSupplierData(String cvEnquiryId) {
		// TODO Auto-generated method stub
		return enquiryTableRepository.getByEnquiryIdToManageSupplierData(cvEnquiryId);
	}

	@Override
	public List<EnquiryTable> getByEnquiryId(String enquiryId) {
		// TODO Auto-generated method stub
		return enquiryTableRepository.findLevel(enquiryId);
	}

	@Override
	public List<EnquiryTable> findEnquiryWithDate(int level, String status, String date) {
		// TODO Auto-generated method stub
		return enquiryTableRepository.findEnquiryWithDate(level, status, date);
	}

	@Override
	public List<EnquiryTable> findUsingStatus(String status,String technical) {
		// TODO Auto-generated method stub
		return enquiryTableRepository.findUsingStatus(status, technical);
	}

	@Override
	public List<EnquiryTable> findEnquiryWithTech(int level, String status, String date, String tech) {
		// TODO Auto-generated method stub
		return enquiryTableRepository.findEnquiryWithTech(level, status, date, tech);
	}

	@Override
	public List<EnquiryTable> getYarnOrFabric(String enquiryFor) {
		// TODO Auto-generated method stub
		return enquiryTableRepository.getYarnOrFabric(enquiryFor);
	}

}
