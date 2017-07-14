package com.yarncoms.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yarncoms.model.UserDetails;
import com.yarncoms.service.UserDetailsService;


@Controller
public class IndexController {

	@Autowired
	private UserDetailsService userDetailsServiceImpl;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(@RequestParam(defaultValue = "true", name = "loginstatus", required = false) boolean loginstatus, @RequestParam(defaultValue = "false", name = "sessionTimeout", required = false) boolean sessionTimeout, HttpServletRequest request) {
		if(request.getSession().getAttribute("loggedin") != null) {
			return new ModelAndView("redirect:/dashboard");
		}
		
		ModelAndView loginView = new ModelAndView("index/index");
		if(!loginstatus) {
			loginView.addObject("message", "Invalid Credentials!");
		} else if(sessionTimeout) {
			loginView.addObject("message", "Session Timeout!");
		}
		return loginView;
	}
	
	@RequestMapping(value="/getUserDetails", method=RequestMethod.POST)
	public String index(@RequestParam(name = "userId") String userId, HttpServletRequest request) {
		
		userDetailsServiceImpl.findByUserId(Long.valueOf(userId));
		
		request.getSession().setAttribute("loggedin", "true");
		return "redirect:dashboard";
	}
	
}