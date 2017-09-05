package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yarncoms.model.BankDetails;
import com.yarncoms.repository.BankDetailsRepository;

@Service
public class BankDetailsServiceImpl  implements BankDetailsService{

	@Resource
	private BankDetailsRepository bankDetailsRepository;
	
	@Override
	public List<BankDetails> bankList() {
		// TODO Auto-generated method stub
		return bankDetailsRepository.findAll();
	}

	@Override
	public List<BankDetails> findByCustomerId(Long customerId) {
		// TODO Auto-generated method stub
		return bankDetailsRepository.findByCustomerId(customerId);
	}

	@Override
	public BankDetails save(BankDetails bank) {
		
		return bankDetailsRepository.save(bank);
	}

	@Override
	public boolean delete(Long operationId) {
		System.out.println("service" +operationId);
		try {
			BankDetails bank = new BankDetails();
			bank.setOperationId(operationId);
			bankDetailsRepository.delete(bank);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	
	
	

}
