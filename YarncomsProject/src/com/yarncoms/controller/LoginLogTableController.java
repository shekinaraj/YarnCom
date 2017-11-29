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

import com.yarncoms.model.LoginLogTable;
import com.yarncoms.model.UserDetails;
import com.yarncoms.service.LoginLogTableService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class LoginLogTableController {
	
	@Autowired
	private LoginLogTableService loginLogTableService;
	
	@RequestMapping(value = "get-loginLog-list", method = RequestMethod.GET)
	public @ResponseBody HashMap getLoginList() {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "LoginList");

		List<LoginLogTable> log = loginLogTableService.findAll();
		json.put("NumberOfUsers", log.size());
		json.put("LoginList", log);

		return json;
	}
	
	@RequestMapping(value = "get-loginLog/{loginId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getLoginById(@PathVariable("loginId") Long id) {
		HashMap json = new HashMap();
		json.put("enquiryType", "LoginById");

		LoginLogTable log = loginLogTableService.getById(id);
		json.put("LoginById", log);

		return json;
	}
	
	@RequestMapping(value = "save-LoginLog", method = RequestMethod.POST)
	public @ResponseBody HashMap saveLogInDetail(@RequestBody LoginLogTable login) {
		LinkedHashMap json = new LinkedHashMap();
		
		LoginLogTable log = loginLogTableService.save(login);
		json.put("LoggedInUser", log);
		return json;
	}


}
