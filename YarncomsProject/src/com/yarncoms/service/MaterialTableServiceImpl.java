package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yarncoms.model.MaterialTable;
import com.yarncoms.repository.MaterialTableRepository;

@Service
@Transactional
public class MaterialTableServiceImpl implements MaterialTableService {

	@Resource
	private MaterialTableRepository materialTableRepository;

	@Override
	public List<MaterialTable> list() {
		// TODO Auto-generated method stub
		return materialTableRepository.findAll();
	}

	@Override
	public List<MaterialTable> getByMaterialId(Long id) {
		// TODO Auto-generated method stub
		return materialTableRepository.findByMaterialId(id);
	}

	@Override
	public MaterialTable save(MaterialTable materialTable) {
		// TODO Auto-generated method stub
		return materialTableRepository.save(materialTable);
	}

	@Override
	public boolean delete(Long materialId) {
		try {
			MaterialTable material = new MaterialTable();
			material.setMaterialId(materialId);
			materialTableRepository.delete(material);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
