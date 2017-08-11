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

import com.yarncoms.model.CustomerVisit;
import com.yarncoms.model.UserDetails;
import com.yarncoms.service.CustomerVisitService;
import com.yarncoms.service.UserDetailsService;

@CrossOrigin(origins = "http:\\localhost:4200" )
@Controller
@RequestMapping("/rest")

public class ApiController {

	@Autowired
	private UserDetailsService UserDetailsServiceImpl;
	@Autowired
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
	
	@RequestMapping(value="save-UserDetail", method=RequestMethod.POST)
	public  @ResponseBody HashMap saveUserDetail(@RequestBody UserDetails  user){
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "UserList");
		UserDetails userDetail = UserDetailsServiceImpl.save(user); 
		json.put("savedUser", userDetail.getUserName());
		return json;
	}
	
	@RequestMapping(value="update-UserDetail/{userName}", method=RequestMethod.PUT)
	public  @ResponseBody HashMap updateUserDetail(@PathVariable String userName,@RequestBody UserDetails user){
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "UserList");
		UserDetails userDetail = UserDetailsServiceImpl.editByUserName(user);
		json.put("EditedUser", userDetail.getUserName());
		return json;
	}
	
	@RequestMapping(value="delete-UserDetail/{userId}", method=RequestMethod.DELETE)
	public  @ResponseBody HashMap deleteUserDetail(@PathVariable("userId") long id){
		System.out.println(id);
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "UserList");
		List<UserDetails> userDetails = UserDetailsServiceImpl.findByUserId(id);
		System.out.println(userDetails);
		if(userDetails == null){
			json.put("User Not Found", userDetails.getClass() );
			return json;
			}
		boolean userDetail = UserDetailsServiceImpl.delete(id);
		json.put("Id deleted", userDetail);
		return json;
	}
	
	
}

