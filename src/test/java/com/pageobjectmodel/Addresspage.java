package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;
import com.interfacetest.AddressInterfaceElements;
import com.pageobjectmanager.PageObjectManager;

public class Addresspage extends BaseClass implements AddressInterfaceElements {
	
	public static Object addressBillingPage;

	@FindBy (xpath = name_xpath)
	private WebElement billingName;
	
	@FindBy (xpath = country_xpath)
	private WebElement billingcountry;
	
	@FindBy (xpath = city_xpath)
	private WebElement billingcity;
	
	@FindBy (id = credit_id)
	private WebElement billingcredit;
	
	@FindBy (id = month_id)
	private WebElement billingmonth;
	
	@FindBy (id = year_id)
	private WebElement billingyear;
	
	@FindBy (xpath = purchase_xpath)
	private WebElement billingpurchase;
	
	@FindBy (xpath = lastok_xpath)
	private WebElement billinglastok;
	
	//@FindBy (xpath = logout_xpath)
	//private WebElement billinglogout;
	
	@FindBy (xpath = closeBilling_xpath)
	private WebElement billingclosebilling;
	
	@FindBy (id = logout_id)
	private WebElement billinglogout;

	private WebElement billingMonth;

	private WebElement billingCredit;

	private WebElement billingCity;

	private WebElement billingCountry;

	private WebElement billingYear;

	private WebElement billingPurchase;

	private WebElement billingLogout;

	private WebElement billingLastok;
	
	public Addresspage() {
		PageFactory.initElements(driver, this);
	}
	public void addressBillingPage() throws IOException {
		explicitwait(billingName,10, "Visible");
		passInput(billingName,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("billingName"));
		passInput(billingCountry,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("billingCountry"));
		passInput(billingCity,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("billingCity"));
		passInput(billingCredit,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("billingCredit"));
		passInput(billingMonth,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("billingCredit"));
		passInput(billingYear,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("billingYear"));
		clickOnElement(billingPurchase);
		takeScreenShots();
		clickOnElement(billingLastok);
		//clickOnElement(billingLogout);
	   //clickOnElement(closeBilling);
		explicitwait(billinglogout, 10, "Visible");
		clickOnElement(billinglogout);  
	
	}
	
	
	
	
	
	
}
