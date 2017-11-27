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
import com.yarncoms.service.BankDetailsService;

@CrossOrigin(origins = "http:\\localhost:4200" )
@Controller
@RequestMapping("/rest")

public class BankDetailController {

	
	@Autowired
	private BankDetailsService BankDetailsServiceImpl;
	
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