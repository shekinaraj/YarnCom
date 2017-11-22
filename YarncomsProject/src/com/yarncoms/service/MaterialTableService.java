package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.MaterialTable;

public interface MaterialTableService {
	
	List<MaterialTable> list();
	
	List<MaterialTable> getAllMaterial();
	
	Long getAllMaterialsID(String MaterialName,String IsQualityMaterial,String CottonType,String YarnQuality,String BlendRatio,String BlendPercentageCotton,String BlendPercentagePolyster,String BlendPercentageViscose,
			String Process,String Colour,String QualityName,String FibreBlend,String Dyed,String WasteTypeCotton,
			String WasteTypePolyster,String WasteTypeViscose,String WeavingOtherMaterial,String WeavingOtherMaterialPercentage,
			String SpecialityOtherMaterial,String SpecialityOtherMaterialPercentage,String VirginTypeCotton,String VirginTypePolyster,
			String VirginTypeViscose,String BlendYarnQuality);
	
	List<MaterialTable> getByMaterialId(Long id);
	
	MaterialTable save(MaterialTable materialTable);
	
	boolean delete(Long materialId);

}
