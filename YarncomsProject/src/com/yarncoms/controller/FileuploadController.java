package com.yarncoms.controller;

import java.io.File;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.yarncoms.model.FileInfo;



@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class FileuploadController {
 @Autowired
 ServletContext context; 

 @RequestMapping(value = "/fileupload", headers=("content-type=multipart/*"), method = RequestMethod.POST)
 public ResponseEntity<FileInfo> upload(@RequestParam("file") MultipartFile inputFile) {
  FileInfo fileInfo = new FileInfo();
  HttpHeaders headers = new HttpHeaders();
  if (!inputFile.isEmpty()) {
   try {
    String originalFilename = inputFile.getOriginalFilename();
    File destinationFile = new File(context.getRealPath("/WEB-INF/uploaded")+  File.separator + originalFilename);
    inputFile.transferTo(destinationFile);
    fileInfo.setFileName(destinationFile.getPath());
    fileInfo.setFileSize(inputFile.getSize());
    headers.add("File Uploaded Successfully - ", originalFilename);
    return new ResponseEntity<FileInfo>(fileInfo, headers, HttpStatus.OK);
   } catch (Exception e) {    
    return new ResponseEntity<FileInfo>(HttpStatus.BAD_REQUEST);
   }
  }else{
   return new ResponseEntity<FileInfo>(HttpStatus.BAD_REQUEST);
  }
 }
}