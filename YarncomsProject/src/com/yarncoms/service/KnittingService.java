package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.Knitting;

public interface KnittingService {
	
	List<Knitting> getByKnittingId(Long knittingEnquiryId);
	
	List<Knitting> Knittinglist();
	
	Knitting save(Knitting knitting);
	
	boolean delete(Long knittingEnquiryId);

}
