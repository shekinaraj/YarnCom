package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarncoms.model.Quality;

public interface QualityRepository extends JpaRepository<Quality, Long> {
	
	List<Quality> findByQualityId(Long quality);

}
