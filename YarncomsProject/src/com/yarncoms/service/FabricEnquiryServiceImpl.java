package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yarncoms.model.FabricEnquiry;
import com.yarncoms.repository.FabricEnquiryRepository;

@Service
@Transactional
public class FabricEnquiryServiceImpl implements FabricEnquiryService {

	@Resource
	private FabricEnquiryRepository fabricEnquiryRepository;
	
	@Override
	public List<FabricEnquiry> list() {
		// TODO Auto-generated method stub
		return fabricEnquiryRepository.findAll();
	}

	@Override
	public List<FabricEnquiry> getByFabricEnquiryId(Long fabricEnquiryId) {
		// TODO Auto-generated method stub
		return fabricEnquiryRepository.getByEnquiryId(fabricEnquiryId);
	}

	@Override
	public FabricEnquiry save(FabricEnquiry fabric) {
		// TODO Auto-generated method stub
		return fabricEnquiryRepository.save(fabric);
	}

	@Override
	public boolean delete(Long fabricEnquiryId) {
		try {
			FabricEnquiry fabric = new FabricEnquiry();
			fabric.setEnquiryId(fabricEnquiryId);
			fabricEnquiryRepository.delete(fabric);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}


}
