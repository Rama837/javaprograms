package com.objectlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesOrderPage{

	 WebDriver driver;

	public SalesOrderPage (WebDriver driver) 
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
	@FindBy(xpath="//img[@title='Create Sales Order...']") private WebElement clickcreateNewSalesOrder;

	/**
	 * @return the clickcreateNewSalesOrder
	 */
	public WebElement getClickcreateNewSalesOrder() {
		return clickcreateNewSalesOrder;
	}
	
	  


	// Business library	 
	public void  clickNewSalesOrder() {
		clickcreateNewSalesOrder.click();
		
	}
	
}
