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
import com.yarncoms.model.FabricProduct;
import com.yarncoms.service.CustomerService;
import com.yarncoms.service.FabricProductService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class FabricProductController {
	
	@Autowired
	private FabricProductService FabricProductServiceImpl;
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "get-FabricProductDetail", method = RequestMethod.GET)
	public @ResponseBody HashMap getFabricProductList() {
		HashMap json = new HashMap();
		
		List<FabricProduct> fabricProduct = FabricProductServiceImpl.list();
		json.put("NumberOfProducts", fabricProduct.size());
		json.put("Entity", "FabricProduct");
		json.put("FabricProduct", fabricProduct);

		return json;
	}
	
	@RequestMapping(value = "get-FabricProductDetail/{productId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getFabricProductId(@PathVariable("productId") long id) {
		HashMap json = new HashMap();

		List<FabricProduct> fabricProduct = FabricProductServiceImpl.getByProductId(id);
		json.put("NumberOfProduct", fabricProduct.size());
		json.put("Entity", "FabricProduct");
		json.put("FabricProduct", fabricProduct);

		return json;
	}
	
	@RequestMapping(value = "save-FabricProductDetail", method = RequestMethod.POST)
	public @ResponseBody HashMap saveFabricProductDetails(@RequestBody FabricProduct grid) {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "FabricProduct");
		FabricProduct fabricProduct = FabricProductServiceImpl.save(grid);
		json.put("savedFabricProductDetails", fabricProduct.getCustomerId());
		
		Customer customer = new Customer();
		customer.setCustomerId(Long.parseLong(fabricProduct.getCustomerId()));
		System.out.println(customer.getCustomerId());
		Customer custProd = customerService.findCustomerId(customer.getCustomerId());
		
		/*customer.setCity(customer.getCity());
		customer.setCompanyName(customer.getCompanyName());
		customer.setContactPersonEmail(customer.getContactPersonEmail());
		customer.setContactPersonName(customer.getContactPersonName());
		customer.setCountry(customer.getCountry());
		customer.setCustomerCategory(customer.getCustomerCategory());
		customer.setCustomerType(customer.getCustomerType());
		customer.setFaxNo(customer.getFaxNo());
		customer.setIntroBy(customer.getIntroBy());
		customer.setMobileNo(customer.getMobileNo());
		customer.setOfficeNo(customer.getOfficeNo());
		customer.setPincode(customer.getPincode());
		customer.setPrefix(customer.getPrefix());
		customer.setRating(customer.getRating());
		customer.setState(customer.getState());
		customer.setStatus(customer.getStatus());
		customer.setStreet(customer.getStreet());*/
		
		Customer cust = customerService.save(custProd);
		json.put("saved ProductCount",cust);
		return json;
	}
	
	@RequestMapping(value = "delete-fabricProductDetails/{fabriproductIdcEnquiryId}", method = RequestMethod.GET)
	public @ResponseBody HashMap deleteFabricProductDetail(@PathVariable("productId") long id) {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "FabricProduct");
		List<FabricProduct> fabricProduct = FabricProductServiceImpl.getByProductId(id);

		if (fabricProduct == null) {
			json.put("Current Product Not Found", fabricProduct.getClass());
			return json;
		}
		boolean fabric = FabricProductServiceImpl.delete(id);
		json.put("Id deleted", fabric);
		return json;
	}

}
