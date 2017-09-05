package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yarncoms.model.Knitting;
import com.yarncoms.repository.KnittingEnquiryRepository;

@Service
public class KnittingServiceImpl implements KnittingService {
	
	@Resource
	private KnittingEnquiryRepository knittingRepository;

	@Override
	public List<Knitting> getByKnittingId(Long knittingId) {
		// TODO Auto-generated method stub
		return knittingRepository.getByKnittingId(knittingId);
	}

	@Override
	public List<Knitting> Knittinglist() {
		// TODO Auto-generated method stub
		return knittingRepository.findAll();
	}

	@Override
	public Knitting save(Knitting knitting) {
		// TODO Auto-generated method stub
		return knittingRepository.save(knitting);
	}

	@Override
	public boolean delete(Long knittingEnquiryId) {
		try {
			Knitting knitt = new Knitting();
			knitt.setKnittingId(knittingEnquiryId);
			knittingRepository.delete(knitt);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
