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

import com.yarncoms.model.EnquiryTable;
import com.yarncoms.model.FabricEnquiry;
import com.yarncoms.service.EnquiryTableService;
import com.yarncoms.service.FabricEnquiryService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class FabricEnquiryController {

	@Autowired
	private FabricEnquiryService FabricEnquiryServiceImpl;
	
	@Autowired
	private EnquiryTableService EnquiryTableServiceImpl;

	@RequestMapping(value = "get-FabricEnquiryDetail", method = RequestMethod.GET)
	public @ResponseBody HashMap getFabricEnquiryList() {
		HashMap json = new HashMap();

		List<FabricEnquiry> fabricEnquiry = FabricEnquiryServiceImpl.list();
		json.put("Entity", "FabricEnquiry");
		json.put("FabricEnquiry", fabricEnquiry);

		return json;
	}

	@RequestMapping(value = "get-fabricEnquiryDetail/{fabricEnquiryId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getByFabricEnquiryId(@PathVariable("fabricEnquiryId") long id) {
		HashMap json = new HashMap();

		List<FabricEnquiry> fabricEnquiry = FabricEnquiryServiceImpl.getByFabricEnquiryId(id);
		json.put("Entity", "FabricEnquiry");
		json.put("FabricEnquiry", fabricEnquiry);

		return json;
	}

	@RequestMapping(value = "save-fabricEnquiryDetails", method = RequestMethod.POST)
	public @ResponseBody HashMap saveFabricEnquiry(@RequestBody FabricEnquiry fabric) {
		HashMap json = new HashMap();

		json.put("enquiryType", "BankDetails");
		FabricEnquiry fabricDetails = FabricEnquiryServiceImpl.save(fabric);
		json.put("savedFabricEnquiryDetails", fabricDetails.getEnquiryId());
		
		EnquiryTable enquiry = new EnquiryTable();
		System.out.println(fabricDetails.getEnquiryId());
		enquiry.setCvEnquiryId(fabricDetails.getCvId());
		enquiry.setEnquiryId(fabricDetails.getEnquiryId());
		enquiry.setEnquiryFrom(fabricDetails.getEnquiryFrom());
		enquiry.setName(fabricDetails.getName());
		enquiry.setContactNo(fabricDetails.getContactNo());
		enquiry.setEnqDate(fabricDetails.getEnquiryDate());
		enquiry.setEnqStatus("Open");
		enquiry.setEnqLevel(2);
		enquiry.setTechnicalPerson(fabric.getTechnicalPerson());
		
		
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
		List<FabricEnquiry> fabricEnquiry = FabricEnquiryServiceImpl.getByFabricEnquiryId(id);

		if (fabricEnquiry == null) {
			json.put("CurrentEnquiry Not Found", fabricEnquiry.getClass());
			return json;
		}
		boolean fabric = FabricEnquiryServiceImpl.delete(id);
		json.put("Id deleted", fabric);
		return json;
	}

}
