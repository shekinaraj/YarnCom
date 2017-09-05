package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yarncoms.model.Enquiry;
import com.yarncoms.repository.EnquiryDetailsRepository;

@Service
public class EnquiryDetailsServiceImpl implements EnquiryDetailsService{
	
	@Resource
	private EnquiryDetailsRepository enquiryDetailsRepository;

	@Override
	public List<Enquiry> findByEnquiryId(Long enquiryId) {
		// TODO Auto-generated method stub
		return enquiryDetailsRepository.findByEnquiryId(enquiryId);
	}

	@Override
	public Enquiry save(Enquiry enquiry) {
		// TODO Auto-generated method stub
		return enquiryDetailsRepository.save(enquiry);
	}

	@Override
	public List<Enquiry> findAllEnquiry() {
		// TODO Auto-generated method stub
		return enquiryDetailsRepository.findAll();
	}

	@Override
	public boolean delete(Long enquiryId) {
		// TODO Auto-generated method stub
		try {
			Enquiry enquiry = new Enquiry();
			enquiry.setEnquiryId(enquiryId);
			enquiryDetailsRepository.delete(enquiry);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	}


