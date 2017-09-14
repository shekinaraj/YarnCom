package com.yarncoms.controller;


import java.text.SimpleDateFormat;
import java.util.Calendar;
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
import com.yarncoms.model.CustomerVisit;
import com.yarncoms.model.EnquiryTable;
import com.yarncoms.service.BankDetailsService;
import com.yarncoms.service.CustomerVisitService;
import com.yarncoms.service.EnquiryTableService;

@CrossOrigin(origins = "http:\\localhost:4200" )
@Controller
@RequestMapping("/rest")
public class CustomerVisitController {
	
	private String date= new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
	
	@Autowired
	private CustomerVisitService CustomerVisitServiceImpl;
	
	@Autowired
	private EnquiryTableService EnquiryTableServiceImpl;
	
	
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
	
	@RequestMapping(value = "save-customer-visit", method=RequestMethod.POST)
	public  @ResponseBody HashMap saveCustomerDetails(@RequestBody CustomerVisit  customervisit){
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "Save-Customer-Detail");
		customervisit.setPrefix(customervisit.getPrefix());
		CustomerVisit cust = CustomerVisitServiceImpl.save(customervisit); 
		json.put("savedDetails", cust.getCompanyName());
		
		EnquiryTable enquiry = new EnquiryTable();
		enquiry.setEnquiryId(cust.getPrefix() +"-0000"+cust.getCustomerVisitId().toString());
		enquiry.setEnquiryFrom("Customer");
		enquiry.setName(cust.getContactPersonName());
		enquiry.setContactNo(cust.getMobileNumber());
		enquiry.setEnqDate(cust.getDateOfVisit());
		enquiry.setEnqLevel(1);
		enquiry.setEnqStatus("Open");
		enquiry.setTechnicalPerson(cust.getTechnicalPerson());
		
		String enquiryDate = cust.getDateOfVisit();
		String purpose = cust.getPurposeOfVisit();
		System.out.println(enquiryDate);
		System.out.println(purpose);
		System.out.println(date);
		if(enquiryDate.equals(date)&&purpose.equals("Enquiry")) {
			System.out.println(enquiry);
			EnquiryTable enq1 = EnquiryTableServiceImpl.save(enquiry);
			json.put("Enquiry", enq1);
		}
		else {
			System.out.println("Cant save in Enquiry");
		}
		
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

