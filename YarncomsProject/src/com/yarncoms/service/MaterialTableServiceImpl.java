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
	public Long getAllMaterialsID(String MaterialName,String IsQualityMaterial,String CottonType,String YarnQuality,String BlendRatio,String BlendPercentageCotton,String BlendPercentagePolyster,String BlendPercentageViscose,
			String Process,String Colour,String QualityName,String FibreBlend,String Dyed,String WasteTypeCotton,
			String WasteTypePolyster,String WasteTypeViscose,String WeavingOtherMaterial,String WeavingOtherMaterialPercentage,
			String SpecialityOtherMaterial,String SpecialityOtherMaterialPercentage,String VirginTypeCotton,String VirginTypePolyster,
			String VirginTypeViscose,String BlendYarnQuality) {
		
		System.out.println("Impl "+MaterialName);
		return materialTableRepository.getAllMaterialsMaterialId(MaterialName, IsQualityMaterial, CottonType,
				YarnQuality,BlendRatio,BlendPercentageCotton,BlendPercentagePolyster,BlendPercentageViscose,
				Process,Colour,QualityName,FibreBlend,Dyed,WasteTypeCotton,
				WasteTypePolyster,WasteTypeViscose,WeavingOtherMaterial,WeavingOtherMaterialPercentage,
				SpecialityOtherMaterial,SpecialityOtherMaterialPercentage,VirginTypeCotton,VirginTypePolyster,
				VirginTypeViscose,BlendYarnQuality);
	}

	
}
