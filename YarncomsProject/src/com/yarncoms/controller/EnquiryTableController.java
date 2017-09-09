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

import com.yarncoms.model.EnquiryTable;
import com.yarncoms.service.EnquiryTableService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class EnquiryTableController {
	
	@Autowired
	private EnquiryTableService EnquiryTableServiceImpl;

	@RequestMapping(value = "get-EnquiryTable", method = RequestMethod.GET)
	public @ResponseBody HashMap getEnquiryTable() {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);

		List<EnquiryTable> EnquiryTable = EnquiryTableServiceImpl.list();
		json.put("entity", "EnquiryTable");
		json.put("NumberOfEnquiryTableDetails", EnquiryTable.size());
		json.put("EnquiryTable", EnquiryTable);

		return json;
	}

	@RequestMapping(value = "get-EnquiryTable/{EnquiryTableId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getEnquiryId(@PathVariable("EnquiryTableId") long EnquiryTableId) {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);

		List<EnquiryTable> EnquiryTable = EnquiryTableServiceImpl.getByEnquiryGridId(EnquiryTableId);
		json.put("entity", "EnquiryTable");
		json.put("EnquiryTable", EnquiryTable);

		return json;
	}
	
	@RequestMapping(value="getEnquiry/{level},{status}", method=RequestMethod.GET)
	public @ResponseBody HashMap getEnqLevel(@PathVariable int level, @PathVariable String status) {
		HashMap json = new HashMap();
		//json.put("enquiryType", enquiryType);
		json.put("entity", "Customer");
		List<EnquiryTable> enq = EnquiryTableServiceImpl.findEnquiry(level, status);
		json.put("No of Level 1 Enquiry", enq.size());
		json.put("LevelEnquiry", enq);
		
		return json;	
	}

	@RequestMapping(value = "save-EnquiryTable", method = RequestMethod.POST)
	public @ResponseBody HashMap saveEnquiryTableDetails(@RequestBody EnquiryTable grid) {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "EnquiryTable");
		EnquiryTable EnquiryTable = EnquiryTableServiceImpl.save(grid);
		json.put("savedEnquiryTableDetails", EnquiryTable.getCvEnquiryId());
		return json;
	}
}