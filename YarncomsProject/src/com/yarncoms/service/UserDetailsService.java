package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.UserDetails;

public interface UserDetailsService {

	List<UserDetails> findByUserId(Long userId);
		
	boolean save(UserDetails user);

	List<UserDetails> findUserDetails();
	
	boolean delete(String userId);
	
	List<UserDetails> login(String userName, String password);
	
	List<UserDetails> findByRole(String role);
	
	List<UserDetails> findByStatus(String status);
}
