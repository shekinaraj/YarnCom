package com.yarncoms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yarncoms.model.CustomerProduct;
import com.yarncoms.model.CustomizedBuyerSeller;
import com.yarncoms.model.EnquiryTable;
import com.yarncoms.service.CustomerProductService;
import com.yarncoms.service.EnquiryTableService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class YarnFabricBuyerSeller {

	@Autowired
	private CustomerProductService customerProductServiceImpl;

	@Autowired
	private EnquiryTableService EnquiryTableServiceImpl;

	@RequestMapping(value = "get-All-Yarn-Buyer/Seller", method = RequestMethod.GET)
	public @ResponseBody HashMap getAllYarnBuyerSeller() {
		HashMap json = new HashMap();

		String enquiryFor = "Yarn";
		List<EnquiryTable> buyer = EnquiryTableServiceImpl.getYarnOrFabric(enquiryFor);
		// json.put("BuyerYarn", buyer);
		json.put("BuyerYarnSize", buyer.size());

		List<CustomerProduct> seller = customerProductServiceImpl.getYarnOrFabric(enquiryFor);
		// json.put("SellerYarn", seller);
		json.put("SellerYarnSize", seller.size());

		Stack allList = new Stack();
		Stack<CustomizedBuyerSeller> buyerList = new Stack<CustomizedBuyerSeller>();
		Stack<CustomizedBuyerSeller> sellerList = new Stack<CustomizedBuyerSeller>();

		try {
			int i = 0;
			while (i < buyer.size()) {
				CustomizedBuyerSeller yarnBuyer = new CustomizedBuyerSeller();
				yarnBuyer.setBrand(buyer.get(i).getBrand());
				yarnBuyer.setEnquiryFor(buyer.get(i).getEnquiryFor());
				yarnBuyer.setCompanyName(buyer.get(i).getCompanyName());
				yarnBuyer.setContactPersonName(buyer.get(i).getContactPersonName());
				yarnBuyer.setContactPersonEmail(buyer.get(i).getContactPersonEmail());
				yarnBuyer.setCountryCode(buyer.get(i).getCountryCode());
				yarnBuyer.setContactNo(buyer.get(i).getContactNo());
				yarnBuyer.setCount(buyer.get(i).getCount());
				yarnBuyer.setProductDescription(buyer.get(i).getProductDescription());
				System.out.println(yarnBuyer.getCompanyName());

				allList.push(yarnBuyer);

				//json.put("yarnBuyer", buyerList.size());
				i++;

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Stack sellerList = new Stack();
		try {

			int j = 0;

			while (j < seller.size()) {
				CustomizedBuyerSeller yarnSeller = new CustomizedBuyerSeller();
				yarnSeller.setBrand(seller.get(j).getBrand());
				yarnSeller.setEnquiryFor(seller.get(j).getEnquiryFor());
				yarnSeller.setCompanyName(seller.get(j).getCompanyName());
				yarnSeller.setContactPersonName(seller.get(j).getContactPersonName());
				yarnSeller.setContactPersonEmail(seller.get(j).getContactPersonEmail());
				yarnSeller.setCountryCode(seller.get(j).getCountryCode());
				yarnSeller.setContactNo(seller.get(j).getContactNo());
				yarnSeller.setCount(seller.get(j).getCount());
				yarnSeller.setProductDescription(seller.get(j).getProductDescription());

				System.out.println("     " + yarnSeller.getCompanyName());

				allList.push(yarnSeller);

				//json.put("yarnSeller", sellerList.size());
				j++;

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


		json.put("AllList", allList);
		json.put("AllListSize", allList.size());

		return json;
	}

	@RequestMapping(value = "get-All-Fabric-Buyer/Seller", method = RequestMethod.GET)
	public @ResponseBody HashMap getAllFabricBuyerSeller() {
		HashMap json = new HashMap();

		String enquiryFor = "Fabric";
		List<EnquiryTable> buyer = EnquiryTableServiceImpl.getYarnOrFabric(enquiryFor);
		// json.put("BuyerYarn", buyer);
		json.put("BuyerFabricSize", buyer.size());

		List<CustomerProduct> seller = customerProductServiceImpl.getYarnOrFabric(enquiryFor);
		// json.put("SellerYarn", seller);
		json.put("SellerFabricSize", seller.size());

		
		Stack allList = new Stack();
		for (int i = 0; i < buyer.size(); i++) {
			CustomizedBuyerSeller yarnBuyer = new CustomizedBuyerSeller();
			yarnBuyer.setBrand(buyer.get(i).getBrand());
			yarnBuyer.setEnquiryFor(buyer.get(i).getEnquiryFor());
			yarnBuyer.setCompanyName(buyer.get(i).getCompanyName());
			yarnBuyer.setContactPersonName(buyer.get(i).getContactPersonName());
			yarnBuyer.setContactPersonEmail(buyer.get(i).getContactPersonEmail());
			yarnBuyer.setCountryCode(buyer.get(i).getCountryCode());
			yarnBuyer.setContactNo(buyer.get(i).getContactNo());
			yarnBuyer.setWarpCount(buyer.get(i).getWarpCount());
			yarnBuyer.setWeftCount(buyer.get(i).getWeftCount());
			yarnBuyer.setProductDescription(buyer.get(i).getProductDescription());
			allList.push(yarnBuyer);

			// json.put("yarnBuyer", buyerList);

		}

		
		// Stack sellerList = new Stack();
		for (int i = 0; i < seller.size(); i++) {
			CustomizedBuyerSeller yarnSeller = new CustomizedBuyerSeller();

			yarnSeller.setBrand(seller.get(i).getBrand());
			yarnSeller.setEnquiryFor(seller.get(i).getEnquiryFor());
			yarnSeller.setCompanyName(seller.get(i).getCompanyName());
			yarnSeller.setContactPersonName(seller.get(i).getContactPersonName());
			yarnSeller.setContactPersonEmail(seller.get(i).getContactPersonEmail());
			yarnSeller.setCountryCode(seller.get(i).getCountryCode());
			yarnSeller.setContactNo(seller.get(i).getContactNo());
			yarnSeller.setWarpCount(seller.get(i).getWarpCount());
			yarnSeller.setWeftCount(seller.get(i).getWeftCount());
			yarnSeller.setProductDescription(seller.get(i).getProductDescription());
			allList.push(yarnSeller);

			json.put("AllList", allList);
			json.put("AllListSize", allList.size());

		}

		return json;
	}
}