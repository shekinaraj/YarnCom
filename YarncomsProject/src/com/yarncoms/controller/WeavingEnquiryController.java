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
	
	@RequestMapping(value="get-weavingEnquiryDetails/{enquiryId}", method=RequestMethod.GET)
	public @ResponseBody HashMap getWeavingEnquiryById(@PathVariable("enquiryId") Long id) {
		HashMap json = new HashMap();
		//json.put("enquiryType", enquiryType);
		
		List<WeavingEnquiry> weaving = weavingEnquiryService.findByEnquiryId(id);
		json.put("entity", "WeavingEnquiry");
		json.put("WeavingEnquiry", weaving);
		
		return json;	
	}
	
	@RequestMapping(value="save-WeavingEnquiryDetail", method=RequestMethod.POST)
	public  @ResponseBody HashMap saveWeavingEnquirDetails(@RequestBody WeavingEnquiry weavingEnquiry){
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "Save-WeavingEnquiry-Detail");
		weavingEnquiry.setPrefix(weavingEnquiry.getPrefix());
		WeavingEnquiry weaving = weavingEnquiryService.save(weavingEnquiry);
		
		
		EnquiryTable enquiry = new EnquiryTable();
		enquiry.setCvEnquiryId(weaving.getCvId());
		enquiry.setEnquiryId(weaving.getPrefix()+"_0000"+weaving.getEnquiryId().toString());
		enquiry.setEnquiryFrom(weaving.getEnquiryFrom());
		enquiry.setEnquiryFor(weaving.getEnquiryFor());
		enquiry.setCompanyName(weaving.getCompanyName());
		enquiry.setContactPersonName(weaving.getContactPersonName());
		enquiry.setContactPersonEmail(weaving.getContactPersonEmail());
		enquiry.setCountryCode(weaving.getCountryCode());
		enquiry.setContactNo(weaving.getContactNo());
		enquiry.setEnqDate(weaving.getEnquiryDate());
		enquiry.setTechnicalPerson(weaving.getTechnicalPerson());
		enquiry.setEnqStatus("Open");
		enquiry.setEnqLevel(2);
		enquiry.setBrand(weaving.getBrand());
		enquiry.setCount(weaving.getCount());
		enquiry.setProductDescription(weaving.getProductDescription());
		
		
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
	
	@RequestMapping(value = "get-weavingProduct-Name/{enqId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getByWeaving(@PathVariable("enqId") long id) {
		HashMap json = new HashMap();

		List<WeavingEnquiry> weaving = weavingEnquiryService.getByWeaving(id);
		json.put("Entity", "WeavingEnquiry");
		json.put("WeavingEnquiry", weaving);
		
		return json;
	}

}
