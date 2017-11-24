package com.yarncoms.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
import com.yarncoms.model.SpecialityEnquiry;
import com.yarncoms.model.WeavingEnquiry;
import com.yarncoms.service.EnquiryTableService;
import com.yarncoms.service.FabricEnquiryService;
import com.yarncoms.service.SpecialityEnquiryService;
import com.yarncoms.service.WeavingEnquiryService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class EnquiryTableController {
	
	 private String date= new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
	
	@Autowired
	private EnquiryTableService EnquiryTableServiceImpl;
	
	@Autowired
	private SpecialityEnquiryService specialityEnquiryService;
	
	@Autowired
	private WeavingEnquiryService weavingEnquiryService;
	
	@Autowired
	private FabricEnquiryService FabricEnquiryServiceImpl;

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
		
		    String dateStart = now.get(Calendar.YEAR)+ "-" + (now.get(Calendar.MONTH) + 1) + "-"+
		now.get(Calendar.DATE);
		    System.out.println("start date  " +  dateStart);
		    /*now.add(Calendar.DATE, -14);
			String dateStop = now.get(Calendar.YEAR)+ "-" + (now.get(Calendar.MONTH) + 1) + "-"+
		now.get(Calendar.DATE);
			System.out.println("stop date  " +  dateStop);
		    System.out.println("thanks");*/
		 
		
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
		System.out.println(id);
		String parse = id.substring(id.length()-5);
		System.out.println(parse);
		long number = new Long(parse).longValue();
		System.out.println(number);
		if(id.charAt(0)=='Y') {
			if(id.charAt(1)=='-') {
				List<SpecialityEnquiry> speciality = specialityEnquiryService.getBySpeciality(number);
				json.put("Entity", "Enquiry");
				json.put("Enquiry", speciality);
			}
			else {
				List<WeavingEnquiry> weaving = weavingEnquiryService.getByWeaving(number);
				json.put("Entity", "Enquiry");
				json.put("Enquiry", weaving);
			}
			
		}
		else {
			List<FabricEnquiry> fabricEnquiry = FabricEnquiryServiceImpl.getByQuery(number);
			json.put("Entity", "FabricEnquiry");
			json.put("Enquiry", fabricEnquiry);
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
	
	@RequestMapping(value="getEnquiry/{level},{status}", method=RequestMethod.GET)
	public @ResponseBody HashMap getEnqLevel(@PathVariable int level, @PathVariable String status) {
		HashMap json = new HashMap();
		//json.put("enquiryType", enquiryType);
		json.put("entity", "Customer");
		List<EnquiryTable> enq = EnquiryTableServiceImpl.findEnquiry(level, status);
		json.put("No of Level 1 Enquiry", enq.size());
		json.put("LevelEnquiry", enq);
		
		return json;	
	}
	
	@RequestMapping(value="getByDate/{startDate}/{endDate}", method=RequestMethod.GET)
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
	
	@RequestMapping(value="update-EnquiryTable/{EnquiryTableId}", method=RequestMethod.PUT)
	public  @ResponseBody HashMap updateEnquiryDetail(@PathVariable("EnquiryTableId") long enqId,@RequestBody EnquiryTable  enqTable){
		LinkedHashMap json = new LinkedHashMap();
		json.put("enquiryType", "Update-EnquiryTable-Detail");
//		enqTable.setEnqLevel(0);
//		enqTable.setEnqStatus("Close");
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