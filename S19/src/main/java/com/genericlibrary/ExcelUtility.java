package com.genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility
/**@author RAMA
 * 
 * This Class is having all methods w.r.t. excel
 * Like Read Data , Write Data in excel, Get rowcount and etc.
 * 
 */
{
	/**
	 * This Method is Going to read the data from excel
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataExcel(String sheet,int row, int cell ) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(IPathConstants.excelPath);

		String  value = WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();

		return value;
	}
	/**
	 * This mtd is going to give last active row in the sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public int getlastrow() throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(IPathConstants.excelPath);
		int lastactivrrow=WorkbookFactory.create(fis).getSheet("Sheet2").getLastRowNum();
		return lastactivrrow;
	}
	/**
	 * This mtd is going to read the data from excel just pass below parameters
	 * @param path
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public String readDataExcel(String excelPath,String sheet,int row, int cell ) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(IPathConstants.excelPath);

		String  value = WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();

		return value;
	}
	
	
	public int getrowCount(String excelPath, String Sheet) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream(IPathConstants.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		int rc = wb.getSheet(Sheet).getLastRowNum();		
		return rc;
	}

}
