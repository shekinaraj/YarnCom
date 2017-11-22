package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.MaterialTable;

public interface MaterialTableRepository extends JpaRepository<MaterialTable, Long>{
	
	List<MaterialTable> findByMaterialId(Long materialId);
	
	@Query("select m from MaterialTable m")
	List<MaterialTable> getAllMaterial();
	
	@Query("SELECT m.materialId FROM MaterialTable m where m.materialName=?1 and m.isQualityMaterial=?2 and m.cottonType=?3 and m.yarnQuality=?4 and m.BlendRatio=?5 and m.blendPercentageCotton=?6 and m.blendPercentagePolyster=?7 and m.blendPercentageViscose=?8 and m.process=?9 and m.colour=?10 and m.qualityName=?11 and m.fibreBlend=?12 and m.dyed=?13 and m.wasteTypeCotton=?14 and m.wasteTypePolyster=?15 and m.wasteTypeViscose=?16 and m.weavingOtherMaterial=?17 and m.weavingOtherMaterialPercentage=?18 and m.specialityOtherMaterial=?19 and m.specialityOtherMaterialPercentage=?20 and m.virginTypeCotton=?21 and m.virginTypePolyster=?22 and m.virginTypeViscose=?23 and m.blendYarnQuality=?24")
	Long getAllMaterialsMaterialId(String MaterialName,String IsQualityMaterial,String CottonType,String YarnQuality,String BlendRatio,String BlendPercentageCotton,String BlendPercentagePolyster,String BlendPercentageViscose,
			String Process,String Colour,String QualityName,String FibreBlend,String Dyed,String WasteTypeCotton,
			String WasteTypePolyster,String WasteTypeViscose,String WeavingOtherMaterial,String WeavingOtherMaterialPercentage,
			String SpecialityOtherMaterial,String SpecialityOtherMaterialPercentage,String VirginTypeCotton,String VirginTypePolyster,
			String VirginTypeViscose,String BlendYarnQuality);
}