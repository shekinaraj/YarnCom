package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yarncoms.model.EnquiryTable;
import com.yarncoms.repository.EnquiryTableRepository;

@Service
public class EnquiryTableServiceImpl implements EnquiryTableService{
	
	@Resource
	EnquiryTableRepository enquiryTableRepository;

	@Override
	public List<EnquiryTable> getByEnquiryGridId(Long cvEnquiryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EnquiryTable> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EnquiryTable save(EnquiryTable enquiryTable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Long cvEnquiryId) {
		// TODO Auto-generated method stub
		return false;
	}

		


	
}
