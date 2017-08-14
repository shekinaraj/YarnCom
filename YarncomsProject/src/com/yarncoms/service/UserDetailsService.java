package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.UserDetails;

public interface UserDetailsService {

	List<UserDetails> findByUserId(Long userId);
		
	UserDetails save(UserDetails user);

	List<UserDetails> findUserDetails();
	
	boolean delete(Long userId);
	
	UserDetails login(String userName, String password);
}
