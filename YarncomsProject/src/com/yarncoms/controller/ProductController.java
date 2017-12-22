package com.yarncoms.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yarncoms.model.CustomerProduct;
import com.yarncoms.model.Product;
import com.yarncoms.service.CustomerProductService;
import com.yarncoms.service.MaterialTableService;
import com.yarncoms.service.ProductService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class ProductController {

	@Autowired
	private ProductService ProductServiceImpl;

	@Autowired
	private CustomerProductService customerProductServiceImpl;

	@Autowired
	private MaterialTableService MaterialTableServiceImpl;

	@RequestMapping(value = "get-ProductDetails", method = RequestMethod.GET)
	public @ResponseBody HashMap getProductDetailsList() {
		HashMap json = new HashMap();

		List<Product> product = ProductServiceImpl.list();
		json.put("Entity", "Product");
		json.put("Product", product);
		json.put("ProductSize", product.size());

		return json;
	}
	
	@RequestMapping(value = "get-Product-Material", method = RequestMethod.GET)
	public @ResponseBody HashMap getProductMaterialList() {
		HashMap json = new HashMap();

		List<Product> product = ProductServiceImpl.list();
		Stack st = new Stack();
		for(Product prod:product) {
			Object pro = (Object) ProductServiceImpl.getProductDetails(prod.getProductId());
			st.push(pro);
		}
		json.put("Product", st);
		json.put("ProductSize", st.size());

		return json;
	}

	@RequestMapping(value = "get-ProductDetails/{productId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getProductId(@PathVariable("productId") Long id) {
		HashMap json = new HashMap();
		List<Product> product = ProductServiceImpl.getProductDetails(id);
		json.put("Entity", "Product");
		json.put("Product", product);

		return json;
	}

	@RequestMapping(value = "save-ProductTable", method = RequestMethod.POST)
	public @ResponseBody HashMap saveEnquiryTableDetails(@RequestBody Product grid) {
		System.out.println(grid);
		LinkedHashMap json = new LinkedHashMap();
		json.put("ProductType", "Product");

		Product product = ProductServiceImpl.save(grid);

		CustomerProduct Cproduct = new CustomerProduct();
		Cproduct.setYarnProductId(product.getProductId());
		Cproduct.setConstruction(product.getProductDescription());
		Cproduct.setCustomerId(product.getCustomerId());
		CustomerProduct customerProduct = customerProductServiceImpl.save(Cproduct);

		json.put("CustomerProduct", customerProduct.getYarnProductId());

		json.put("savedProductTableDetails", product.getProductId());
		return json;

	}
	
	@RequestMapping(value = "get-Product-via-CompanyName/{name}", method = RequestMethod.GET)
	public @ResponseBody HashMap getProductViaCompanyName(@PathVariable("name") String name) {
		HashMap json = new HashMap();
		List<Product> product = ProductServiceImpl.getProductViaCompanyName(name);
		json.put("Entity", "Product");
		json.put("Product", product);

		return json;
	}
	
	@RequestMapping(value = "get-Product-via-ProductDetails/{detail}", method = RequestMethod.GET)
	public @ResponseBody HashMap getProductViaProductDetails(@PathVariable("detail") String detail) {
		HashMap json = new HashMap();
		List<Product> product = ProductServiceImpl.getProductViaProductDetails(detail);
		json.put("Entity", "Product");
		json.put("Product", product);

		return json;
	}

}
