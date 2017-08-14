package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.yarncoms.model.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {

	List<UserDetails> findByUserId(Long userId);
	
	@Transactional
    @Query("delete from UserDetails u where u.userId = ?1")
    boolean deleteByUserId(Long userId);
	
	@Transactional
	@Query("SELECT u FROM UserDetails u where u.userName = ?1 AND u.password = ?2")
	List<UserDetails> loginAuthenticate(String userName,String password);
	
}
