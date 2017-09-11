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

import com.yarncoms.model.SpecialityEnquiry;
import com.yarncoms.service.SpecialityEnquiryService;

@CrossOrigin(origins = "http:\\localhost:4200" )
@Controller
@RequestMapping("/rest")
public class SpecialityEnquiryController {
	
	@Autowired
	private SpecialityEnquiryService specialityEnquiryService;
	
	// Controllers for Speciality_Enquiry

		@RequestMapping(value="get-specialityEnquiryDetails-list", method=RequestMethod.GET)
		public @ResponseBody HashMap getSpecialityEnquiryDetails() {
			LinkedHashMap json = new LinkedHashMap();
			json.put("enquiryType", "SpecialityEnquiryDetails");
			
			List<SpecialityEnquiry> specialityEnquiry = specialityEnquiryService.list();
			json.put("NumberOfEnquiry", specialityEnquiry.size());
			json.put("AllEnquiryDetails", specialityEnquiry);
		
			return json;
		}
		
		@RequestMapping(value="get-specialityEnquiryDetails/{specialityEnquiryId}", method=RequestMethod.GET)
		public @ResponseBody HashMap getSpecialityEnquiryById(@PathVariable Long specialityEnquiryId) {
			HashMap json = new HashMap();
			//json.put("enquiryType", enquiryType);
			
			List<SpecialityEnquiry> specialityEnquiry = specialityEnquiryService.findByEnquiryId(specialityEnquiryId);
			json.put("entity", "SpecialityEnquiryDetailId");
			json.put("SpecialityEnquiryDetailId", specialityEnquiry);
			
			return json;	
		}
		
		@RequestMapping(value="save-specialityEnquiryDetail", method=RequestMethod.POST)
		public  @ResponseBody HashMap saveSpecialityEnquirDetails(@RequestBody SpecialityEnquiry specialityEnquiry){
			LinkedHashMap json = new LinkedHashMap();
			json.put("enquiryType", "Saved-SpecialityEnquiry-Detail");
			SpecialityEnquiry spclEnquiry = specialityEnquiryService.save(specialityEnquiry); 
			json.put("savedDetails", spclEnquiry.getEnquiryId());
			return json;
		}
		
		@RequestMapping(value="update-specialityEnquiryDetail/{specialityEnquiryId}", method=RequestMethod.PUT)
		public  @ResponseBody HashMap updateSpecialityEnquirDetails(@PathVariable("specialityEnquiryId") Long id,@RequestBody SpecialityEnquiry specialityEnquiry){
			LinkedHashMap json = new LinkedHashMap();
			json.put("enquiryType", "Updated-SpecialityEnquiry-Detail");
			SpecialityEnquiry spclEnquiry = specialityEnquiryService.save(specialityEnquiry); 
			json.put("savedDetails", spclEnquiry.getEnquiryId());
			return json;
		}
		
		@RequestMapping(value="delete-SpecialityEnquiryDetail/{specialityEnquiryId}", method=RequestMethod.GET)
		public  @ResponseBody HashMap deleteSpecialityEnquiryDetail(@PathVariable("specialityEnquiryId") long id){
			System.out.println(id);
			LinkedHashMap json = new LinkedHashMap();
			json.put("enquiryType", "deleteSpecialityEnquiryList");
			boolean specialityEnquiry = specialityEnquiryService.delete(id);
			json.put("Id deleted", specialityEnquiry);
			return json;
		}



}