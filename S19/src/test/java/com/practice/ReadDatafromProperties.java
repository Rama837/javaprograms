package com.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.genericlibrary.IPathConstants;

public class ReadDatafromProperties {
	
		public static void main(String[] args) throws IOException {
			
		FileInputStream fis=new FileInputStream(IPathConstants.propPath);
		Properties prop=new Properties();
		prop.load(fis);
		String val = prop.getProperty("browser");
		System.out.println(val);
		}
}
