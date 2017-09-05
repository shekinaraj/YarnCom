package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yarncoms.model.YarnEnquiry;
import com.yarncoms.repository.YarnEnquiryRepository;

@Service
public class YarnEnquiryServiceImpl implements YarnEnquiryService {

	@Resource
	private YarnEnquiryRepository yarnEnquiryRepository;

	@Override
	public List<YarnEnquiry> list() {

		return yarnEnquiryRepository.findAll();
	}

	@Override
	public List<YarnEnquiry> findByYarnEnquiryId(Long yarnEnquiryId) {
		// TODO Auto-generated method stub
		return yarnEnquiryRepository.findByYarnEnquiryId(yarnEnquiryId);
	}

	@Override
	public YarnEnquiry save(YarnEnquiry yarn) {
		// TODO Auto-generated method stub
		return yarnEnquiryRepository.save(yarn);
	}

	@Override
	public boolean delete(Long yarnEnquiryId) {
		try {
			YarnEnquiry yarn = new YarnEnquiry();
			yarn.setYarnEnquiryId(yarnEnquiryId);
			yarnEnquiryRepository.delete(yarn);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
