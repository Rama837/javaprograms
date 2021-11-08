package com.objectlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericlibrary.WebDriverUtility;

public class OrgPage {
	WebDriver driver;
WebDriverUtility wdu=new WebDriverUtility();
	public OrgPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title = 'Create Organization...']")	private WebElement createOrgImage;
	@FindBy(xpath="//input[@id='search_txt']") private WebElement searchbox;
	@FindBy(xpath = "//select[@class='txtBox']") private WebElement selectdropdown;
	@FindBy(xpath = "//input[@name='search']") private WebElement searchnow;
	@FindBy(xpath = "//td[text()='Organizations']") private WebElement orgPopup;
	@FindBy(xpath = "//a[text()='Samsung']") private WebElement selOrg;
	 
	
	 
	public WebElement getOrgPopup() {
		return orgPopup;
	}

	
	public WebElement getSelOrg() {
		return selOrg;
	}

	public WebElement getSearchnow() {
		return searchnow;
	}

	
	public WebElement getSelectdropdown() {
		return selectdropdown;
	}

	public WebElement getCreateOrgImage() {
		return createOrgImage;
	}
	
	public WebElement getSearchbox() {
		return searchbox;
	}
	
//	Business Library
	
	public void search_OrgchildWin() throws InterruptedException {
		wdu.pageloadtimeout(driver);
		searchbox.sendKeys("Samsung");
//		Thread.sleep(2000);
		wdu.select_DD(selectdropdown,0);
//		Thread.sleep(2000);
		searchnow.click();
//	Thread.sleep(2000);
	selOrg.click();
//	Thread.sleep(2000);
	wdu.acceptAlert(driver);
	Thread.sleep(2000);
	
			}
	
}
