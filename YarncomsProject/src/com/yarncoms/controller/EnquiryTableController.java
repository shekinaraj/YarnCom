package com.yarncoms.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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

import com.yarncoms.model.Customer;
import com.yarncoms.model.EnquiryTable;
import com.yarncoms.model.Product;
import com.yarncoms.model.SpecialityEnquiry;
import com.yarncoms.model.SupplierData;
import com.yarncoms.model.WeavingEnquiry;
import com.yarncoms.service.CustomerService;
import com.yarncoms.service.EnquiryTableService;
import com.yarncoms.service.FabricEnquiryService;
import com.yarncoms.service.SpecialityEnquiryService;
import com.yarncoms.service.SupplierDataService;
import com.yarncoms.service.WeavingEnquiryService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class EnquiryTableController {

	private String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());

	@Autowired
	private EnquiryTableService EnquiryTableServiceImpl;

	@Autowired
	private SpecialityEnquiryService specialityEnquiryService;

	@Autowired
	private WeavingEnquiryService weavingEnquiryService;

	@Autowired
	private SupplierDataService SupplierDataServiceImpl;

	
	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "get-EnquiryTable", method = RequestMethod.GET)
	public @ResponseBody HashMap getEnquiryTable() {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);

		List<EnquiryTable> EnquiryTable = EnquiryTableServiceImpl.list();
		json.put("entity", "EnquiryTable");
		json.put("NumberOfEnquiryTableDetails", EnquiryTable.size());
		json.put("EnquiryTable", EnquiryTable);

		return json;
	}

	@RequestMapping(value = "get-EnquiryDate", method = RequestMethod.GET)
	public @ResponseBody HashMap getEnquiryDate() throws ParseException {
		HashMap json = new HashMap();
		Calendar now = Calendar.getInstance();

		String dateStart = now.get(Calendar.YEAR) + "-" + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE);
		System.out.println("start date  " + dateStart);
		/*
		 * now.add(Calendar.DATE, -14); String dateStop = now.get(Calendar.YEAR)+ "-" +
		 * (now.get(Calendar.MONTH) + 1) + "-"+ now.get(Calendar.DATE);
		 * System.out.println("stop date  " + dateStop); System.out.println("thanks");
		 */

		List<EnquiryTable> EnquiryTable = EnquiryTableServiceImpl.getDiff();
		json.put("entity", "EnquiryTable");
		json.put("NumberOfEnquiryTableDetails", EnquiryTable.size());
		json.put("EnquiryTable", EnquiryTable);

		return json;
	}

	@RequestMapping(value = "get-yarn-fabric/{enquiryId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getYarnAndFabric(@PathVariable("enquiryId") String id) {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);
		List<EnquiryTable> EnquiryTable = EnquiryTableServiceImpl.getByEnquiryId(id);
		System.out.println(id);
		String parse = id.substring(id.length() - 5);
		System.out.println(parse);
		long number = new Long(parse).longValue();
		System.out.println(number);
		if (id.charAt(0) == 'Y') {
			if (id.charAt(1) == '-') {
				List<SpecialityEnquiry> speciality = specialityEnquiryService.getBySpeciality(number);
				Stack st = new Stack();
				for (int i = 0; i < speciality.size(); i++) {
					Object product = (Object) speciality.get(i);
					Product pro = (Product) product;
					System.out.println(pro);
					System.out.println(pro.getCustomerId());
					List<Customer> customer = customerService.productToCustomerDetails(pro.getCustomerId());

					 SupplierData specialityData = new SupplierData();
					 specialityData.setSupplierName(customer.get(0).getCompanyName());
					 specialityData.setSupplierRating(customer.get(0).getRating());
					 specialityData.setEnquiryId(id);
						specialityData.setEmail(customer.get(0).getContactPersonEmail());
						specialityData.setCustomerId(customer.get(0).getCustomerId());
						specialityData.setCompanyName(EnquiryTable.get(0).getCompanyName());
						specialityData.setContactPersonName(EnquiryTable.get(0).getContactPersonName());
						specialityData.setProductDescription(EnquiryTable.get(0).getProductDescription());
						specialityData.setCountryCode(customer.get(0).getCountryCode());
						specialityData.setContactNo(customer.get(0).getMobileNo());
						specialityData.setStatus("level3");
						specialityData.setFlag("N");
						specialityData.setPrefix(specialityData.getPrefix());
						
						List<SupplierData> list = SupplierDataServiceImpl.list();
						System.out.println(list.size());
						if(list.size()==0) {
										System.out.println("If condition Part Printed");
										SupplierData supplier =SupplierDataServiceImpl.saveSupplier(specialityData);
										st.push(supplier);
										}

						else if(list.size()>0){
										System.out.println("Else If Part Printed");
										List<SupplierData> supplierData = SupplierDataServiceImpl.getByTableData(specialityData.getEnquiryId(),specialityData.getSupplierName(),specialityData.getContactNo(),specialityData.getEmail(),specialityData.getCustomerId(),specialityData.getCountryCode());
										if(supplierData.size()>0) {
											for(int k=0;k<supplierData.size();k++) {
												st.push(supplierData.get(k));
											}
										}
										
										
										if(supplierData.size()==0) {
											System.out.println("Else If Else condition Part Printed");
											SupplierData supplierData1 =SupplierDataServiceImpl.saveSupplier(specialityData);
											st.push(supplierData1);
										}
										
									}

				}

				json.put("CustomerDetails", st);	
				json.put("CustomerSize", st.size());
				
			}
			 else {
				
				List<WeavingEnquiry> weaving = weavingEnquiryService.getByWeaving(number);
				System.out.println();
				Stack st = new Stack();
				for (int i = 0; i < weaving.size(); i++) {
					Object product = (Object) weaving.get(i);
					Product pro = (Product) product;
					System.out.println(pro);
					System.out.println(pro.getCustomerId());
					List<Customer> customer = customerService.productToCustomerDetails(pro.getCustomerId());
					json.put("CustomerSize", customer.size());
					 
					 SupplierData weavingData = new SupplierData();
						weavingData.setSupplierName(customer.get(0).getCompanyName());
						weavingData.setSupplierRating(customer.get(0).getRating());
						weavingData.setEnquiryId(id);
						weavingData.setEmail(customer.get(0).getContactPersonEmail());
						weavingData.setCustomerId(customer.get(0).getCustomerId());
						weavingData.setCompanyName(EnquiryTable.get(0).getCompanyName());
						weavingData.setContactPersonName(EnquiryTable.get(0).getContactPersonName());
						weavingData.setProductDescription(EnquiryTable.get(0).getProductDescription());
						weavingData.setContactNo(customer.get(0).getMobileNo());
						weavingData.setCountryCode(customer.get(0).getCountryCode());
						weavingData.setStatus("level3");
						weavingData.setFlag("N");
						weavingData.setPrefix(weavingData.getPrefix());
						
						List<SupplierData> list = SupplierDataServiceImpl.list();
						System.out.println(list.size());
						if(list.size()==0) {
										System.out.println("If condition Part Printed");
										SupplierData supplier =SupplierDataServiceImpl.saveSupplier(weavingData);
										st.push(supplier);
										}

										if(list.size()>0){
										System.out.println("Else If Part Printed");
										List<SupplierData> supplierData = SupplierDataServiceImpl.getByTableData(weavingData.getEnquiryId(),weavingData.getSupplierName(),weavingData.getContactNo(),weavingData.getEmail(),weavingData.getCustomerId(),weavingData.getCountryCode());
										if(supplierData.size()>0) {
											for(int k=0;k<supplierData.size();k++) {
												st.push(supplierData.get(k));
											}
										}
										
										
										if(supplierData.size()==0) {
											System.out.println("Else If Else condition Part Printed");
											SupplierData supplierData1 =SupplierDataServiceImpl.saveSupplier(weavingData);
											st.push(supplierData1);
										}
		
									}
						
				}
				json.put("CustomerDetails", st);
				json.put("CustomerSize", st.size());
			}

		}


		return json;
	}

	@RequestMapping(value = "get-EnquiryTable/{EnquiryTableId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getEnquiryId(@PathVariable("EnquiryTableId") long EnquiryTableId) {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);

		List<EnquiryTable> EnquiryTable = EnquiryTableServiceImpl.getByEnquiryGridId(EnquiryTableId);
		json.put("entity", "EnquiryTable");
		json.put("EnquiryTable", EnquiryTable);

		return json;
	}

	@RequestMapping(value = "get-EnquiryTableEnqID/{enquiryId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getEnquiryTableId(@PathVariable("enquiryId") String id) {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);

		List<EnquiryTable> EnquiryTable = EnquiryTableServiceImpl.getByEnquiryId(id);
		json.put("entity", "EnquiryTable");
		json.put("EnquiryTable", EnquiryTable);

		return json;
	}
	
	@RequestMapping(value = "get-EnquiryUsingStatus/{status}", method = RequestMethod.GET)
	public @ResponseBody HashMap findUsingStatus(@PathVariable("status") String status) {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);

		List<EnquiryTable> EnquiryTable = EnquiryTableServiceImpl.findUsingStatus(status);
		json.put("entity", "EnquiryTable");
		json.put("EnquiryTable", EnquiryTable);

		return json;
	}

	@RequestMapping(value = "getEnquiry/{level},{status}", method = RequestMethod.GET)
	public @ResponseBody HashMap getEnqLevel(@PathVariable int level, @PathVariable String status) {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);
		json.put("entity", "Customer");
		List<EnquiryTable> enq = EnquiryTableServiceImpl.findEnquiry(level, status);
		json.put("No of Level 1 Enquiry", enq.size());
		json.put("LevelEnquiry", enq);

		return json;
	}

	@RequestMapping(value = "getEnquiryWithDate/{level},{status}", method = RequestMethod.GET)
	public @ResponseBody HashMap getEnqLevelWithDate(@PathVariable int level, @PathVariable String status) {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);
		json.put("entity", "Customer");
		List<EnquiryTable> enq = EnquiryTableServiceImpl.findEnquiryWithDate(level, status, date);
		json.put("No of Level 1 Enquiry", enq.size());
		json.put("LevelEnquiryOnCurrentDate", enq);

		return json;
	}

	@RequestMapping(value = "getByDate/{startDate}/{endDate}", method = RequestMethod.GET)
	public @ResponseBody HashMap getByDate(@PathVariable String startDate, @PathVariable String endDate) {
		HashMap json = new HashMap();
		json.put("entity", "Enquiry");
		List<EnquiryTable> enq = EnquiryTableServiceImpl.getByDate(startDate, endDate);
		json.put("AnalyzedDate", enq);

		return json;
	}

	@RequestMapping(value = "save-EnquiryTable", method = RequestMethod.POST)
	public @ResponseBody HashMap saveEnquiryTableDetails(@RequestBody EnquiryTable grid) {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "EnquiryTable");
		EnquiryTable EnquiryTable = EnquiryTableServiceImpl.save(grid);
		json.put("savedEnquiryTableDetails", EnquiryTable.getCvEnquiryId());
		return json;
	}

	@RequestMapping(value = "update-EnquiryTable/{EnquiryTableId}", method = RequestMethod.PUT)
	public @ResponseBody HashMap updateEnquiryDetail(@PathVariable("EnquiryTableId") long enqId,
			@RequestBody EnquiryTable enqTable) {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "Update-EnquiryTable-Detail");
		// enqTable.setEnqLevel(0);
		enqTable.setEnqStatus("Close");
		EnquiryTable EnquiryTable = EnquiryTableServiceImpl.save(enqTable);
		json.put("UpdatedEnquiryTableDetails", EnquiryTable.getCvEnquiryId());
		return json;
	}
	
	@RequestMapping(value = "close-level-Enquiry/{EnquiryTableId}", method = RequestMethod.PUT)
	public @ResponseBody HashMap closeEnquiryDetail(@PathVariable("EnquiryTableId") long enqId,
			@RequestBody EnquiryTable enqTable) {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "Update-EnquiryTable-Detail");
		// enqTable.setEnqLevel(0);
		//enqTable.setEnqStatus("Close");
		EnquiryTable EnquiryTable = EnquiryTableServiceImpl.save(enqTable);
		json.put("UpdatedEnquiryTableDetails", EnquiryTable.getCvEnquiryId());
		return json;
	}

	@RequestMapping(value = "get-SupplierData/{EnquiryTableId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getSupplierData(@PathVariable("EnquiryTableId") String EnquiryTableId) {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);

		List<EnquiryTable> SupplierData = EnquiryTableServiceImpl.getByEnquiryIdToSupplierData(EnquiryTableId);
		json.put("EnquiryTable", SupplierData);

		return json;
	}

	@RequestMapping(value = "get-ManageQuoteSupplierData/{EnquiryTableId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getManageSupplierData(@PathVariable("EnquiryTableId") String id) {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);

		List<EnquiryTable> SupplierData = EnquiryTableServiceImpl.getByEnquiryIdToManageSupplierData(id);
		json.put("EnquiryTable", SupplierData);

		return json;
	}
}