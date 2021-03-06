package com.yarncoms.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yarncoms.model.Customer;
import com.yarncoms.model.EnquiryTable;
import com.yarncoms.model.FabricEnquiry;
import com.yarncoms.model.FabricProduct;
import com.yarncoms.model.SupplierData;
import com.yarncoms.service.CustomerService;
import com.yarncoms.service.EnquiryTableService;
import com.yarncoms.service.FabricEnquiryService;
import com.yarncoms.service.SupplierDataService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class FabricEnquiryController {

	@Autowired
	private FabricEnquiryService FabricEnquiryServiceImpl;

	@Autowired
	private EnquiryTableService EnquiryTableServiceImpl;

	@Autowired
	private CustomerService customerService;

	@Autowired
	private SupplierDataService SupplierDataServiceImpl;

	@RequestMapping(value = "get-FabricEnquiryDetail", method = RequestMethod.GET)
	public @ResponseBody HashMap getFabricEnquiryList() {
		HashMap json = new HashMap();

		List<FabricEnquiry> fabricEnquiry = FabricEnquiryServiceImpl.list();
		json.put("Entity", "FabricEnquiry");
		json.put("FabricEnquiry", fabricEnquiry);

		return json;
	}

	@RequestMapping(value = "get-fabricEnquiryDetail/{fabricEnquiryId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getByFabricEnquiryId(@PathVariable("fabricEnquiryId") long id,
			Map<String, Object> map) {
		HashMap json = new HashMap();

		FabricEnquiry fabricEnquiry = FabricEnquiryServiceImpl.getByFabricEnquiryId(id);
		json.put("Entity", "FabricEnquiry");
		json.put("FabricEnquiry", fabricEnquiry);

		return json;
	}

	@RequestMapping(value = "save-fabricEnquiryDetails", method = RequestMethod.POST)
	public @ResponseBody HashMap saveFabricEnquiry(@RequestBody FabricEnquiry fabric) {
		HashMap json = new HashMap();

		json.put("enquiryType", "BankDetails");
		fabric.setPrefix(fabric.getPrefix());
		FabricEnquiry fabricDetails = FabricEnquiryServiceImpl.save(fabric);

		json.put("savedFabricEnquiryDetails", fabricDetails.getEnquiryId());

		EnquiryTable enquiry = new EnquiryTable();
		System.out.println(fabricDetails.getEnquiryId());
		enquiry.setCvEnquiryId(fabricDetails.getCvId());
		enquiry.setEnquiryId(fabricDetails.getPrefix() + "-0000" + fabricDetails.getEnquiryId().toString());
		enquiry.setEnquiryFrom(fabricDetails.getEnquiryFrom());
		enquiry.setEnquiryFor(fabricDetails.getEnquiryFor());
		enquiry.setCompanyName(fabricDetails.getCompanyName());
		enquiry.setContactPersonName(fabricDetails.getContactPersonName());
		enquiry.setContactPersonEmail(fabricDetails.getContactPersonEmail());
		enquiry.setViberNo(fabricDetails.getViberNo());
		enquiry.setWebsite(fabricDetails.getWebsite());
		enquiry.setCountry(fabricDetails.getCountry());
		enquiry.setOtherCountry(fabricDetails.getOtherCountry());
		enquiry.setCountryCode(fabricDetails.getCountryCode());
		enquiry.setContactNo(fabricDetails.getContactNo());
		enquiry.setEnqDate(fabricDetails.getEnquiryDate());
		enquiry.setEnqStatus("Open");
		enquiry.setEnqLevel(2);
		enquiry.setTechnicalPerson(fabric.getTechnicalPerson());
		enquiry.setBrand(fabric.getBrand());
		enquiry.setWarpCount(fabricDetails.getWarpCount());
		enquiry.setWeftCount(fabricDetails.getWeftCount());
		enquiry.setProductDescription(fabricDetails.getConstruction());

		EnquiryTable enquiryTable = EnquiryTableServiceImpl.save(enquiry);
		json.put("SaveDataInEnquiryTable", enquiryTable);
		return json;
	}

	@RequestMapping(value = "update-fabricEnquiryDetails/{fabricEnquiryId}", method = RequestMethod.PUT)
	public @ResponseBody HashMap updatFabricEnquiryDetail(@PathVariable("fabricEnquiryId") long id,
			@RequestBody FabricEnquiry fabric) {
		LinkedHashMap json = new LinkedHashMap();

		json.put("enquiryType", "FabricEnquiry");
		FabricEnquiry fabricEnquiry = FabricEnquiryServiceImpl.save(fabric);
		json.put("EditedEnquiry", fabricEnquiry.getEnquiryId());

		return json;
	}

	@RequestMapping(value = "delete-fabricEnquiryDetails/{fabricEnquiryId}", method = RequestMethod.GET)
	public @ResponseBody HashMap deleteFabricEnquriyDetail(@PathVariable("fabricEnquiryId") long id) {
		System.out.println(id);
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "FabricEnquiry");
		FabricEnquiry fabricEnquiry = FabricEnquiryServiceImpl.getByFabricEnquiryId(id);

		if (fabricEnquiry == null) {
			json.put("CurrentEnquiry Not Found", fabricEnquiry.getClass());
			return json;
		}
		boolean fabric = FabricEnquiryServiceImpl.delete(id);
		json.put("Id deleted", fabric);
		return json;
	}

	@RequestMapping(value = "get-SellerName/{fabricEnquiryId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getByQuery(@PathVariable("fabricEnquiryId") String id) {
		HashMap json = new HashMap();
		List<EnquiryTable> EnquiryTable = EnquiryTableServiceImpl.getByEnquiryId(id);
		System.out.println(id);
		String parse = id.substring(id.length() - 5);
		System.out.println(parse);
		long number = new Long(parse).longValue();
		System.out.println(number);
		List<FabricEnquiry> fabricEnquiry = FabricEnquiryServiceImpl.getByQuery(number);
		//System.out.println(fabricEnquiry.get(0).getCountryCode());
		System.out.println(fabricEnquiry.size());
		Stack st = new Stack();
		for (int i = 0; i < fabricEnquiry.size(); i++) {
			Object product = (Object) fabricEnquiry.get(i);
			FabricProduct pro = (FabricProduct) product;
			System.out.println(pro);
			System.out.println(pro.getCustomerId());
			List<Customer> customer = customerService.productToCustomerDetails(pro.getCustomerId());

			SupplierData fabricData = new SupplierData();
			fabricData.setSupplierName(customer.get(0).getCompanyName());
			fabricData.setSupplierRating(customer.get(0).getRating());
			fabricData.setEnquiryId(id);
			fabricData.setEmail(customer.get(0).getContactPersonEmail());
			fabricData.setCustomerId(customer.get(0).getCustomerId());
			fabricData.setCompanyName(EnquiryTable.get(0).getCompanyName());
			fabricData.setContactPersonName(EnquiryTable.get(0).getContactPersonName());
			fabricData.setBrand(EnquiryTable.get(0).getBrand());
			fabricData.setProductDescription(EnquiryTable.get(0).getProductDescription());
			fabricData.setCountryCode(customer.get(0).getCountryCode());
			fabricData.setContactNo(customer.get(0).getMobileNo());
			fabricData.setStatus("level3");
			fabricData.setFlag("N");
			fabricData.setPrefix(fabricData.getPrefix());

			List<SupplierData> list = SupplierDataServiceImpl.list();
			System.out.println(list.size());
			if (list.size() == 0) {
				System.out.println("If condition Part Printed");
				SupplierData supplier = SupplierDataServiceImpl.saveSupplier(fabricData);
				st.push(supplier);
			}

			if (list.size() > 0) {
				System.out.println("Else If Part Printed");
				List<SupplierData> supplierData = SupplierDataServiceImpl.getByTableData(fabricData.getEnquiryId(),
						fabricData.getSupplierName(), fabricData.getContactNo(),
						fabricData.getEmail(), fabricData.getCustomerId(), fabricData.getCountryCode());
				if (supplierData.size() > 0) {
					for (int k = 0; k < supplierData.size(); k++) {
						st.push(supplierData.get(k));
					}
				}

				if (supplierData.size() == 0) {
					System.out.println("Else If Else condition Part Printed");
					SupplierData supplierData1 = SupplierDataServiceImpl.saveSupplier(fabricData);
					st.push(supplierData1);
				}

			}
		}

		json.put("CustomerDetails", st);
		json.put("CustomerSize", st.size());

		return json;
	}

}
