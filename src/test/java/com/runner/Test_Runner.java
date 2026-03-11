package com.runner;

import java.io.IOException;

import com.baseclass.BaseClass;
import com.pageobjectmanager.PageObjectManager;

public class Test_Runner extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		launchBrowser(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("browser"));
		launchUrl(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("Url"));
		PageObjectManager.getPageObjectManager().getLoginPage().validlogin();
		PageObjectManager.getPageObjectManager().getAddToCart().addToCart();
		PageObjectManager.getPageObjectManager().getCheckOutPage().checkOutPage();
		PageObjectManager.getPageObjectManager().getAddressBillingpage().addressBillingPage();
	}

}
