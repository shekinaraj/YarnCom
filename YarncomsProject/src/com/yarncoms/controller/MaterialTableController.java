package com.yarncoms.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yarncoms.model.MaterialTable;
import com.yarncoms.service.MaterialTableService;
import com.yarncoms.service.ProductService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class MaterialTableController {

	@Autowired
	private MaterialTableService MaterialTableServiceImpl;
	
	@Autowired
	private ProductService ProductServiceImpl;
	
	@RequestMapping(value = "get-All-Materials", method = RequestMethod.GET)
	public @ResponseBody HashMap getMaterialDetailsList() {
		HashMap json = new HashMap(); 

		List<MaterialTable> material = MaterialTableServiceImpl.list();
		json.put("Entity", "Material");
		json.put("Material", material);
		return json;
	}

	@RequestMapping(value = "get-materialDetails/{materialId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getMaterialId(@PathVariable("materialId") Long id) {
		HashMap json = new HashMap();

		List<MaterialTable> material = MaterialTableServiceImpl.getByMaterialId(id);
		json.put("Entity", "Material");
		json.put("Material", material);

		return json;
	}
	
	@RequestMapping(value = "save-material", method = RequestMethod.POST)
	public @ResponseBody HashMap saveMaterialTableDetails(@RequestBody MaterialTable material) {
		LinkedHashMap json = new LinkedHashMap();
		List<MaterialTable> mat = MaterialTableServiceImpl.getAllMaterial();
		System.out.println(mat.size());
		
		for(MaterialTable mate:mat) {
			
		
			System.out.println("*********************  "+mate.getMaterialId()+"   &&&&&&&&&&&&&&&&&&&&&&&&");
			
			System.out.println("material name "+material.getMaterialName()+" "+mate.getMaterialName());
			System.out.println("quality material "+material.getIsQualityMaterial()+" "+mate.getIsQualityMaterial());
			System.out.println("cotton type "+material.getCottonType()+" "+mate.getCottonType());
			System.out.println("yarn quality "+material.getYarnQuality()+" "+mate.getYarnQuality());
			System.out.println("Blend Ratio "+material.getBlendRatio()+" "+mate.getBlendRatio());
			System.out.println("Blend cotton "+material.getBlendPercentageCotton()+" "+mate.getBlendPercentageCotton());
			System.out.println("Blend poly "+material.getBlendPercentagePolyster()+" "+mate.getBlendPercentagePolyster());
			System.out.println("Blend viscose "+material.getBlendPercentageViscose()+" "+mate.getBlendPercentageViscose());
			System.out.println("process "+material.getProcess()+" "+mate.getProcess());
			System.out.println("colour "+material.getColour()+" "+mate.getColour());
			System.out.println("Quality name "+material.getQualityName()+" "+mate.getQualityName());
			System.out.println("Fibre blend "+material.getFibreBlend()+" "+mate.getFibreBlend());
			System.out.println("dyed "+material.getDyed()+" "+mate.getDyed());
			System.out.println("waste cotton "+material.getWasteTypeCotton()+" "+mate.getWasteTypeCotton());
			System.out.println("waste poly "+material.getWasteTypePolyster()+" "+mate.getWasteTypePolyster());
			System.out.println("waste viscose "+material.getWasteTypeViscose()+" "+mate.getWasteTypeViscose());
			System.out.println("weaving other "+material.getWeavingOtherMaterial()+" "+mate.getWeavingOtherMaterial());
			System.out.println("weaving other perc "+material.getWeavingOtherMaterialPercentage()+" "+mate.getWeavingOtherMaterialPercentage());
			System.out.println("speciality other "+material.getSpecialityOtherMaterial()+" "+mate.getSpecialityOtherMaterial());
			System.out.println("speciality other perc "+material.getSpecialityOtherMaterialPercentage()+" "+mate.getSpecialityOtherMaterialPercentage());
			System.out.println("virgin cottonn "+material.getVirginTypeCotton()+" "+mate.getVirginTypeCotton());
			System.out.println("virgin poly "+material.getVirginTypePolyster()+" "+mate.getVirginTypePolyster());
			System.out.println("virgin viscose "+material.getVirginTypeViscose()+" "+mate.getVirginTypeViscose());
			System.out.println("yarn quality "+material.getBlendYarnQuality()+" "+mate.getBlendYarnQuality());
		
			if( (material.getMaterialName()).equals(mate.getMaterialName()) && 
				(material.getIsQualityMaterial()).equals(mate.getIsQualityMaterial()) && 
				(material.getCottonType()).equals(mate.getCottonType()) &&
				(material.getYarnQuality()).equals(mate.getYarnQuality()) &&
				(material.getBlendRatio()).equals(mate.getBlendRatio()) &&
				(material.getBlendPercentageCotton()).equals(mate.getBlendPercentageCotton()) &&
				(material.getBlendPercentagePolyster()).equals(mate.getBlendPercentagePolyster()) &&
				(material.getBlendPercentageViscose()).equals(mate.getBlendPercentageViscose()) &&
				(material.getProcess()).equals(mate.getProcess()) &&
				(material.getColour()).equals(mate.getColour()) &&
				(material.getQualityName()).equals(mate.getQualityName()) &&
				(material.getFibreBlend()).equals(mate.getFibreBlend()) &&
				(material.getDyed()).equals(mate.getDyed()) &&
				(material.getWasteTypeCotton()).equals(mate.getWasteTypeCotton()) &&
				(material.getWasteTypePolyster()).equals(mate.getWasteTypePolyster()) &&
				(material.getWasteTypeViscose()).equals(mate.getWasteTypeViscose()) && 
				(material.getWeavingOtherMaterial()).equals(mate.getWeavingOtherMaterial()) &&
				(material.getWeavingOtherMaterialPercentage()).equals(mate.getWeavingOtherMaterialPercentage()) &&
				(material.getSpecialityOtherMaterial()).equals(mate.getSpecialityOtherMaterial()) &&
				(material.getSpecialityOtherMaterialPercentage()).equals(mate.getSpecialityOtherMaterialPercentage()) &&
				(material.getVirginTypeCotton()).equals(mate.getVirginTypeCotton()) &&
				(material.getVirginTypePolyster()).equals(mate.getVirginTypePolyster()) &&
				(material.getVirginTypeViscose()).equals(mate.getVirginTypeViscose()) &&
				(material.getBlendYarnQuality()).equals(mate.getBlendYarnQuality())

				)
		{
			
			System.out.println("If condition Part Printed");
			json.put("Entity", "MaterialTable");
			json.put("MaterialTable", mate.getMaterialId());
			
		}
			else {
				System.out.println("Else Part Printed");
				MaterialTable tab = MaterialTableServiceImpl.save(material);
				json.put("Entity", "MaterialTable");
				json.put("MaterialTable", tab.getMaterialId());
				
			}
		
		}
		return json;
		

	

	}
	
}
