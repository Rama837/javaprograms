package com.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDatafromXl {
	public static void main(String[] args) throws  IOException {
		FileInputStream fis = new FileInputStream("../S19/src/test/resources/TestData/SDET_19.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet("Sheet");
		Row row =sh.getRow(1);
		Cell cell = row.getCell(1);
		String val=cell.getStringCellValue();
		System.out.println(val);
	}
}
