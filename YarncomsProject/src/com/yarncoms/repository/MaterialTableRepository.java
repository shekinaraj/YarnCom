package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.MaterialTable;

public interface MaterialTableRepository extends JpaRepository<MaterialTable, Long> {

	List<MaterialTable> findByMaterialId(Long materialId);

	@Query("select m from MaterialTable m")
	List<MaterialTable> getAllMaterial();

	@Query("SELECT m.materialId FROM MaterialTable m where m.material=?1 and m.isQualityMaterial=?2 and m.cottonType=?3 and m.yarnQuality=?4 and m.blendRatio=?5 and m.blendCotton=?6 and m.blendPolyester=?7 and m.blendViscose=?8 and m.processed=?9 and m.colour=?10 and m.quality=?11 and m.fibreBlend=?12 and m.dyed=?13 and m.wasteTypeCotton=?14 and m.wasteTypePolyester=?15 and m.wasteTypeViscose=?16 and m.otherMaterial=?17 and m.otherMaterialPercentage=?18")
	Long getAllMaterialsMaterialId(String material, String isQualityMaterial, String yarnQuality, String quality,
			String cottonType, String blendRatio, String blendCotton, String blendPolyester,
			String blendViscose, String processed, String colour, String fibreBlend, String dyed,
			String wasteTypeCotton, String wasteTypePolyester, String wasteTypeViscose, String otherMaterial,
			String otherMaterialPercentage);
}