package com.yarncoms.service;

import java.util.List;

import com.yarncoms.model.User;
import com.yarncoms.model.UserRole;

public interface UserService {
	
	List<User> findByUserId(Long userId);

	List<User> list();

	User save(User user);

	boolean delete(Long userId);
	
	UserRole create(User user);


}
