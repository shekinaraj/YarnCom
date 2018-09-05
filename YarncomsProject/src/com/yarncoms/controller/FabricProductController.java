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
import com.yarncoms.model.FabricProduct;
import com.yarncoms.service.CustomerProductService;
import com.yarncoms.service.FabricProductService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class FabricProductController {

	@Autowired
	private FabricProductService FabricProductServiceImpl;

	@Autowired
	private CustomerProductService customerProductServiceImpl;
	
	@RequestMapping(value = "get-All-FabricProduct", method = RequestMethod.GET)
	public @ResponseBody HashMap getFabricProductsList() {
		HashMap json = new HashMap();

		List<FabricProduct> fabricProducts = FabricProductServiceImpl.getAllFabricProduct();
		json.put("NumberOfProducts", fabricProducts.size());
		json.put("Entity", "FabricProduct");
		json.put("FabricProduct", fabricProducts);

		return json;
	}

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

		CustomerProduct product = new CustomerProduct();
		product.setFabricProductId(fabricProduct.getProductId());
		product.setBrand(fabricProduct.getBrand());
		product.setProductDescription(fabricProduct.getConstruction());
		product.setCustomerId(fabricProduct.getCustomerId());
		product.setCompanyName(fabricProduct.getCompanyName());
		product.setContactPersonName(fabricProduct.getContactPersonName());
		product.setBrand(fabricProduct.getBrand());
		product.setContactNo(fabricProduct.getContactNo());
		product.setCountryCode(fabricProduct.getCountryCode());
		product.setContactPersonEmail(fabricProduct.getContactPersonEmail());
		product.setViberNo(fabricProduct.getViberNo());
		product.setWebsite(fabricProduct.getWebsite());
		product.setCountry(fabricProduct.getCountry());
		product.setOtherCountry(fabricProduct.getOtherCountry());
		product.setWarpCount(fabricProduct.getWarpCount());
		product.setWeftCount(fabricProduct.getWeftCount());
		product.setEnquiryFor(fabricProduct.getEnquiryFor());
		
		CustomerProduct customerProduct = customerProductServiceImpl.save(product);

		json.put("CustomerProduct", customerProduct.getFabricProductId());

		json.put("savedFabricProductDetails", fabricProduct.getCustomerId());
		return json;
	}

	@RequestMapping(value = "delete-fabricProductDetails/{fabriproductIdcEnquiryId}", method = RequestMethod.GET)
	public @ResponseBody HashMap deleteFabricProductDetail(@PathVariable("productId") long id) {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "FabricProduct");
		List<FabricProduct> fabricProduct = FabricProductServiceImpl.getByProductId(id);

		if (fabricProduct == null) {
			json.put("Product Not Found", fabricProduct.getClass());
			return json;
		}
		boolean fabric = FabricProductServiceImpl.delete(id);
		json.put("Id deleted", fabric);
		return json;
	}

}
