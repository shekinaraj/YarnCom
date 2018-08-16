package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yarncoms.model.Product;
import com.yarncoms.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Resource
	private ProductRepository productRepository;

	@Override
	public List<Product> list() {
		
		return productRepository.findAll();
	}

	@Override
	public List<Product> getById(Long productId) {
		
		return productRepository.findByProductId(productId);
	}

	@Override
	public Product save(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public boolean delete(Long productId) {
		try {
			Product product = new Product();
			product.setProductId(productId);
			productRepository.delete(product);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Override
	public List<Product> getProductDetails(Long productId){
		List<Product> productDetails = null;
		try{
			productDetails= productRepository.getProductDetails(productId);
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return productDetails;
	}

	@Override
	public List<Product> getProductViaCompanyName(String companyName) {
		// TODO Auto-generated method stub
		return productRepository.getProductViaCompanyName(companyName);
	}

	@Override
	public List<Product> getProductViaProductDetails(String detail) {
		// TODO Auto-generated method stub
		return productRepository.getProductViaProductDetails(detail);
	}

	@Override
	public List<Product> getAllCompanyNames() {
		// TODO Auto-generated method stub
		return productRepository.getAllCompanyNames();
	}

	@Override
	public List<Product> getProductIfExist(String customer, String detail) {
		// TODO Auto-generated method stub
		return productRepository.getProductIfExist(customer, detail);
	}

}
