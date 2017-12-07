package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.MaterialTable;

public interface MaterialTableService {
	
	List<MaterialTable> list();
	
	List<MaterialTable> getAllMaterial();
	
//	Long getAllMaterialsID(String material, String isQualityMaterial, String CottonType, String yarnQuality, String BlendRatio,
//			String BlendPercentageCotton, String BlendPercentagePolyster, String BlendPercentageViscose, String Process,
//			String Colour, String Quality, String FibreBlend, String Dyed, String WasteTypeCotton,
//			String WasteTypePolyster, String WasteTypeViscose, String OtherMaterial, String OtherMaterialPercentage);
	
	List<MaterialTable> getByMaterialId(Long id);
	
	MaterialTable save(MaterialTable materialTable);
	
	boolean delete(Long materialId);

	Long getAllMaterialsID(String material, String isQualityMaterial, String yarnQuality, String quality,
			String cottonType, String blendRatio, String blendPercentageCotton, String blendPercentagePolyster,
			String blendPercentageViscose, String process, String colour, String fibreBlend, String dyed,
			String wasteTypeCotton, String wasteTypePolyster, String wasteTypeViscose, String otherMaterial,
			String otherMaterialPercentage);

	
}
