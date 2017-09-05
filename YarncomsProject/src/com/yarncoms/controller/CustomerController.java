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

import com.yarncoms.model.Customer;
import com.yarncoms.model.Enquiry;
import com.yarncoms.model.UserDetails;
import com.yarncoms.service.CustomerService;

@CrossOrigin(origins = "http:\\localhost:4200" )
@Controller
@RequestMapping("/rest")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="get-customer-list", method=RequestMethod.GET)
	public @ResponseBody HashMap getAllCustomerDetails() {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "CustomerDetails");
		
		List<Customer> customer = customerService.list();
		json.put("NumberOfCustomers", customer.size());
		json.put("AllCustomers", customer);
	
		return json;
	}
	
	@RequestMapping(value = "save-customer", method=RequestMethod.POST)
	public  @ResponseBody HashMap saveCustomerDetails(@RequestBody Customer  customer){
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "Save-Customer-Detail");
		Customer cust = customerService.save(customer); 
		json.put("savedDetails", cust.getCompanyName());
		return json;
	}
	
	@RequestMapping(value="update-customer/{customerId}", method=RequestMethod.PUT)
	public  @ResponseBody HashMap updateEnquiryDetail(@PathVariable int customerId,@RequestBody Customer  customer){
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "Update-customer-Detail");
		Customer cust = customerService.save(customer); 
		json.put("UpdatedDetailsFor",  cust.getCompanyName());
		return json;
	}
	
	@RequestMapping(value="get/{customerType}", method=RequestMethod.GET)
	public @ResponseBody HashMap getUser(@PathVariable String customerType) {
		HashMap json = new HashMap();
		//json.put("enquiryType", enquiryType);
		json.put("entity", "Customer");
		List<Customer> cust = customerService.filter(customerType);
		json.put("Customer", cust);
		json.put("No of Buyers", cust.size());
		
		return json;	
	}


}
