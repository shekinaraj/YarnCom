package com.yarncoms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.yarncoms.model.User;
import com.yarncoms.model.UserRole;
import com.yarncoms.repository.UserRepository;

@Service
@Repository
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserRepository userRepository;

	@Override
	public List<User> findByUserId(Long userId) {
		// TODO Auto-generated method stub
		return userRepository.findByUserId(userId);
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
	}

	
	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public boolean delete(Long userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserRole create(User user) {
		// TODO Auto-generated method stub
		UserRole u = new UserRole();
		
		u.setUserid(user.getUserId());
		return u;
	}
	
	

}
