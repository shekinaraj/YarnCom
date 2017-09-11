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
	public boolean save(UserDetails user) {
		
			
			try {
				userDetailsRepository.save(user);
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
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

	@Override
	public boolean delete(Long userId) {
		System.out.println("service" +userId);
		try {
			UserDetails user = new UserDetails();
			user.setUserId(userId);
			userDetailsRepository.delete(user);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
    public List<UserDetails> login(String userName, String password) {
	
		List<UserDetails> logged =  userDetailsRepository.loginAuthenticate(userName, password);
        return logged;
     }

	@Override
	public List<UserDetails> findByRole(String role) {

		return userDetailsRepository.findByRole(role);
	}

}
