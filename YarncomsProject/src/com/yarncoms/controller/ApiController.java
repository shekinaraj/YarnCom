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
import com.yarncoms.model.CustomerVisit;
import com.yarncoms.model.FabricEnquiry;
import com.yarncoms.model.UserDetails;
import com.yarncoms.service.BankDetailsService;
import com.yarncoms.service.BankDetailsServiceImpl;
import com.yarncoms.service.CustomerVisitService;
import com.yarncoms.service.FabricEnquiryService;
import com.yarncoms.service.FabricEnquiryServiceImpl;
import com.yarncoms.service.UserDetailsService;

@CrossOrigin(origins = "http:\\localhost:4200" )
@Controller
@RequestMapping("/rest")

public class ApiController {

	@Autowired
	private UserDetailsService UserDetailsServiceImpl;
	@Autowired
	private CustomerVisitService CustomerVisitServiceImpl;	
	@Autowired
	private FabricEnquiryService FabricEnquiryServiceImpl;
	@Autowired
	private BankDetailsService BankDetailsServiceImpl;
	
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
		
		System.out.println(user.getUserName());
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "UserList");
		UserDetails userDetail = UserDetailsServiceImpl.save(user); 
		json.put("savedUser", userDetail.getUserName());
		return json;
	}
	
	@RequestMapping(value="update-UserDetail/{userId}", method=RequestMethod.PUT)
	public  @ResponseBody HashMap updateUserDetail(@PathVariable long userId,@RequestBody UserDetails user){
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "UserList");
		UserDetails userDetail = UserDetailsServiceImpl.save(user);
		json.put("EditedUser", userDetail.getUserName());
		return json;
	}
	
	@RequestMapping(value="delete-UserDetail/{userId}", method=RequestMethod.GET)
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
	

	@RequestMapping(value="login", method=RequestMethod.POST)
	public  @ResponseBody HashMap login(@RequestBody UserDetails  user){
			
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "UserList");
		UserDetails userDetail =(UserDetails) UserDetailsServiceImpl.login(user.getUserName(),user.getPassword());
		System.out.println(userDetail.getEmailId());
		json.put("Retrieved", userDetail);
		return json;
	
	}
	@RequestMapping(value = "get-FabricEnquiryDetail", method = RequestMethod.GET)
	public @ResponseBody HashMap getFabricEnquiryList() {
		HashMap json = new HashMap();

		List<FabricEnquiry> fabricEnquiry = FabricEnquiryServiceImpl.list();
		json.put("Entity", "FabricEnquiry");
		json.put("FabricEnquiry", fabricEnquiry);

		return json;
	}

	@RequestMapping(value = "get-fabricEnquiryDetail/{fabricEnquiryId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getByFabricEnquiryId(@PathVariable("fabricEnquiryId") long id) {
		HashMap json = new HashMap();

		List<FabricEnquiry> fabricEnquiry = FabricEnquiryServiceImpl.getByFabricEnquiryId(id);
		json.put("Entity", "FabricEnquiry");
		json.put("FabricEnquiry", fabricEnquiry);

		return json;
	}
	
	@RequestMapping(value = "save-fabricEnquiryDetails", method= RequestMethod.POST)
	public @ResponseBody HashMap saveFabricEnquiry(@RequestBody FabricEnquiry fabric) {
		HashMap json = new HashMap();
		
		json.put("enquiryType", "BankDetails");
		FabricEnquiry fabricDetails = FabricEnquiryServiceImpl.save(fabric);
		json.put("savedFabricEnquiryDetails", fabricDetails.getFabricEnquiryId());
		
		return json;
	}
	
	@RequestMapping(value = "update-fabricEnquiryDetails/{fabricEnquiryId}", method = RequestMethod.PUT)
	public @ResponseBody HashMap updatFabricEnquiryDetail(@PathVariable("fabricEnquiryId") long id, @RequestBody FabricEnquiry fabric) {
		LinkedHashMap json = new LinkedHashMap();
		
		json.put("enquiryType", "FabricEnquiry");
		FabricEnquiry fabricEnquiry = FabricEnquiryServiceImpl.save(fabric);
		json.put("EditedEnquiry", fabricEnquiry.getFabricEnquiryId());
		
		return json;
	}

	
	@RequestMapping(value = "delete-fabricEnquiryDetails/{fabricEnquiryId}", method = RequestMethod.GET)
	public @ResponseBody HashMap deleteFabricEnquriyDetail(@PathVariable("fabricEnquiryId") long id) {
		System.out.println(id);
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "FabricEnquiry");
		List<FabricEnquiry> fabricEnquiry= FabricEnquiryServiceImpl.getByFabricEnquiryId(id);
		
		if (fabricEnquiry == null) {
			json.put("CurrentEnquiry Not Found", fabricEnquiry.getClass());
			return json;
		}
		boolean fabric = FabricEnquiryServiceImpl.delete(id);
		json.put("Id deleted", fabric);
		return json;
	}
	@RequestMapping(value = "get-bankDetail", method = RequestMethod.GET)
	public @ResponseBody HashMap getBankDetails() {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);

		List<BankDetails> bankdetails = BankDetailsServiceImpl.bankList();
		json.put("entity", "BankDetails");
		json.put("BankDetails", bankdetails);

		return json;
	}

	@RequestMapping(value = "get-bankDetail/{customerId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getBankDetails(@PathVariable("customerId") long customerId) {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);

		List<BankDetails> bankdetails = BankDetailsServiceImpl.findByCustomerId(Long.valueOf(customerId));
		json.put("entity", "BankDetails");
		json.put("BankDetails", bankdetails);

		return json;
	}

	@RequestMapping(value = "save-bankDetail", method = RequestMethod.POST)
	public @ResponseBody HashMap saveBankDetails(@RequestBody BankDetails bank) {
		LinkedHashMap json = new LinkedHashMap();
		
		json.put("enquiryType", "BankDetails");
		BankDetails bankDetails = BankDetailsServiceImpl.save(bank);
		System.out.println(bankDetails.getBankName());
		json.put("savedBankDetails", bankDetails.getCustomerId());
		
		return json;
	}
	
	@RequestMapping(value = "update-bankDetail/{customerId}", method = RequestMethod.PUT)
	public @ResponseBody HashMap updatBankDetail(@PathVariable("customerId") long id, @RequestBody BankDetails bank) {
		LinkedHashMap json = new LinkedHashMap();
		
		json.put("enquiryType", "BankDetails");
		BankDetails bankDetails = BankDetailsServiceImpl.save(bank);
		json.put("EditedBankDetails", bankDetails.getCustomerId());
		
		return json;
	}

	@RequestMapping(value = "delete-BankDetail/{operationId}", method = RequestMethod.GET)
	public @ResponseBody HashMap deleteBankDetail(@PathVariable("operationId") long id) {
		System.out.println(id);
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "BankDetailsList");
		List<BankDetails> bankDetails = BankDetailsServiceImpl.findByCustomerId(id);
		
		if (bankDetails == null) {
			json.put("CurrentBank Not Found", bankDetails.getClass());
			return json;
		}
		boolean bankDetail = BankDetailsServiceImpl.delete(id);
		json.put("Id deleted", bankDetail);
		return json;
	}
	
	
}

