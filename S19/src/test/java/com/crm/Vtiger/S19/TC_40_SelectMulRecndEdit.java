package com.crm.Vtiger.S19;

import org.testng.annotations.Test;

import com.genericlibrary.BaseClass;
import com.genericlibrary.WebDriverUtility;
import com.objectlibrary.HomePage;
import com.objectlibrary.NewSalesOrderPage;
import com.objectlibrary.OrgPage;
import com.objectlibrary.SalesOrderPage;
 

public class TC_40_SelectMulRecndEdit extends BaseClass{
@Test
public void selectAndEdit() {
	
	HomePage hp=new HomePage(driver);
	hp.getMovetoMore().click();
	hp.getSalesOrder().click();
	
	SalesOrderPage sop= new SalesOrderPage(driver);
	sop.clickNewSalesOrder();
	
	NewSalesOrderPage nsop= new NewSalesOrderPage(driver);
	nsop.newSalesOrder();
	
	WebDriverUtility wd=new WebDriverUtility();
	
	
	wd.switchwindow(driver, "Accounts");
//	String curl = driver.getCurrentUrl();
//	System.out.println(curl);
	wd.pageloadtimeout(driver);
//	OrgPage popup = new OrgPage(driver);	
//	popup.search();
	
 
	 


//	.getSaveBtn().click();
	
 
	
	
	
	
	
}

	
}
