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
import com.yarncoms.model.WeavingEnquiry;
import com.yarncoms.service.EnquiryTableService;
import com.yarncoms.service.WeavingEnquiryService;

@CrossOrigin(origins = "http:\\localhost:4200" )
@Controller
@RequestMapping("/rest")
public class WeavingEnquiryController {
	
	@Autowired
	private WeavingEnquiryService weavingEnquiryService;
	
	@Autowired
	private EnquiryTableService EnquiryTableServiceImpl;
	
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
	public @ResponseBody HashMap getWeavingEnquiryById(@PathVariable Long enquiryId) {
		HashMap json = new HashMap();
		//json.put("enquiryType", enquiryType);
		
		List<WeavingEnquiry> weaving = weavingEnquiryService.findByEnquiryId(enquiryId);
		json.put("entity", "EnquiryDetailId");
		json.put("EnquiryById", weaving);
		
		return json;	
	}
	
	@RequestMapping(value="save-WeavingEnquiryDetail", method=RequestMethod.POST)
	public  @ResponseBody HashMap saveWeavingEnquirDetails(@RequestBody WeavingEnquiry weavingEnquiry){
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "Save-WeavingEnquiry-Detail");
		WeavingEnquiry weaving = weavingEnquiryService.save(weavingEnquiry);
		
		
		EnquiryTable enquiry = new EnquiryTable();
		enquiry.setCvEnquiryId(weaving.getCvId());
		enquiry.setEnquiryId(weaving.getEnquiryId());
		enquiry.setEnquiryFrom(weaving.getEnquiryFrom());
		enquiry.setName(weaving.getName());
		enquiry.setContactNo(weaving.getContactNo());
		enquiry.setEnqDate(weaving.getEnquiryDate());
		enquiry.setTechnicalPerson(weaving.getTechnicalPerson());
		enquiry.setEnqStatus("Open");
		enquiry.setEnqLevel(2);
		
		
		EnquiryTable enquiryTable = EnquiryTableServiceImpl.save(enquiry);
		
		json.put("savedDetails", weaving.getEnquiryId());
		
		return json;
	}
	
	@RequestMapping(value="update-WeavingEnquiryDetail/{enquiryId}", method=RequestMethod.PUT)
	public  @ResponseBody HashMap updateYarnEnquiryDetail(@PathVariable long enquiryId,@RequestBody WeavingEnquiry  weavingEnquiry){
		
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "Update-WeavingEnquiry-Detail");
		WeavingEnquiry weave = weavingEnquiryService.save(weavingEnquiry); 
		json.put("UpdatedDetails", weave.getEnquiryId());
		return json;
	}
	
	@RequestMapping(value="delete-WeavingEnquiryDetail/{enquiryId}", method=RequestMethod.GET)
	public  @ResponseBody HashMap deleteYarnEnquiryDetail(@PathVariable("enquiryId") long id){
		System.out.println(id);
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "WeavingEnquiryList");
		boolean weavingEnquiry = weavingEnquiryService.delete(id);
		json.put("Id deleted", weavingEnquiry);
		return json;
	}

}
