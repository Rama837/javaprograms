package com.practice;

import java.io.IOException;

import com.genericlibrary.FileUtility;

public class ReadPropfromFileUtil {

	public static void main(String[] args) throws IOException {
	FileUtility fileUtil=new FileUtility();
	String pro = fileUtil.readDatafrompropfile("url");
	System.out.println(pro);
	}

}
