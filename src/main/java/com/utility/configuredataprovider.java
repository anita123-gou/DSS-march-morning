package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configuredataprovider {
	Properties pro;

	public configuredataprovider() throws IOException {
		
	
	
	String path =" C:\\Users\\SHWETA GOUDAR\\eclipse-workspace\\frame1_demo\\configure\\configure properties";
			
			FileInputStream fis=new FileInputStream(path);
			pro=new Properties();
			pro.load(fis);
	
}
	public String getBaseUrl_QA1() {
		return pro.getProperty("BaseUrl_QA1");
	}
}