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
import com.yarncoms.model.SpecialityEnquiry;
import com.yarncoms.service.EnquiryTableService;
import com.yarncoms.service.SpecialityEnquiryService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class SpecialityEnquiryController {

	@Autowired
	private SpecialityEnquiryService specialityEnquiryService;

	@Autowired
	private EnquiryTableService EnquiryTableServiceImpl;

	// Controllers for Speciality_Enquiry

	@RequestMapping(value = "get-specialityEnquiryDetails-list", method = RequestMethod.GET)
	public @ResponseBody HashMap getSpecialityEnquiryDetails() {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "SpecialityEnquiryDetails");

		List<SpecialityEnquiry> specialityEnquiry = specialityEnquiryService.list();
		json.put("NumberOfEnquiry", specialityEnquiry.size());
		json.put("AllEnquiryDetails", specialityEnquiry);

		return json;
	}

	@RequestMapping(value = "get-specialityEnquiryDetails/{specialityEnquiryId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getSpecialityEnquiryById(@PathVariable Long specialityEnquiryId) {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);

		List<SpecialityEnquiry> specialityEnquiry = specialityEnquiryService.findByEnquiryId(specialityEnquiryId);
		json.put("entity", "SpecialityEnquiryDetailId");
		json.put("SpecialityEnquiryDetailId", specialityEnquiry);

		return json;
	}

	@RequestMapping(value = "save-specialityEnquiryDetail", method = RequestMethod.POST)
	public @ResponseBody HashMap saveSpecialityEnquirDetails(@RequestBody SpecialityEnquiry specialityEnquiry) {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "Saved-SpecialityEnquiry-Detail");
		specialityEnquiry.setPrefix(specialityEnquiry.getPrefix());
		System.out.println(specialityEnquiry.getMaterial());
		System.out.println(specialityEnquiry.getBlendCotton());
		SpecialityEnquiry spclEnquiry = specialityEnquiryService.save(specialityEnquiry);

		EnquiryTable enquiry = new EnquiryTable();
		enquiry.setEnquiryId(spclEnquiry.getPrefix() + "-0000" + spclEnquiry.getEnquiryId());
		enquiry.setCvEnquiryId(spclEnquiry.getCvId());
		enquiry.setEnquiryFrom(spclEnquiry.getEnquiryFrom());
		enquiry.setEnquiryFor(spclEnquiry.getEnquiryFor());
		enquiry.setCompanyName(spclEnquiry.getCompanyName());
		enquiry.setContactPersonName(specialityEnquiry.getContactPersonName());
		enquiry.setContactPersonEmail(specialityEnquiry.getContactPersonEmail());
		enquiry.setCountryCode(spclEnquiry.getCountryCode());
		enquiry.setContactNo(spclEnquiry.getContactNo());
		enquiry.setEnqDate(spclEnquiry.getEnquiryDate());
		enquiry.setEnqStatus("Open");
		enquiry.setEnqLevel(2);
		enquiry.setTechnicalPerson(specialityEnquiry.getTechnicalPerson());
		enquiry.setBrand(specialityEnquiry.getBrand());
		enquiry.setCount(spclEnquiry.getCount());
		enquiry.setProductDescription(spclEnquiry.getProductDescription());

		EnquiryTable enquiryTable = EnquiryTableServiceImpl.save(enquiry);
		json.put("savedDetails", spclEnquiry.getEnquiryId());
		return json;
	}

	@RequestMapping(value = "update-specialityEnquiryDetail/{specialityEnquiryId}", method = RequestMethod.PUT)
	public @ResponseBody HashMap updateSpecialityEnquirDetails(@PathVariable("specialityEnquiryId") Long id,
			@RequestBody SpecialityEnquiry specialityEnquiry) {
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "Updated-SpecialityEnquiry-Detail");
		SpecialityEnquiry spclEnquiry = specialityEnquiryService.save(specialityEnquiry);
		json.put("savedDetails", spclEnquiry.getEnquiryId());
		return json;
	}

	@RequestMapping(value = "delete-SpecialityEnquiryDetail/{specialityEnquiryId}", method = RequestMethod.GET)
	public @ResponseBody HashMap deleteSpecialityEnquiryDetail(@PathVariable("specialityEnquiryId") long id) {
		System.out.println(id);
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "deleteSpecialityEnquiryList");
		boolean specialityEnquiry = specialityEnquiryService.delete(id);
		json.put("Id deleted", specialityEnquiry);
		return json;
	}

	@RequestMapping(value = "get-SpecialityProduct-Name/{specialityEnquiryId}", method = RequestMethod.GET)
	public @ResponseBody HashMap getBySpeciality(@PathVariable("specialityEnquiryId") long id) {
		HashMap json = new HashMap();

		List<SpecialityEnquiry> speciality = specialityEnquiryService.getBySpeciality(id);
		json.put("Entity", "SpecialityEnquiry");
		json.put("SpecialityEnquiry", speciality);
		return json;
	}

}
