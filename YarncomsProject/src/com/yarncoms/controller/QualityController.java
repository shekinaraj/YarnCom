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
import com.yarncoms.model.Quality;
import com.yarncoms.service.QualityService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class QualityController {
	
	@Autowired
	private QualityService QualityServiceImpl;
	
	@RequestMapping(value = "get-Quality-Details", method = RequestMethod.GET)
	public @ResponseBody HashMap getQualityDetailsList() {
		HashMap json = new HashMap();

		List<Quality> quality = QualityServiceImpl.list();
		json.put("Entity", "Quality");
		json.put("Quality", quality);

		return json;
	}
	
	@RequestMapping(value = "get-Quality-details/{id}", method = RequestMethod.GET)
	public @ResponseBody HashMap getQualityId(@PathVariable("qualityId") Long id) {
		HashMap json = new HashMap();

		List<Quality> quality = QualityServiceImpl.getById(id);
		json.put("Entity", "Quality");
		json.put("Quality", quality);

		return json;
	}
	
	@RequestMapping(value = "save-quality", method = RequestMethod.POST)
	public @ResponseBody HashMap saveQualityTableDetails(@RequestBody Quality quality) {
		LinkedHashMap json = new LinkedHashMap();
		json.put("MaterialTable", "material");
		Quality savedQuality = QualityServiceImpl.save(quality);
		json.put("Quality", savedQuality.getQualityId());
		return json;

	}


}
