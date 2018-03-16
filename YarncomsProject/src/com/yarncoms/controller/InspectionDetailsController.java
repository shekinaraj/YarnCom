package com.yarncoms.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yarncoms.model.EnquiryTable;
import com.yarncoms.model.Inspection;
import com.yarncoms.service.InspectionDetailsService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class InspectionDetailsController {
	
	private String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
	
	@Autowired
	private InspectionDetailsService inspectionDetailsServiceImpl;
	
	@RequestMapping(value = "get-All-InspectionDetails", method = RequestMethod.GET)
	public @ResponseBody HashMap getInspectionDetailsList() {
		HashMap json = new HashMap();

		List<Inspection> inspection = inspectionDetailsServiceImpl.list();
		json.put("Entity", "InspectionDetails");
		json.put("InspectionDetails", inspection);

		return json;
	}
	
	@RequestMapping(value = "get-InspectionDetails/{inspectionId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getByInspectionDetailsId(@PathVariable("inspectionId") long id,
			Map<String, Object> map) {
		HashMap json = new HashMap();

		Inspection inspection = inspectionDetailsServiceImpl.findByInspectionTableId(id);
		json.put("Entity", "InspectionDetails");
		json.put("InspectionDetails", inspection);

		return json;
	}
	
	@RequestMapping(value = "save-InspectionDetail", method = RequestMethod.POST)
	public @ResponseBody HashMap saveInspectionDetails(@RequestBody Inspection inspect) {
		LinkedHashMap json = new LinkedHashMap();
		
		json.put("enquiryType", "BankDetails");
		Inspection inspection = inspectionDetailsServiceImpl.save(inspect);
		json.put("savedInspectionDetails", inspection);
		
		return json;
	}
	
	@RequestMapping(value = "getInspectionWithTech/{status},{technical}", method = RequestMethod.GET)
	public @ResponseBody HashMap getEnquiryWithTech(@PathVariable String status, @PathVariable String technical) {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);
		json.put("entity", "Inspection");
		List<Inspection> ins = inspectionDetailsServiceImpl.findInspectionWithTech(status, date, technical);
		json.put("TotalInspection", ins.size());
		json.put("InspectionOnCurrentDate", ins);

		return json;
	}


}
