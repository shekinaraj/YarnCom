package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yarncoms.model.UserDetails;
import com.yarncoms.repository.UserDetailsRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Resource
	private UserDetailsRepository userDetailsRepository;
	
	@Override
	public UserDetails save(UserDetails user) {
		return userDetailsRepository.save(user);
	}

	@Override
	public List<UserDetails> findByUserId(Long userId) {
		// TODO Auto-generated method stub
		return userDetailsRepository.findByUserId(userId);
	}
	@Override
	public List<UserDetails> findUserDetails() {
		// TODO Auto-generated method stub
		return userDetailsRepository.findAll();
	}
	
	
}
