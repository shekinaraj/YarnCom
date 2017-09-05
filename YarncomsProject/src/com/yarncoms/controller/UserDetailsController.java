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

import com.yarncoms.model.UserDetails;
import com.yarncoms.service.UserDetailsService;


@CrossOrigin(origins = "http:\\localhost:4200" )
@Controller
@RequestMapping("/rest/")
public class UserDetailsController {
	
	@Autowired
	private UserDetailsService UserDetailsServiceImpl;
	
	
	//Controllers for UsersDetails
	
	
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
		

			
		@RequestMapping(value="save-UserDetail", method=RequestMethod.POST)
		public  @ResponseBody HashMap saveUserDetail(@RequestBody UserDetails  user){
			System.out.println(user.getUserName());
			LinkedHashMap json = new LinkedHashMap();
			boolean userDetail = UserDetailsServiceImpl.save(user); 
			json.put("Saved-User", userDetail);
			return json;
		}
		
		@RequestMapping(value="update-UserDetail/{userId}", method=RequestMethod.PUT)
		public  @ResponseBody HashMap updateUserDetail(@PathVariable long userId,@RequestBody UserDetails user){
			LinkedHashMap json = new LinkedHashMap();
			json.put("enquiryType", "UserList");
			boolean userDetail = UserDetailsServiceImpl.save(user);
			json.put("EditedUser", userDetail);
			return json;
		}
		
		@RequestMapping(value="delete-UserDetail/{userId}", method=RequestMethod.GET)
		public  @ResponseBody HashMap deleteUserDetail(@PathVariable("userId") long id){
			System.out.println(id);
			LinkedHashMap json = new LinkedHashMap();
			json.put("enquiryType", "UserList");
			boolean userDetail = UserDetailsServiceImpl.delete(id);
			json.put("Id deleted", userDetail);
			return json;
		}
		
		@RequestMapping(value="login", method=RequestMethod.POST)
		public  @ResponseBody HashMap login(@RequestBody UserDetails  user){
				
			LinkedHashMap json = new LinkedHashMap();
			List<UserDetails> userDetail = (List<UserDetails>) UserDetailsServiceImpl.login(user.getUserName(),user.getPassword());
			json.put("Retrieved", userDetail);
			return json;
		
		}



}
