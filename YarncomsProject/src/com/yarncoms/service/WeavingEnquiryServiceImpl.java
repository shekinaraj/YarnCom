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
	public List<WeavingEnquiry> findByWeavingEnquiryId(Long weavingEnquiryId) {
		// TODO Auto-generated method stub
		return weavingEnquiryRepository.findByWeavingEnquiryId(weavingEnquiryId);
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
	public boolean delete(Long weavingEnquiryId) {
		// TODO Auto-generated method stub
		try {
			WeavingEnquiry weavingEnquiry = new WeavingEnquiry();
			weavingEnquiry.setWeavingEnquiryId(weavingEnquiryId);
			weavingEnquiryRepository.delete(weavingEnquiry);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
