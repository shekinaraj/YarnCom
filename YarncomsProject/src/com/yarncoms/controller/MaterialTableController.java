package com.yarncoms.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yarncoms.model.MaterialTable;
import com.yarncoms.model.Product;
import com.yarncoms.service.MaterialTableService;
import com.yarncoms.service.ProductServiceImpl;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class MaterialTableController {

	@Autowired
	private MaterialTableService MaterialTableServiceImpl;
	
	@RequestMapping(value = "get-All-Materials", method = RequestMethod.GET)
	public @ResponseBody HashMap getMaterialDetailsList() {
		HashMap json = new HashMap();

		List<MaterialTable> material = MaterialTableServiceImpl.list();
		json.put("Entity", "Material");
		json.put("Material", material);
		return json;
	}

	@RequestMapping(value = "get-materialDetails/{id}", method = RequestMethod.GET)
	public @ResponseBody HashMap getMaterialId(@PathVariable("materialId") Long id) {
		HashMap json = new HashMap();

		List<MaterialTable> material = MaterialTableServiceImpl.getByMaterialId(id);
		json.put("Entity", "Material");
		json.put("Material", material);

		return json;
	}

	
}
