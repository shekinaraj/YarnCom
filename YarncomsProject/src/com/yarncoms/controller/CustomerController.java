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

import com.yarncoms.model.BankDetails;
import com.yarncoms.model.Customer;
import com.yarncoms.model.CustomerVisit;
import com.yarncoms.service.BankDetailsService;
import com.yarncoms.service.CustomerService;

@CrossOrigin(origins = "http:\\localhost:4200" )
@Controller
@RequestMapping("/rest")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private BankDetailsService BankDetailsServiceImpl;
	
	@RequestMapping(value = "get-customer/{customerId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getUser(@PathVariable Long customerId) {
		HashMap json = new HashMap();

		List<Customer> customer = customerService.findByCustomerId(customerId);
		json.put("entity", "customer");
		json.put("Customer", customer);

		return json;
	}
	
	@RequestMapping(value = "get-customervisit-list/{CustomerType}/{CompanyName}", method = RequestMethod.GET)
	public @ResponseBody HashMap getCustomerList(@PathVariable String CustomerType, @PathVariable String CompanyName) {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "CustomerList");
		String status = "Open";
		Customer cust = customerService.findCustomerTypeAndCompanyName(CustomerType, CompanyName, status);
		json.put("CustomerList", cust);

		return json;
	}
	
	
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
		customer.setPrefix(customer.getPrefix());
		customer.setFlag("N");
		Customer cust = customerService.save(customer); 
		json.put("savedDetails", cust.getCompanyName());
		System.out.println(cust.getContactPersonName());
		BankDetails bank =  new BankDetails();
		bank.setCompanyName(cust.getCompanyName());
		bank.setCustomerId(cust.getPrefix() +"-0000"+cust.getCustomerId().toString());
		BankDetails bank1 =  BankDetailsServiceImpl.save(bank);
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
	
	@RequestMapping(value="get/{customerType},{status}", method=RequestMethod.GET)
	public @ResponseBody HashMap getUser(@PathVariable String customerType, @PathVariable String status) {
		
		HashMap json = new HashMap();
		//json.put("enquiryType", enquiryType);
		json.put("entity", "Customer");
		List<Customer> cust = customerService.find(customerType, status);
		json.put("Customer", cust);
		json.put("No of Buyers", cust.size());
		
		return json;	
	}
	
	@RequestMapping(value="close-customer/{customerId}", method=RequestMethod.PUT)
	public  @ResponseBody HashMap updateStatus(@PathVariable int customerId,@RequestBody Customer  customer){
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "Update-customer-Detail");
		customer.setStatus("Close");
		Customer cust = customerService.save(customer); 
		json.put("UpdatedDetailsFor",  cust.getCompanyName());
		return json;
	}
	
}
