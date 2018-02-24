package com.yarncoms.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.yarncoms.model.BankDetails;
import com.yarncoms.model.FileUpload;
import com.yarncoms.service.FileUploadService;

@CrossOrigin(origins = "http:\\localhost:4200")
@Controller
@RequestMapping("/rest")
public class FileController {

    @Autowired
    FileUploadService fileUploadService;

    // Download a file
    @RequestMapping(
        value = "/download",
        method = RequestMethod.GET
    )
    public ResponseEntity downloadFile(@RequestParam("filename") String filename) {

        FileUpload fileUpload = fileUploadService.findByFilename(filename);

        // No file found based on the supplied filename
        if (fileUpload == null) {
            return new ResponseEntity<>("{}", HttpStatus.NOT_FOUND);
        }

        // Generate the http headers with the file properties
        HttpHeaders headers = new HttpHeaders();
        headers.add("content-disposition", "attachment; filename=" + fileUpload.getFilename());

        // Split the mimeType into primary and sub types
        String primaryType, subType;
        try {
            primaryType = fileUpload.getMimeType().split("/")[0];
            subType = fileUpload.getMimeType().split("/")[1];
        }
            catch (IndexOutOfBoundsException | NullPointerException ex) {
            return new ResponseEntity<>("{}", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        headers.setContentType( new MediaType(primaryType, subType) );

        return new ResponseEntity<>(fileUpload.getFile(), headers, HttpStatus.OK);
    }
    
    @RequestMapping(value = "get-All-FilesUploaded", method = RequestMethod.GET)
	public @ResponseBody HashMap getBankDetails() {
		HashMap json = new HashMap();
		// json.put("enquiryType", enquiryType);

		List<FileUpload> file = fileUploadService.findAllFiles();
		json.put("entity", "UploadedFiles");
		json.put("UploadedFiles", file);

		return json;
	}
    
    @RequestMapping(
            value = "/upload",
            method = RequestMethod.POST
        )
        public ResponseEntity uploadFile(MultipartHttpServletRequest request) {

            try {
                Iterator<String> itr = request.getFileNames();

                while (itr.hasNext()) {
                    String uploadedFile = itr.next();
                    MultipartFile file = request.getFile(uploadedFile);
                    String mimeType = file.getContentType();
                    String filename = file.getOriginalFilename();
                    byte[] bytes = file.getBytes();

                    FileUpload newFile = new FileUpload(filename, bytes, mimeType);

                    fileUploadService.uploadFile(newFile);
                }
            }
            catch (Exception e) {
                return new ResponseEntity<>("{could not upload file exceeding 5Mb}", HttpStatus.INTERNAL_SERVER_ERROR);
            }

            return new ResponseEntity<>("{File has been uploaded successfully}", HttpStatus.OK);
        }
}