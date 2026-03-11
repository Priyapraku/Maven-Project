package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;
import com.interfacetest.CheckOutInterfaceElements;

public class CheckOut extends BaseClass implements CheckOutInterfaceElements {
	
	@FindBy(xpath = Cart_xpath)
	private WebElement cart;
	
	@FindBy(xpath = Placeorder_xpath)
	private WebElement placeorder;
	
	public CheckOut() {
		PageFactory.initElements(driver, this);
	}
	public void checkOutPage() {
		clickOnElement(cart);
		clickOnElement(placeorder);
		
	}

}
