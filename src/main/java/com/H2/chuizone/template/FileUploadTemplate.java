package com.h2.chuizone.template;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.Part;

public class FileUploadTemplate {
	
	public static boolean fileUpload(String fileName, Part file) throws IOException {
		System.out.println(fileName);
        file.write(fileName);
        
        return true;
	}
	
	public static String getFileName(String fileName) throws IOException {
        String name = UUID.randomUUID().toString().replace("-", "");
        return name + "_" + fileName;
	}
}
