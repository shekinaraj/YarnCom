package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarncoms.model.LoginLogTable;

public interface LoginLogTableRepository extends JpaRepository<LoginLogTable, Long> {

	List<LoginLogTable> findById(Long id);
	
	LoginLogTable getById(Long id);

}
