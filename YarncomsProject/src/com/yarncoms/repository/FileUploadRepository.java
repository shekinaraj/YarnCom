package com.yarncoms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yarncoms.model.FileUpload;

public interface FileUploadRepository extends JpaRepository<FileUpload, Long> {
    FileUpload findByFilename(String filename);
    
    @Query("SELECT f FROM FileUpload f where f.companyName=?1")
	List<FileUpload> findByCompanyName(String company);
}