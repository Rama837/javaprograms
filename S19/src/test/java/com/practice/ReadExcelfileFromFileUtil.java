package com.practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.genericlibrary.ExcelUtility;
import com.genericlibrary.IPathConstants;

public class ReadExcelfileFromFileUtil {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		ExcelUtility xlutil = new ExcelUtility();
		 int rc = xlutil.getrowCount(IPathConstants.excelPath, "Sheet");
		 System.out.println(rc);
		 String val = xlutil.readDataExcel("Sheet", 1,1);
		 System.out.println(val);
		}
}
