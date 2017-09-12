package com.yarncoms.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yarncoms.model.Product;
import com.yarncoms.service.ProductService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class ProductController {
	
	@Autowired
	private ProductService ProductServiceImpl;
	
	@RequestMapping(value = "get-ProductDetails", method = RequestMethod.GET)
	public @ResponseBody HashMap getProductDetailsList() {
		HashMap json = new HashMap();

		List<Product> product = ProductServiceImpl.list();
		json.put("Entity", "Product");
		json.put("Product", product);

		return json;
	}
	
	@RequestMapping(value = "get-ProductDetails/{id}", method = RequestMethod.GET)
	public @ResponseBody HashMap getProductId(@PathVariable("productId") Long id) {
		HashMap json = new HashMap();

		List<Product> product = ProductServiceImpl.getById(id);
		json.put("Entity", "Product");
		json.put("Product", product);

		return json;
	}
	
	

}
