package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.MaterialTable;

public interface MaterialTableService {
	
	List<MaterialTable> list();
	
	List<MaterialTable> getByMaterialId(Long id);
	
	MaterialTable save(MaterialTable materialTable);
	
	boolean delete(Long materialId);

}
