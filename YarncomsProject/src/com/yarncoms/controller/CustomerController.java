package com.yarncoms.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

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
	
	@RequestMapping(value = "get-customervisit-list/{CompanyName}", method = RequestMethod.GET)
	public @ResponseBody HashMap getCustomerList(@PathVariable String CompanyName) {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "CustomerList");
		String status = "Open";
		Customer cust = customerService.findCustomerTypeAndCompanyName(CompanyName, status);
		json.put("CustomerList", cust);

		return json;
	}
	
	@RequestMapping(value = "get-Companies-Name", method = RequestMethod.GET)
	public @ResponseBody HashMap getAllCompanyNames() {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "CustomerList");
		List<Customer> customer = customerService.getByCompaniesName();
		json.put("CustomerComapany", customer);
		return json;
	}
	
	@RequestMapping(value = "get-activeList", method = RequestMethod.GET)
	public @ResponseBody HashMap activeList() {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "CustomerList");
		List<Customer> customer = customerService.activeList();
		json.put("ActiveCustomer", customer);
		return json;
	}
	
	@RequestMapping(value = "get-dormantList", method = RequestMethod.GET)
	public @ResponseBody HashMap dormantList() {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "CustomerList");
		List<Customer> customer = customerService.dormantList();
		json.put("DormantCustomer", customer);
		return json;
	}
	
	@RequestMapping(value = "get-customerStatusType/{status},{type}", method = RequestMethod.GET)
	public @ResponseBody HashMap getCustomerByStatusAndType(@PathVariable String status,@PathVariable String type) {
		System.out.println(status+"    controller    "+ type);
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "CustomerList");
		List<Customer> customer = customerService.getCustomerByStatusAndType(status, type);
		json.put("CustomerStatusType", customer);
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
		
		List<Customer> cus = customerService.getBuyerOrSeller(customer.getCompanyName(), customer.getStatus());
		try {
		if(cus.size() == 0) {
			System.out.println("11111111");
		json.put("enquiryType", "Save-Customer-Detail");
		customer.setPrefix(customer.getPrefix());
		customer.setFlag("N");
		Customer cust = customerService.save(customer);
		json.put("SavedCustomer",cust);
		BankDetails bank =  new BankDetails();
		bank.setCompanyName(cust.getCompanyName());
		bank.setCustomerId(cust.getPrefix() +"-0000"+cust.getCustomerId().toString());
		BankDetails bank1 =  BankDetailsServiceImpl.save(bank);
		json.put("SavedBankCustomer",bank1);
		
		}
		
		else if(cus.size() > 0) {
			
			if(cus.get(0).getCustomerType().equals(customer.getCustomerType())) {
				System.out.println("2222222222");
				json.put("enquiryType", "Save-Customer-Detail");
				customer.setPrefix(customer.getPrefix());
				customer.setCustomerId(cus.get(0).getCustomerId());
				customer.setFlag("N");
				Customer cust = customerService.save(customer);
				json.put("SavedCustomer",cust);
				BankDetails bank =  new BankDetails();
				bank.setCompanyName(cust.getCompanyName());
				bank.setCustomerId(cust.getPrefix() +"-0000"+cust.getCustomerId().toString());
				BankDetails bank1 =  BankDetailsServiceImpl.save(bank);
				json.put("SavedBankCustomer",bank1);	
			}
		
		
		else {
			System.out.println(!cus.get(0).getCustomerType().equals(customer.getCustomerType())+"Compared Output");
			if(!cus.get(0).getCustomerType().equals(customer.getCustomerType())) {
				System.out.println("33333333");
				json.put("enquiryType", "Save-Customer-Detail");
				customer.setPrefix(customer.getPrefix());
				customer.setCustomerId(cus.get(0).getCustomerId());
				customer.setFlag("N");
				customer.setCustomerType("Both");
				Customer cust = customerService.save(customer);
				json.put("SavedCustomer",cust);
				BankDetails bank =  new BankDetails();
				bank.setCompanyName(cust.getCompanyName());
				bank.setCustomerId(cust.getPrefix() +"-0000"+cust.getCustomerId().toString());
				BankDetails bank1 =  BankDetailsServiceImpl.save(bank);
				json.put("SavedBankCustomer",bank1);
			}
		}
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
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
	
	@RequestMapping(value="getCountryWiseCustomer/{customerType},{Country}", method=RequestMethod.GET)
	public @ResponseBody HashMap getByCountryWiseCustomer(@PathVariable String customerType, @PathVariable String Country) {
		
		HashMap json = new HashMap();
		//json.put("enquiryType", enquiryType);
		json.put("entity", "Customer");
		List<Customer> cust = customerService.getByCountryWiseCustomer(customerType, Country);
		json.put("CountryWiseCustomer", cust);
		json.put("No of Customer", cust.size());
		
		return json;	
	}
	
	@RequestMapping(value="getCountryWiseAllCustomer/{Country}", method=RequestMethod.GET)
	public @ResponseBody HashMap getByCountryWiseAllCustomer(@PathVariable String Country) {
		
		HashMap json = new HashMap();
		//json.put("enquiryType", enquiryType);
		json.put("entity", "Customer");
		List<Customer> cust = customerService.getByCountryWiseAll(Country);
		json.put("CountryWiseAllCustomer", cust);
		json.put("No of Customer", cust.size());
		
		return json;	
	}
	
	@RequestMapping(value="get-All-Country", method=RequestMethod.GET)
	public @ResponseBody HashMap getAllCountry() {
		HashMap json = new HashMap();
		//json.put("enquiryType", enquiryType);
		json.put("entity", "Customer");
		
		
		List<Object> list = customerService.getAllForAllCountry();
		list.add("India");
		list.add("Sri Lanka");
		list.add("China");
		list.add("Pakistan");
		list.add("Nepal");
		List<Object> country = list.stream().distinct().collect(Collectors.toList());
		
		List<Object> countrylist = new ArrayList<>(); 
		
		for(Object i : country) {
			if(i != null) {
				countrylist.add(i);
			}
		}
		
		json.put("AllCountry", countrylist);
		json.put("No of Country", countrylist.size());
		
		return json;	
	}
	
	@RequestMapping(value="get-All-Country-CustomerType/{type}", method=RequestMethod.GET)
	public @ResponseBody HashMap getAllCountryWithCustomerType(@PathVariable String type) {
		HashMap json = new HashMap();
		//json.put("enquiryType", enquiryType);
		json.put("entity", "Customer");
		
		
		List<Object> country = customerService.getAllCountry(type);
		
		List<Object> countryList = country.stream().distinct().collect(Collectors.toList());
		
		List<Object> allCountrylist = new ArrayList<>();
		
		
		for(Object i : countryList) {
			if(i != null) {
				System.out.println(i);
				allCountrylist.add(i);
				
			}
		}
		

		
		json.put("allCountrylist", allCountrylist);

		
		List<Object> otherCountry = customerService.getAllCountryOtherCountry(type);
		
		List<Object> otherCountryList = otherCountry.stream().distinct().collect(Collectors.toList());
		
		List<Object> allOtherCountryList = new ArrayList<>();
		
		for(Object i : otherCountryList) {
			if(i != null) {
				allOtherCountryList.add(i);
			}
		}
		
		json.put("allOtherCountryList", allOtherCountryList);
		
		List<Object> list =  new ArrayList<>();
		
		
		Collections.addAll(list, allCountrylist.toArray(new String[0]));
		Collections.addAll(list, allOtherCountryList.toArray(new String[0]));
		
		
		
	      
	      
		json.put("AllCountry", list);
		//json.put("No of Country", allCountries.size());
		
		return json;	
	}
	
	@RequestMapping(value="close-customer/{customerId}", method=RequestMethod.PUT)
	public  @ResponseBody HashMap updateStatus(@PathVariable String customerId,@RequestBody Customer  customer){
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "Update-customer-Detail");
		customer.setStatus("Close");
		boolean cust = customerService.delete(customerId); 
		json.put("UpdatedDetailsFor", cust);
		return json;
	}
	
}
