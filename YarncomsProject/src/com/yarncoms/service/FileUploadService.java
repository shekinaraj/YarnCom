package com.yarncoms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yarncoms.model.FileUpload;
import com.yarncoms.repository.FileUploadRepository;

@Service
public class FileUploadService {

    @Autowired
    FileUploadRepository fileUploadRepository;

    // Retrieve file
    public List<FileUpload> findAllFiles() {
        return fileUploadRepository.findAll();
    }
    
    public FileUpload findByFilename(String filename) {
        return fileUploadRepository.findByFilename(filename);
    }

    // Upload the file
    public void uploadFile(FileUpload doc) {
        fileUploadRepository.saveAndFlush(doc);
    }
    
    public List<FileUpload> findByCompanyName(String company){
    	return fileUploadRepository.findByCompanyName(company);
    }
}