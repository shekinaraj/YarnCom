package com.yarncoms.controller;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yarncoms.model.CustomerVisit;
import com.yarncoms.model.UserDetails;
import com.yarncoms.service.CustomerVisitService;
import com.yarncoms.service.UserDetailsService;



@Controller
@RequestMapping("/rest")
public class ApiController {

	@Autowired
	private UserDetailsService UserDetailsServiceImpl;
	private CustomerVisitService CustomerVisitServiceImpl;	
	@RequestMapping(value="get-userdetails/{userId}", method=RequestMethod.GET)
	public @ResponseBody HashMap getUser(@PathVariable String userId) {
		HashMap json = new HashMap();
		//json.put("enquiryType", enquiryType);
		
		List<UserDetails> user = UserDetailsServiceImpl.findByUserId(Long.valueOf(userId));
		json.put("entity", "User");
		json.put("user", user);
		
		return json;
	}
	
	@RequestMapping(value="get-userdetails-list", method=RequestMethod.GET)
	public @ResponseBody HashMap getUserList() {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "UserList");
		
		
		List<UserDetails> user = UserDetailsServiceImpl.findUserDetails();
		json.put("NumberOfUsers", user.size());
		json.put("UserList", user);
	
		return json;
	}
	
	
	
	
	
	
	
/*	
	
	
	@RequestMapping(value="get-customervisitdetails/{customerId}", method=RequestMethod.GET)
	public @ResponseBody HashMap getCustomerId(@PathVariable String customerId) {
		HashMap json = new HashMap();
		//json.put("enquiryType", enquiryType);
		
		CustomerVisit customer = CustomerVisitServiceImpl.findByUserId(Long.valueOf(customerId));
		json.put("entity", "CustomerVisit");
		json.put("CustomerVisit", customer);
		
		return json;
	}
	
	@RequestMapping(value="get-userdetails-list", method=RequestMethod.GET)
	public @ResponseBody HashMap getUserList() {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "UserList");
		
		
		List<UserDetails> user = UserDetailsServiceImpl.findUserDetails();
		json.put("NumberOfUsers", user.size());
		json.put("UserList", user);
	
		return json;
	}
	*/
}

