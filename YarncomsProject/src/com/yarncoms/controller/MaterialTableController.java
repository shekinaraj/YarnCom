package com.yarncoms.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
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
		
		List<MaterialTable> mater = MaterialTableServiceImpl.list();
		
		System.out.println(mater.size());
		
			if(mater.size()==0) {
				System.out.println("If condition Part Printed");
				MaterialTable tab = MaterialTableServiceImpl.save(material);
				json.put("Entity", "MaterialTable");
				json.put("MaterialTable", tab.getMaterialId());
			}
			if(mater.size()>0){
				System.out.println("Else If Part Printed");
				Long mat = MaterialTableServiceImpl.getAllMaterialsID(material.getMaterialName(),material.getIsQualityMaterial(),material.getCottonType(),material.getYarnQuality(),material.getBlendRatio(),material.getBlendPercentageCotton(),material.getBlendPercentagePolyster(),material.getBlendPercentageViscose(),material.getProcess(),material.getColour(),material.getQualityName(),material.getFibreBlend(),material.getDyed(),material.getWasteTypeCotton(),material.getWasteTypePolyster(),material.getWasteTypeViscose(),material.getWeavingOtherMaterial(),material.getWeavingOtherMaterialPercentage(),material.getSpecialityOtherMaterial(),material.getSpecialityOtherMaterialPercentage(),material.getVirginTypeCotton(),material.getVirginTypePolyster(),material.getVirginTypeViscose(),material.getBlendYarnQuality()		);
				json.put("MaterialTable", mat);
				System.out.println("Existing Material Id "+mat);
				try {
				if(mat==null) {
					System.out.println("Else If Else condition Part Printed");
					MaterialTable tab1 = MaterialTableServiceImpl.save(material);
					json.put("Entity", "MaterialTable");
					json.put("MaterialTable", tab1.getMaterialId());
				}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		
		


		return json;

	}
	
}
