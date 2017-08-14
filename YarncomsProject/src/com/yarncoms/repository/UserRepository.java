package com.yarncoms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yarncoms.model.User;



@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	public User findByUserName(String username);
}
