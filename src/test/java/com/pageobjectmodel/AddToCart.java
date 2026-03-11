package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;
import com.interfacetest.AddToCartInterfaceElements;

public class AddToCart extends BaseClass implements AddToCartInterfaceElements {
	
	@FindBy(xpath = laptopn_xpath)
	private WebElement laptop;
	
	@FindBy (xpath = sony_xpath)
	private WebElement sony_click;
	
	@FindBy (xpath = addtocart_xpath)
	private WebElement addToCart;
	
	public AddToCart() {
		PageFactory.initElements(driver, this);
	}
	
	public void addToCart() throws InterruptedException {
		clickOnElement(laptop);
		clickOnElement(sony_click);
		explicitwait(addToCart,10, "Visible");
		clickOnElement(addToCart);
		explicitwait(null , 10, "alert");
		//alertAcceptAndDismiss("accept");
		//Thread.sleep(4000);
		//as per //
		alertAccept();
		
	}

	}
	
	
	
	
	


