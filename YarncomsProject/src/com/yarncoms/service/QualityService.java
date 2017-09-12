package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.Quality;

public interface QualityService {
	
	List<Quality> list();
	
	List<Quality> getById(Long qualityId);
	
	Quality save(Quality quality);
	
	boolean delete(Long qualityId);

}
