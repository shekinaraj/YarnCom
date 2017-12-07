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

	@Override
	public List<MaterialTable> getAllMaterial() {
		// TODO Auto-generated method stub
		return materialTableRepository.findAll();
	}

	@Override
	public Long getAllMaterialsID(String material, String isQualityMaterial, String yarnQuality, String quality,
			String cottonType, String blendRatio, String blendPercentageCotton, String blendPercentagePolyster,
			String blendPercentageViscose, String process, String colour, String fibreBlend, String dyed,
			String wasteTypeCotton, String wasteTypePolyster, String wasteTypeViscose, String otherMaterial,
			String otherMaterialPercentage) {
		// TODO Auto-generated method stub
		return materialTableRepository.getAllMaterialsMaterialId(material, isQualityMaterial, cottonType,
				yarnQuality,blendRatio,blendPercentageCotton,blendPercentagePolyster,blendPercentageViscose,
				process,colour,quality,fibreBlend,dyed,wasteTypeCotton,
				wasteTypePolyster,wasteTypeViscose, otherMaterialPercentage, otherMaterialPercentage);
	}

	
	
}
