package com.yarncoms.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import com.yarncoms.model.EnquiryTable;
import com.yarncoms.model.Inspection;
import com.yarncoms.service.CustomerService;
import com.yarncoms.service.CustomerVisitService;
import com.yarncoms.service.EnquiryTableService;
import com.yarncoms.service.InspectionDetailsService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class CustomerVisitController {

	Date curDate = new Date();
	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	String date = format.format(curDate);

	@Autowired
	private CustomerService customerService;

	@Autowired
	private CustomerVisitService CustomerVisitServiceImpl;

	@Autowired
	private EnquiryTableService EnquiryTableServiceImpl;
	
	@Autowired
	private InspectionDetailsService inspectionDetailsServiceImpl;

	// Controllers for CustomerVisitDetails

	@RequestMapping(value = "get-customervisitdetails/{customerId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getCustomer(@PathVariable String customerId) {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);

		List<CustomerVisit> customer = CustomerVisitServiceImpl.findByCustomerVisitId(Long.valueOf(customerId));
		json.put("entity", "CustomerVisit");
		json.put("CustomerVisit", customer);

		return json;
	}
	
	@RequestMapping(value = "get-AllCustomeVisitList", method = RequestMethod.GET)
	public @ResponseBody HashMap getAllCustomeVisit() {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);

		List<CustomerVisit> customer = CustomerVisitServiceImpl.findCustomerVisit();
		json.put("entity", "CustomerVisit");
		json.put("CustomerVisit", customer);

		return json;
	}
	
	@RequestMapping(value = "get-detailsOn-techie/{tech}", method = RequestMethod.GET)
	public @ResponseBody HashMap getCustomerByTech(@PathVariable("tech") String tech) {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);

		List<CustomerVisit> customer = CustomerVisitServiceImpl.getByTechieName(tech);
		json.put("entity", "CustomerVisit");
		json.put("CustomerVisit", customer);

		return json;
	}

	@RequestMapping(value = "get-detailsOn-company/{companyName}", method = RequestMethod.GET)
	public @ResponseBody HashMap getCustomerOnCompany(@PathVariable String companyName) {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);

		List<CustomerVisit> customer = CustomerVisitServiceImpl.findByCompanyName(companyName);
		json.put("entity", "CustomerVisit");
		json.put("CustomerVisit", customer);

		return json;
	}
	
	@RequestMapping(value = "get-purposeOf-customerVisit/{purpose}", method = RequestMethod.GET)
	public @ResponseBody HashMap findUsingPurposeOfVisit(@PathVariable String purpose) {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);

		List<CustomerVisit> customer = CustomerVisitServiceImpl.findUsingPurposeOfVisit(purpose);
		json.put("entity", "CustomerVisit");
		json.put("CustomerVisit", customer);

		return json;
	}


	@RequestMapping(value = "get-Company-Names", method = RequestMethod.GET)
	public @ResponseBody HashMap getAllCompanyNames() {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "CustomerList");
		List<CustomerVisit> customerVisit = CustomerVisitServiceImpl.getAllCompanyNames();
		json.put("CustomerVisit", customerVisit);
		return json;
	}

	@RequestMapping(value = "save-customer-visit", method = RequestMethod.POST)
	public @ResponseBody HashMap saveCustomerDetails(@RequestBody CustomerVisit customervisit) throws ParseException {
		
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "Save-Customer-Detail");
		customervisit.setPrefix(customervisit.getPrefix());
		CustomerVisit cust = CustomerVisitServiceImpl.save(customervisit);
		json.put("savedDetails", cust.getCompanyName());
		
		//Enquiry Controller.............
		EnquiryTable enquiry = new EnquiryTable();
		enquiry.setEnquiryId(cust.getPrefix() + "-0000" + cust.getCustomerVisitId().toString());
		enquiry.setEnquiryFrom("Customer");
		enquiry.setCompanyName(cust.getCompanyName());
		enquiry.setContactPersonName(cust.getContactPersonName());
		enquiry.setCountryCode	(cust.getCountryCode());
		enquiry.setContactNo(cust.getMobileNumber());
		enquiry.setEnqDate(cust.getDateOfVisit());
		enquiry.setEnqLevel(1);
		enquiry.setEnqStatus("Open");
		enquiry.setTechnicalPerson(cust.getTechnicalPerson());
		enquiry.setProductDescription("From Customer Visit Data");

		String enquiryDate = cust.getDateOfVisit();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = format.parse(enquiryDate);
		Date date2 = format.parse(date);
		
		String purpose = cust.getPurposeOfVisit();
		System.out.println(enquiryDate);
		System.out.println(purpose);
		System.out.println(date);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date1.compareTo(date2));
		System.out.println(enquiryDate.equals(date)+"   "+date1.compareTo(date2));
		if((enquiryDate.equals(date))||(date1.compareTo(date2) == 1)){
		if (purpose.equals("Enquiry")) {
			EnquiryTable enq1 = EnquiryTableServiceImpl.save(enquiry);
			json.put("Enquiry", enq1);
		} else {
			System.out.println("Cant save in Enquiry");
		}
		}
		
		
		
		Customer customer = new Customer();
		String Statuss = "Open";
		List<Customer> allCustomer = customerService.getBuyerOrSeller(cust.getCompanyName(), Statuss);
		
		try {
			if(allCustomer.size()==0) {
			System.out.println("111111111111");
			json.put("Enquiry", "Values Already Exist");
			System.out.println("New Customer");
			customer.setCompanyName(cust.getCompanyName());
			customer.setContactPersonEmail(cust.getEmailId());
			customer.setContactPersonName(cust.getContactPersonName());
			customer.setCountryCode(cust.getCountryCode());
			customer.setMobileNo(cust.getMobileNumber());
			customer.setCustomerType(cust.getCustomerType());
			customer.setStatus("Open");
			Customer cus = customerService.save(customer);
			json.put("Enquiry", cus);
			
		} else if(allCustomer.size() > 0) {
			
			if(allCustomer.get(0).getCustomerType().equals(customervisit.getCustomerType())) {
				System.out.println("2222222222");
				json.put("enquiryType", "Save-Customer-Detail");
				customer.setPrefix(customer.getPrefix());
				customer.setCustomerId(allCustomer.get(0).getCustomerId());
				customer.setCompanyName(cust.getCompanyName());
				customer.setContactPersonEmail(cust.getEmailId());
				customer.setContactPersonName(cust.getContactPersonName());
				customer.setCountryCode(cust.getCountryCode());
				customer.setMobileNo(cust.getMobileNumber());
				customer.setCustomerType(allCustomer.get(0).getCustomerType());
				customer.setStatus("Open");
				Customer cus = customerService.save(customer);
				json.put("Enquiry", cus);	
			}
		
		
		else {
			System.out.println(!allCustomer.get(0).getCustomerType().equals(customervisit.getCustomerType())+"Compared Output");
			if(!allCustomer.get(0).getCustomerType().equals(customervisit.getCustomerType())) {
				System.out.println("33333333");
				json.put("enquiryType", "Save-Customer-Detail");
				customer.setPrefix(customer.getPrefix());
				customer.setCustomerId(allCustomer.get(0).getCustomerId());
				customer.setCustomerType("Both");
				customer.setCompanyName(cust.getCompanyName());
				customer.setContactPersonEmail(cust.getEmailId());
				customer.setContactPersonName(cust.getContactPersonName());
				customer.setCountryCode(cust.getCountryCode());
				customer.setMobileNo(cust.getMobileNumber());
				customer.setStatus("Open");
				Customer cus = customerService.save(customer);
				json.put("Enquiry", cus);
			}
		}
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	

	
		
		//InspectionController.........
				Inspection inspection = new Inspection();
				inspection.setCvInspectionId(cust.getPrefix() + "-0000" + cust.getCustomerVisitId().toString());
				inspection.setCompanyName(cust.getCompanyName());
				inspection.setContactPersonName(cust.getContactPersonName());
				inspection.setCountryCode(cust.getCountryCode());
				inspection.setCustomerType("Seller");
				inspection.setStatus("Open");
				inspection.setDesignation(cust.getDesignation());
				inspection.setEmailId(cust.getEmailId());
				inspection.setInspectionDate(cust.getDateOfVisit());
				inspection.setMobileNumber(cust.getMobileNumber());
				inspection.setTechnicalPerson(cust.getTechnicalPerson());
				inspection.setTypeOfIndustry(cust.getTypeOfIndustry());
				
				String purposeForInspection = cust.getPurposeOfVisit();
				System.out.println(enquiryDate);
				System.out.println(purpose);
				System.out.println(date);
				System.out.println(date1);
				System.out.println(date2);
				System.out.println(date1.compareTo(date2));
				System.out.println(enquiryDate.equals(date)+"   "+date1.compareTo(date2));
				if((enquiryDate.equals(date))||(date1.compareTo(date2) == 1)){
				if (purposeForInspection.equals("Inspection")) {
					Inspection ins = inspectionDetailsServiceImpl.save(inspection);
					json.put("Inspection", ins);
				} else {
					System.out.println("Cant save in Inspection");
				}
				}
				
				

		return json;
		/*
		 * @RequestMapping(value="change-password/{pass}", method=RequestMethod.PUT)
		 * public @ResponseBody HashMap updateUserDetail(@PathVariable String
		 * pass,@RequestBody UserDetails user){ LinkedHashMap json = new
		 * LinkedHashMap(); json.put("enquiryType", "UserList");
		 * json.put("password before change", pass); UserDetails userDetail =
		 * UserDetailsServiceImpl.save(user); json.put("password after change",
		 * userDetail.getPassword()); return json; }
		 */

	}
}
