package com.objectlibrary;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericlibrary.WebDriverUtility;

public class NewSalesOrderPage {

	public NewSalesOrderPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@alt='Create Sales Order...']") private WebElement createNewSalesOrder;	
	@FindBy(xpath="//input[@name='subject']")		private WebElement subject;	
	@FindBy(xpath ="//img[@title='Products']") private WebElement productLookup;

	@FindBy(xpath="(//img[@title='Select'])[4]")	private WebElement orgLookUp;
	@FindBy(xpath="//textarea[@name='bill_street']")	private WebElement billingAdrs;	
	@FindBy(xpath="//textarea[@name='ship_street']")	private WebElement shippingAdrs;
	@FindBy(xpath = "//a[text()='Samsung']") private WebElement productName;
	@FindBy(xpath ="(//input[@title='Save [Alt+S]'])[2]") private WebElement savebtn;
	@FindBy(xpath = "//input[@id='qty1']") private WebElement reqquantity;
	@FindBy(xpath = "//input[@id='listPrice1']") private WebElement listPrice;
	@FindBy(xpath = "//select[@id='adjustmentType']") private WebElement directReduce;
	@FindBy(xpath = "//select[@id='taxtype']") private WebElement taxType;


	public WebElement getTaxType() {
		return taxType;
	}

	public WebElement getDirectReduce() {
		return directReduce;
	}

	public WebElement getListPrice() {
		return listPrice;
	}

	public WebElement getreqQuantity() {
		return reqquantity;
	}

	public WebElement getCreateNewSalesOrder() {
		return createNewSalesOrder;
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getBillingAdrs() {
		return billingAdrs;
	}

	public WebElement getShippingAdrs() {
		return shippingAdrs;
	}

	public WebElement getOrgLookUp() {
		return orgLookUp;
	}
	public WebElement getProductLookup() {
		return productLookup;
	}


	//Business library		
	WebDriverUtility wdu=new WebDriverUtility();
	public void newSalesOrder() {
		createNewSalesOrder.click();
		subject.sendKeys("Samsungj7");
		orgLookUp.click();
	}
	public void address() {
		billingAdrs.sendKeys("Banglore");
		shippingAdrs.sendKeys("Banglore");
	}
	public void proName() {
		productName.click();
	}
	public void quantity() {
		reqquantity.sendKeys("40");
	}
	public void listPrice() {
		listPrice.sendKeys("8000");
	}
	public void discount() {
		directReduce.sendKeys("200");
	}

	public void selTaxMode() {
		wdu.select_DD(taxType, "Group");
	}

	public void clicksave() {
		savebtn.click();
	}

}

