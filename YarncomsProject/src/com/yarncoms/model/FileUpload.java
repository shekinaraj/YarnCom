package com.yarncoms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "fileupload")
public class FileUpload {

    public FileUpload(String filename, byte[] file, String mimeType) {

        this.file = file;
        this.filename = filename;
        this.mimeType = mimeType;
        //this.companyName = companyName;
    }

    public FileUpload() {
        // Default Constructor
    }

    @Id
    private String filename;

    @Lob
    private byte[] file;

    private String mimeType;
    
   // private String companyName;	


    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

/*	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
*/}