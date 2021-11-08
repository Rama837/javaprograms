package com.genericlibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.objectlibrary.HomePage;
import com.objectlibrary.LoginPage;


public class BaseClass
{
	public  WebDriver driver;
	WebDriverUtility wdu = new WebDriverUtility();
	FileUtility fileutil = new FileUtility();
//	ExtentHtmlReporter reporter; // To apply look and feel of the report to set the path of extent report
//	public ExtentReports report; // Attach the path of reporter 
//	public	ExtentTest test;// To create entries in the test cases 
//	public static	WebDriver staticdriver;


// Before Suite is used to connect to Database
	@BeforeSuite(groups = {"Smoke Test","Regression Test"})
	public void setup_JDBC_Report() 
	{
		System.out.println("=====JDBC Connection Done====");
//		reporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/SDET19/newreport.html");//imp
//		reporter.config().setDocumentTitle("SDET12Report");
//		reporter.config().setReportName("Title");
//		reporter.config().setTheme(Theme.DARK);
//
//		report= new ExtentReports();//imp
//		report.attachReporter(reporter);//imp
	}

//	close the Database
	@AfterSuite(groups = {"Smoke Test","Regression Test"})
	public void close_JDBC_Report() {
//		report.flush();
		System.out.println("=====JDBC Connection Closed====");
	}

//This method is used to open the browser
	//@Parameters("BROWSER")
	@BeforeClass(groups = {"Smoke Test","Regression Test"})
	public void launchBrowser() throws IOException 
	{
//		String BROWSER = System.getProperty("browser");
		String BROWSER =fileutil.readDatafrompropfile("browser");

		if(BROWSER.equalsIgnoreCase("Chrome")) 
		{
//			System.setProperty(BROWSER, "chrome");
			driver= new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("Firefox"))
		{
			driver= new FirefoxDriver();
		}
		else {
			driver= new ChromeDriver();
		}
//		String url = System.getProperty("url");
		String appUrl = fileutil.readDatafrompropfile("url");
//		staticdriver=driver;
		driver.get(appUrl);
		wdu.maximizewindow(driver);
		wdu.pageloadtimeout(driver);
	}

//	To close the browser
	@AfterClass(groups = {"Smoke Test","Regression Test"})
	public void closeBrowser() 
	{
		driver.close();
	}

//	Login operation is performed
	@BeforeMethod(groups = {"Smoke Test","Regression Test"})
	public void logintoVtiger() throws IOException 
	{
		LoginPage lp = new LoginPage(driver);
		lp.loginintoApp();
	}

//	Logout operation is performed
	@AfterMethod(groups = {"Smoke Test","Regression Test"})
	public void logoutVtiger(ITestResult result) throws InterruptedException, IOException
	{
//		HomePage hp = new HomePage(driver);
//		if(result.getStatus()==ITestResult.FAILURE) 
		{
//			test.log(Status.FAIL, result.getName());//name of failed method
//			test.log(Status.FAIL, result.getThrowable());//Error msg

			String	path=BaseClass.getscreenshot(result.getName());

//			test.addScreenCaptureFromPath(path);

		}
//		else if (result.getStatus()==ITestResult.SUCCESS) 
		{
//			test.log(Status.PASS, result.getName());
//			hp.logoutfromApp();
		}
//		else if (result.getStatus()==ITestResult.SKIP) 
		{
//			test.log(Status.SKIP, result.getName());
		}
	}
	
//	Taking the Screenshots after the execution of test script
	public static String getscreenshot( String name) throws IOException 
	{
//		File srcfile =((TakesScreenshot) staticdriver).getScreenshotAs(OutputType.FILE);
		String destfile= System.getProperty("user.dir")+"/Screenshots/"+name+".png";
		File finaldest = new File(destfile) ;
//		FileUtils.copyFile(srcfile,finaldest);

		return destfile;
	}

}
