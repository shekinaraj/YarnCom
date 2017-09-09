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

import com.yarncoms.model.Enquiry;
import com.yarncoms.service.EnquiryDetailsService;

@CrossOrigin(origins = "http:\\localhost:4200" )
@Controller
@RequestMapping("/rest")
public class EnquiryController {
	
	@Autowired
	private EnquiryDetailsService enquiryDetailsService;
	
	//controllers for Enquiry Details
	
		@RequestMapping(value="get-enquiryDetails-list", method=RequestMethod.GET)
		public @ResponseBody HashMap getAllEnquiryDetails() {
			LinkedHashMap json = new LinkedHashMap();
			json.put("enquiryType", "EnquiryDetails");
			
			List<Enquiry> enquiry = enquiryDetailsService.findAllEnquiry();
			json.put("NumberOfUsers", enquiry.size());
			json.put("AllEnquiryDetails", enquiry);
		
			return json;
		}
		
		@RequestMapping(value="get-enquiryDetails/{enquiryId}", method=RequestMethod.GET)
		public @ResponseBody HashMap getEnquiryById(@PathVariable Long enquiryId) {
			HashMap json = new HashMap();
			//json.put("enquiryType", enquiryType);
			
			List<Enquiry> enquiry = enquiryDetailsService.findByEnquiryId(enquiryId);
			json.put("entity", "EnquiryDetailId");
			json.put("EnquiryById", enquiry);
			
			return json;	
		}
		
		@RequestMapping(value="save-EnquiryDetail", method=RequestMethod.POST)
		public  @ResponseBody HashMap saveEnquirDetails(@RequestBody Enquiry  enquiry){
			LinkedHashMap json = new LinkedHashMap();
			json.put("enquiryType", "Save-Enquiry-Detail");
			Enquiry enq = enquiryDetailsService.save(enquiry); 
			json.put("savedDetails", enq.getEnquiryFrom());
			return json;
		}
		
		@RequestMapping(value="update-enquiryDetail/{enquiryId}", method=RequestMethod.PUT)
		public  @ResponseBody HashMap updateEnquiryDetail(@PathVariable long enquiryId,@RequestBody Enquiry  enquiry){
			LinkedHashMap json = new LinkedHashMap();
			json.put("enquiryType", "Update-Enquiry-Detail");
			Enquiry enq = enquiryDetailsService.save(enquiry); 
			json.put("UpdatedDetailsFor", enquiry.getEnquiryFrom());
			return json;
		}
		
		@RequestMapping(value="delete-enquiryDetail/{enquiryId}", method=RequestMethod.GET)
		public  @ResponseBody HashMap deleteEnquiryDetail(@PathVariable("enquiryId") long id){
			System.out.println(id);
			LinkedHashMap json = new LinkedHashMap();
			json.put("enquiryType", "EnquiryList");
			boolean enquiry = enquiryDetailsService.delete(id);
			json.put("Id deleted", enquiry);
			return json;
		}


}
