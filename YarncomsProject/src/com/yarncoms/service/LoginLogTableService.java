package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.LoginLogTable;

public interface LoginLogTableService {
	
	List<LoginLogTable> findAll();

	List<LoginLogTable> findById(Long id);
	
	LoginLogTable getById(Long id);
	
	LoginLogTable save(LoginLogTable login);
}
