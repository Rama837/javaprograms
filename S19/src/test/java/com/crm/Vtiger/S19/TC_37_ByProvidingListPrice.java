package com.crm.Vtiger.S19;

import org.testng.annotations.Test;

import com.genericlibrary.BaseClass;
import com.genericlibrary.WebDriverUtility;
import com.objectlibrary.HomePage;
import com.objectlibrary.NewSalesOrderPage;
import com.objectlibrary.OrgPage;
import com.objectlibrary.SalesOrderPage;

public class TC_37_ByProvidingListPrice extends BaseClass {

	@Test
	public void selectAndEdit() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		hp.getMovetoMore().click();
		hp.getSalesOrder().click();
		
		SalesOrderPage sop= new SalesOrderPage(driver);
		sop.clickNewSalesOrder();
		
		NewSalesOrderPage nsop= new NewSalesOrderPage(driver);
		nsop.newSalesOrder();
		
		WebDriverUtility wd=new WebDriverUtility();
		wd.pageloadtimeout(driver);
		
		wd.switchwindow(driver, "Accounts");
//		String curl = driver.getCurrentUrl();
//		System.out.println(curl);
		OrgPage popup = new OrgPage(driver);
		popup.search_OrgchildWin();	
		wd.switchwindow(driver, "SalesOrder&action");
		Thread.sleep(2000);
		nsop.address();
		Thread.sleep(4000);
		
		nsop.getProductLookup().click();
		wd.switchwindow(driver, "Products&action");
		nsop.getProductName().click();
		wd.switchwindow(driver, "SalesOrder&action");
		nsop.quantity();
		nsop.discount();
		nsop.listPrice();
		nsop.clicksave();
				
		}
}
