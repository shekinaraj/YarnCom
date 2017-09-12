package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yarncoms.model.Quality;
import com.yarncoms.repository.QualityRepository;

@Service
public class QualityServiceImpl implements QualityService{
	
	@Resource
	private QualityRepository qualityRepository;

	@Override
	public List<Quality> list() {
		// TODO Auto-generated method stub
		return qualityRepository.findAll();
	}

	@Override
	public List<Quality> getById(Long qualityId) {
		// TODO Auto-generated method stub
		return qualityRepository.findByQualityId(qualityId);
	}

	@Override
	public Quality save(Quality quality) {
		// TODO Auto-generated method stub
		return qualityRepository.save(quality);
	}

	@Override
	public boolean delete(Long qualityId) {try {
		Quality quality = new Quality();
		quality.setQualityId(qualityId);
		qualityRepository.delete(quality);
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
	return true;

	}

}
