package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yarncoms.model.CustomerProduct;
import com.yarncoms.repository.CustomerProductRepository;

@Service
public class CustomerProductServiceImpl implements CustomerProductService {
	
	@Resource
	private CustomerProductRepository customerProductRepository;

	@Override
	public List<CustomerProduct> findByCustomerProductId(Long customerProductId) {
		// TODO Auto-generated method stub
		return customerProductRepository.findByCustomerProductId(customerProductId);
	}

	@Override
	public List<CustomerProduct> findByCustomerId(String customerId) {
		// TODO Auto-generated method stub
		return customerProductRepository.findByCustomerId(customerId);
	}

	@Override
	public List<CustomerProduct> list() {
		// TODO Auto-generated method stub
		return customerProductRepository.findAll();
	}

	@Override
	public CustomerProduct save(CustomerProduct customer) {
		// TODO Auto-generated method stub
		return customerProductRepository.save(customer);
	}

	@Override
	public boolean delete(Long customerProductId) {
		try {
			CustomerProduct custPro = new CustomerProduct();
			custPro.setCustomerProductId(customerProductId);
			customerProductRepository.delete(custPro);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

	@Override
	public List<CustomerProduct> getYarnOrFabric(String enquiryFor) {
		// TODO Auto-generated method stub
		return customerProductRepository.getYarnOrFabric(enquiryFor);
	}

}
