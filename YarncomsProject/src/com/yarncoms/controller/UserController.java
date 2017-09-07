package com.yarncoms.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yarncoms.model.User;
import com.yarncoms.model.UserRole;
import com.yarncoms.service.CustomUserDetailsService;
import com.yarncoms.service.UserService;

@CrossOrigin(origins = "http:\\localhost:4200" )
@Controller
@RequestMapping("/rest")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CustomUserDetailsService customUserImpl;
	
	@RequestMapping(value="get-user-list", method=RequestMethod.GET)
	public @ResponseBody HashMap getUserList() {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "UserList");
		
		List<User> user = userService.list();
		json.put("NumberOfUsers", user.size());
		json.put("UserList", user);
		
		return json;
	}
	
	@RequestMapping(value="save-User", method=RequestMethod.POST)
	public  @ResponseBody HashMap saveUserDetail(@RequestBody User  user){
		user.setPassword(user.getUserName()+"123");
		System.out.println(user.getUserName());
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "UserList");
		User userDetail = userService.save(user); 
		json.put("savedUser", userDetail.getUserName());
		
		UserRole role = new UserRole();
		role.setRole(userDetail.getRole());
		role.setUserid(userDetail.getUserId());
		UserRole rol = customUserImpl.role(role);
		json.put("SavedRole", rol);
		return json;
	}


}
