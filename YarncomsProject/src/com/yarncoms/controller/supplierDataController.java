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
import com.yarncoms.model.SupplierData;
import com.yarncoms.service.CustomerService;
import com.yarncoms.service.SupplierDataService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class supplierDataController {
	
	@Autowired
	private SupplierDataService SupplierDataServiceImpl;
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "get-supplierData", method = RequestMethod.GET)
	public @ResponseBody HashMap getSupplierDetailsList() {
		HashMap json = new HashMap();

		List<SupplierData> supplier = SupplierDataServiceImpl.list();
		json.put("Entity", "SupplierData");
		json.put("SupplierData", supplier);

		return json;
	}
	
	@RequestMapping(value = "get-Supplier-Details/{id}", method = RequestMethod.GET)
	public @ResponseBody HashMap getSupplierId(@PathVariable("SupplierId") Long id) {
		HashMap json = new HashMap();

		List<SupplierData> supplier = SupplierDataServiceImpl.getById(id);
		json.put("Entity", "SupplierData");
		json.put("SupplierData", supplier);

		return json;
	}
	
	@RequestMapping(value = "save-Supplier", method = RequestMethod.POST)
	public @ResponseBody HashMap saveSupplierTableDetails(@RequestBody SupplierData supplierData) {
		LinkedHashMap json = new LinkedHashMap();
			System.out.println(supplierData.getContactNo());
			SupplierData data = new SupplierData();
			data.setSupplierName(supplierData.getSupplierName());
			data.setEnquiryId(supplierData.getEnquiryId());
			data.setEmail(supplierData.getEmail());
			data.setCustomerId(supplierData.getCustomerId());
			data.setContactNo(supplierData.getContactNo());
			data.setStatus("level3");
			data.setFlag(supplierData.getFlag());
			data.setSupplierQuote("Quote Not Received");
			data.setPrefix(supplierData.getPrefix());
			
			SupplierData supplier =SupplierDataServiceImpl.saveSupplier(data);
			json.put("Entity", "SavedSupplier");
			json.put("SavedSupplier", supplier);
			
			Customer customer = new Customer();
			Customer cust = customerService.findBySellerCustomerId(supplierData.getCustomerId());
			customer.setCity(cust.getCity());
			customer.setCompanyName(cust.getCompanyName());
			customer.setContactPersonEmail(cust.getContactPersonEmail());
			customer.setContactPersonName(cust.getContactPersonName());
			customer.setCountry(cust.getCountry());
			customer.setCountryCode(cust.getCountryCode());
			customer.setCustomerCategory(cust.getCustomerCategory());
			customer.setCustomerId(cust.getCustomerId());
			customer.setCustomerType(cust.getCustomerType());
			customer.setFaxNo(cust.getFaxNo());
			customer.setFlag(supplierData.getFlag());
			customer.setIntroBy(cust.getIntroBy());
			customer.setMobileNo(cust.getMobileNo());
			customer.setOfficeNo(cust.getOfficeNo());
			customer.setPincode(cust.getPincode());
			customer.setPrefix(cust.getPrefix());
			customer.setRating(cust.getRating());
			customer.setState(cust.getState());
			customer.setStatus(cust.getStatus());
			customer.setStreet(cust.getStreet());
			customer.setViberNo(cust.getViberNo());
			customer.setWebsite(cust.getWebsite());
			customer.setWhatsApp(cust.getWhatsApp());
			
			Customer cus =customerService.save(customer);
			json.put("updatedWithSupplierData", cus);
			
			
			return json;
		}

	
	
	@RequestMapping(value = "update-Supplier/{SupplierId}", method = RequestMethod.PUT)
	public @ResponseBody HashMap updateSupplierTableDetails(@PathVariable("SupplierId") Long id, @RequestBody SupplierData supplierData) {
		System.out.println(supplierData);
		LinkedHashMap json = new LinkedHashMap();
		SupplierData supplier = SupplierDataServiceImpl.saveSupplier(supplierData);
		json.put("UpdatedSupplierDetails", supplier.getId());
		return json;

	}




}
