package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yarncoms.model.WeavingEnquiry;
import com.yarncoms.repository.WeavingEnquiryRepository;
@Service
public class WeavingEnquiryServiceImpl implements WeavingEnquiryService{
	
	@Resource
	private WeavingEnquiryRepository weavingEnquiryRepository;

	@Override
	public List<WeavingEnquiry> findByEnquiryId(Long enquiryId) {
		// TODO Auto-generated method stub
		return weavingEnquiryRepository.findByEnquiryId(enquiryId);
	}

	@Override
	public WeavingEnquiry save(WeavingEnquiry weavingEnquiry) {
		// TODO Auto-generated method stub
		System.out.println(weavingEnquiry.getBlendPercentageCotton());
		return weavingEnquiryRepository.save(weavingEnquiry);
		
	}

	@Override
	public List<WeavingEnquiry> findAllWeavingEnquiry() {
		// TODO Auto-generated method stub
		return weavingEnquiryRepository.findAll();
	}

	@Override
	public boolean delete(Long enquiryId) {
		// TODO Auto-generated method stub
		try {
			WeavingEnquiry weavingEnquiry = new WeavingEnquiry();
			weavingEnquiry.setEnquiryId(enquiryId);
			weavingEnquiryRepository.delete(weavingEnquiry);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
