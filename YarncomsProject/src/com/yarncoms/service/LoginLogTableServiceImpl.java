package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yarncoms.model.LoginLogTable;
import com.yarncoms.repository.LoginLogTableRepository;

@Service
public class LoginLogTableServiceImpl implements LoginLogTableService{
	
	@Resource
	private LoginLogTableRepository loginLogTableRepository;
	
	@Override
	public List<LoginLogTable> findAll(){
		// TODO Auto-generated method stub
		return loginLogTableRepository.findAll();
	}

	@Override
	public List<LoginLogTable> findById(Long id) {
		// TODO Auto-generated method stub
		return loginLogTableRepository.findById(id);
	}

	@Override
	public LoginLogTable save(LoginLogTable login) {
		// TODO Auto-generated method stub
		return loginLogTableRepository.save(login);
	}

	@Override
	public LoginLogTable getById(Long id) {
		// TODO Auto-generated method stub
		return loginLogTableRepository.getById(id);
	}

}
