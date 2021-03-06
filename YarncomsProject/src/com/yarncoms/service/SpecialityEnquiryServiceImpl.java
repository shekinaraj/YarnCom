package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yarncoms.model.SpecialityEnquiry;
import com.yarncoms.repository.SpecialityEnquiryRepository;

@Service
public class SpecialityEnquiryServiceImpl implements SpecialityEnquiryService{

	
	@Resource
	private SpecialityEnquiryRepository specialityEnquiryRepository;
	
	@Override
	public List<SpecialityEnquiry> list() {
		// TODO Auto-generated method stub
		return specialityEnquiryRepository.findAll();
	}

	@Override
	public List<SpecialityEnquiry> findByEnquiryId(Long enquiryId) {
		// TODO Auto-generated method stub
		return specialityEnquiryRepository.findByEnquiryId(enquiryId);
	}

	@Override
	public SpecialityEnquiry save(SpecialityEnquiry specialityEnquiry) {
		// TODO Auto-generated method stub
		return specialityEnquiryRepository.save(specialityEnquiry);
	}

	@Override
	public boolean delete(Long specialityEnquiryId) {
		try {
			SpecialityEnquiry specialityEnquiry = new SpecialityEnquiry();
			specialityEnquiry.setEnquiryId(specialityEnquiryId);
			specialityEnquiryRepository.delete(specialityEnquiry);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List<SpecialityEnquiry> getBySpeciality(long enquiryId) {
		// TODO Auto-generated method stub
		return specialityEnquiryRepository.getBySpeciality(enquiryId);
	}

}
