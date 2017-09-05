package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yarncoms.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	public User findByUserName(String username);
	
	List<User> findByUserId(Long userId);
	

	
	//@Modifying
	//@Query("update UserRole u set u.userId = ?1 where u.role= ?2")
	//@Query("insert a.role,a.userId from User a, UserRole b where a.userName=?1 and b.userId=a.userId")
	//User saveBoth(User user);
}
