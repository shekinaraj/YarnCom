package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yarncoms.model.FabricProduct;
import com.yarncoms.repository.FabricProductRepository;

@Service
public class FabricProductServiceImpl implements FabricProductService {

	@Resource
	FabricProductRepository fabricProductRepository;

	@Override
	public List<FabricProduct> list() {

		return fabricProductRepository.findAll();
	}

	@Override
	public List<FabricProduct> getByProductId(long productId) {

		return fabricProductRepository.findByProductId(productId);
	}

	@Override
	public FabricProduct save(FabricProduct fabric) {

		return fabricProductRepository.save(fabric);
	}

	@Override
	public boolean delete(long productId) {
		try {
			FabricProduct fabric = new FabricProduct();
			fabric.setProductId(productId);
			fabricProductRepository.delete(fabric);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
