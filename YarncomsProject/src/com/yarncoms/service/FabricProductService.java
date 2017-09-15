package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.FabricProduct;

public interface FabricProductService {

	List<FabricProduct> list();

	List<FabricProduct> getByProductId(long productId);

	FabricProduct save(FabricProduct fabric);

	boolean delete(long productId);

}
