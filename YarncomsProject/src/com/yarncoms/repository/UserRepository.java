package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yarncoms.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	public User findByUserName(String username);
	
	List<User> findByUserId(Long userId);
	
}
