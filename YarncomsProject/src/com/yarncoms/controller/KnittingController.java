package com.yarncoms.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yarncoms.model.Knitting;
import com.yarncoms.service.KnittingService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class KnittingController {
	
	@Autowired
	private KnittingService KnittingServiceImpl;
	
	
	@RequestMapping(value = "get-KnittingDetail", method = RequestMethod.GET)
	public @ResponseBody HashMap getKnittingDetails() {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);

		List<Knitting> Knittdetails = KnittingServiceImpl.Knittinglist();
		json.put("entity", "Knitting");
		json.put("Knitting", Knittdetails);

		return json;
	}
	
	@RequestMapping(value = "save-KnittingDetail", method = RequestMethod.POST)
	public @ResponseBody HashMap saveBankDetails(@RequestBody Knitting Knitt) {
		LinkedHashMap json = new LinkedHashMap();
		
		json.put("enquiryType", "Knitting");
		Knitting knitting = KnittingServiceImpl.save(Knitt);
		json.put("savedKnittingDetail", knitting.getYarnEnquiryId());
		
		return json;
	}

	
	

}
