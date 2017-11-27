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

import com.yarncoms.model.CustomerProduct;
import com.yarncoms.service.CustomerProductService;

@CrossOrigin(origins = "http:\\localhost:4200" )
@Controller
@RequestMapping("/rest")
public class CustomerProductController {
	
	@Autowired
	private CustomerProductService customerProductServiceImpl;
	
	@RequestMapping(value = "get-CustomerProduct-Detail", method = RequestMethod.GET)
	public @ResponseBody HashMap getCustomerProductList() {
		HashMap json = new HashMap();
		
		List<CustomerProduct> fabricProduct = customerProductServiceImpl.list();
		json.put("Entity", "CustomerProduct");
		json.put("CustomerProduct", fabricProduct);

		return json;
	}
	
	@RequestMapping(value = "save-CustomerProduct-Detail", method = RequestMethod.POST)
	public @ResponseBody HashMap saveCustomerProductDetails(@RequestBody CustomerProduct product) {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "CustomerProduct");
		CustomerProduct customerProduct = customerProductServiceImpl.save(product);		
		json.put("CustomerProduct", customerProduct.getCustomerId());
		return json;
	}
	
	@RequestMapping(value = "get-Product/{customerId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getProductDetails(@PathVariable String customerId) {
		HashMap json = new HashMap();
		List<CustomerProduct> yarnFabric = customerProductServiceImpl.findByCustomerId(customerId);		
		json.put("entity", "Formula");
		json.put("Formula", yarnFabric);
		return json;
	}
	
	@RequestMapping(value = "delete-CustomerProduct/{customerProductId}", method = RequestMethod.GET)
	public @ResponseBody HashMap deleteBankDetail(@PathVariable("customerProductId") long customerProductId) {
		System.out.println(customerProductId);
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "BankDetailsList");
		List<CustomerProduct> custPro = customerProductServiceImpl.findByCustomerProductId(customerProductId);
		
		if (custPro == null) {
			json.put("CurrentBank Not Found", custPro.getClass());
			return json;
		}
		boolean bankDetail = customerProductServiceImpl.delete(customerProductId);
		json.put("Id deleted", custPro);
		return json;
	}


}
