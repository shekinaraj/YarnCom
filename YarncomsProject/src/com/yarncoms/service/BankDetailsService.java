package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.BankDetails;

public interface BankDetailsService {

	List<BankDetails> findByCustomerId(Long customerId);

	List<BankDetails> bankList();

	BankDetails save(BankDetails bank);

	boolean delete(Long customerId);

}
