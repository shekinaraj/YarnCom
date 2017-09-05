package com.yarncoms.controller;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yarncoms.model.CustomerVisit;
import com.yarncoms.service.CustomerVisitService;

@CrossOrigin(origins = "http:\\localhost:4200" )
@Controller
@RequestMapping("/rest")
public class CustomerVisitController {

	
	@Autowired
	private CustomerVisitService CustomerVisitServiceImpl;
	
	
	// Controllers for CustomerVisitDetails
	
	@RequestMapping(value="get-customervisitdetails/{customerId}", method=RequestMethod.GET)
	public @ResponseBody HashMap getCustomer(@PathVariable String customerId) {
		HashMap json = new HashMap();
		//json.put("enquiryType", enquiryType);
		
		List<CustomerVisit> customer = CustomerVisitServiceImpl.findByCustomerVisitId(Long.valueOf(customerId));
		json.put("entity", "CustomerVisit");
		json.put("CustomerVisit", customer);
		
		return json;
	}
	
	@RequestMapping(value="get-customervisitlist", method=RequestMethod.GET)
	public @ResponseBody HashMap getCustomerList() {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "CustomerList");
		
		
		List<CustomerVisit> customerVisit = CustomerVisitServiceImpl.findCustomerVisit();
		json.put("NumberOfCustomer", customerVisit.size());
		json.put("CustomerVisit", customerVisit);
	
		return json;
	}

		
	/*@RequestMapping(value="change-password/{pass}", method=RequestMethod.PUT)
	public  @ResponseBody HashMap updateUserDetail(@PathVariable String pass,@RequestBody UserDetails user){
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "UserList");
		json.put("password before change", pass);
		UserDetails userDetail = UserDetailsServiceImpl.save(user);
		json.put("password after change", userDetail.getPassword());
		return json;
	}*/
	
		
		
		
}

