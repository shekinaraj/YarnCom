package com.yarncoms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yarncoms.model.FileUpload;

public interface FileUploadRepository extends JpaRepository<FileUpload, Long> {
    FileUpload findByFilename(String filename);
}