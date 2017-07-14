package com.yarncoms.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {

	List<UserDetails> findByUserId(Long userId);
	
	
/*	@Query("select userId as userId, userName as userName, password as password, role as role, phoneNumber as phoneNumber, emailId as emailId from UserDetails")
	List<UserDetails> findUserDetails();
*/
}
