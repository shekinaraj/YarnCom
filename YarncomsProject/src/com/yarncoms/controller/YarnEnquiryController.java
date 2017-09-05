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

import com.yarncoms.model.YarnEnquiry;
import com.yarncoms.service.YarnEnquiryService;

@CrossOrigin(origins = "http:\\localhost:4200" )
@Controller
@RequestMapping("/rest")
public class YarnEnquiryController {
	
	@Autowired
	private YarnEnquiryService yarnEnquiryService;
	
	// Controllers for Yarn_Enquiry
	
		@RequestMapping(value="get-yarnEnquiryDetails-list", method=RequestMethod.GET)
		public @ResponseBody HashMap getYarnEnquiryDetails() {
			LinkedHashMap json = new LinkedHashMap();
			json.put("enquiryType", "YarnEnquiryDetails");
			
			List<YarnEnquiry> yarn = yarnEnquiryService.list();
			json.put("NumberOfUsers", yarn.size());
			json.put("AllEnquiryDetails", yarn);
		
			return json;
		}
		
		@RequestMapping(value="get-yarnEnquiryDetails/{yarnEnquiryId}", method=RequestMethod.GET)
		public @ResponseBody HashMap getYarnEnquiryById(@PathVariable Long yarnEnquiryId) {
			HashMap json = new HashMap();
			//json.put("enquiryType", enquiryType);
			
			List<YarnEnquiry> yarnEnquiry = yarnEnquiryService.findByYarnEnquiryId(yarnEnquiryId);
			json.put("entity", "YarnEnquiryDetailId");
			json.put("YarnEnquiryById", yarnEnquiry);
			
			return json;	
		}
		
		@RequestMapping(value="save-YarnEnquiryDetail", method=RequestMethod.POST)
		public  @ResponseBody HashMap saveYarnEnquirDetails(@RequestBody YarnEnquiry yarnEnquiry){
			LinkedHashMap json = new LinkedHashMap();
			json.put("enquiryType", "Save-YarnEnquiry-Detail");
			YarnEnquiry yarn = yarnEnquiryService.save(yarnEnquiry); 
			json.put("savedDetails", yarn.getYarnEnquiryId());
			return json;
		}
		
		@RequestMapping(value="update-YarnEnquiryDetail/{yarnEnquiryId}", method=RequestMethod.PUT)
		public  @ResponseBody HashMap updateYarnEnquiryDetail(@PathVariable long yarnEnquiryId,@RequestBody YarnEnquiry  yarnEnquiry){
			LinkedHashMap json = new LinkedHashMap();
			json.put("enquiryType", "Update-YarnEnquiry-Detail");
			YarnEnquiry yarn = yarnEnquiryService.save(yarnEnquiry); 
			json.put("UpdatedDetails", yarn.getYarnEnquiryId());
			return json;
		}
		

		@RequestMapping(value="delete-YarnEnquiryDetail/{yarnEnquiryId}", method=RequestMethod.GET)
		public  @ResponseBody HashMap deleteYarnEnquiryDetail(@PathVariable("yarnEnquiryId") long id){
			System.out.println(id);
			LinkedHashMap json = new LinkedHashMap();
			json.put("enquiryType", "YarnEnquiryList");
			boolean yarnEnquiry = yarnEnquiryService.delete(id);
			json.put("Id deleted", yarnEnquiry);
			return json;
		}


}
