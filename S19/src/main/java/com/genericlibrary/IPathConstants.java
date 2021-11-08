package com.genericlibrary;

/** * 
 * @author RAMA
 *All the Paths w.r.t. project will be available here
 */


public interface IPathConstants {
	public static String DirPath=System.getProperty("user.dir");
	String propPath=DirPath+"/src/test/resources/CommonData.properties";
	String xmlPath=DirPath+"src/test/resources/TestData/TestData.xml";
	String excelPath=DirPath+"../S19/src/test/resources/TestData/SDET_19.xlsx";
	String jsonPath=DirPath+"/src/test/resources/TestData/TestData.json ";
	String ExtentReportPath = DirPath+"/reports_19/Report_S19";
	int timeforimplicitwait=3000;
	int timeforexplicitwait=2000;
	
}
