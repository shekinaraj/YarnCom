package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.FabricProduct;

public interface FabricProductService {

	List<FabricProduct> list();

	List<FabricProduct> findYarnCount(Long customerId);

	List<FabricProduct> findFabricCount(Long customerId);

	List<FabricProduct> getByProductId(long productId);

	FabricProduct save(FabricProduct fabric);

	boolean delete(long productId);

}
