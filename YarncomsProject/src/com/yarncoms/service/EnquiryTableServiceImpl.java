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

}
