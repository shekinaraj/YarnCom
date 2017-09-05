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

import com.yarncoms.model.WeavingEnquiry;
import com.yarncoms.model.YarnEnquiry;
import com.yarncoms.service.WeavingEnquiryService;

@CrossOrigin(origins = "http:\\localhost:4200" )
@Controller
@RequestMapping("/rest")
public class WeavingEnquiryController {
	
	@Autowired
	private WeavingEnquiryService weavingEnquiryService;
	
	@RequestMapping(value="get-weavingEnquiryDetails-list", method=RequestMethod.GET)
	public @ResponseBody HashMap getWeavingEnquiryDetails() {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "WeavingEnquiryDetails");
		
		List<WeavingEnquiry> weavingEnquiry = weavingEnquiryService.findAllWeavingEnquiry();
		json.put("NumberOfWeavingEnquiry", weavingEnquiry.size());
		json.put("AllWeavingEnquiryDetails", weavingEnquiry);
	
		return json;
	}
	
	@RequestMapping(value="get-weavingEnquiryDetails/{weavingEnquiryId}", method=RequestMethod.GET)
	public @ResponseBody HashMap getWeavingEnquiryById(@PathVariable Long weavingEnquiryId) {
		HashMap json = new HashMap();
		//json.put("enquiryType", enquiryType);
		
		List<WeavingEnquiry> weaving = weavingEnquiryService.findByWeavingEnquiryId(weavingEnquiryId);
		json.put("entity", "WeavingEnquiryDetailId");
		json.put("WeavingEnquiryById", weaving);
		
		return json;	
	}
	
	@RequestMapping(value="save-WeavingEnquiryDetail", method=RequestMethod.POST)
	public  @ResponseBody HashMap saveWeavingEnquirDetails(@RequestBody WeavingEnquiry weavingEnquiry){
		LinkedHashMap json = new LinkedHashMap();
		System.out.println(weavingEnquiry.getMaterial());
		json.put("enquiryType", "Save-WeavingEnquiry-Detail");
		WeavingEnquiry weaving = weavingEnquiryService.save(weavingEnquiry);
		System.out.println(weaving.getWeavingEnquiryId());
		json.put("savedDetails", weaving.getWeavingEnquiryId());
		return json;
	}
	
	@RequestMapping(value="update-WeavingEnquiryDetail/{weavingEnquiryId}", method=RequestMethod.PUT)
	public  @ResponseBody HashMap updateYarnEnquiryDetail(@PathVariable long weavingEnquiryId,@RequestBody WeavingEnquiry  weavingEnquiry){
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "Update-WeavingEnquiry-Detail");
		WeavingEnquiry weave = weavingEnquiryService.save(weavingEnquiry); 
		json.put("UpdatedDetails", weave.getWeavingEnquiryId());
		return json;
	}
	
	@RequestMapping(value="delete-WeavingEnquiryDetail/{weavingEnquiryId}", method=RequestMethod.GET)
	public  @ResponseBody HashMap deleteYarnEnquiryDetail(@PathVariable("weavingEnquiryId") long id){
		System.out.println(id);
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "WeavingEnquiryList");
		boolean weavingEnquiry = weavingEnquiryService.delete(id);
		json.put("Id deleted", weavingEnquiry);
		return json;
	}

}
