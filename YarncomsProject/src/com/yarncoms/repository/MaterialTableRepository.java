package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarncoms.model.MaterialTable;

public interface MaterialTableRepository extends JpaRepository<MaterialTable, Long>{
	
	List<MaterialTable> findByMaterialId(Long materialId);


}
