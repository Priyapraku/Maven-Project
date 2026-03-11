package com.pageobjectmanager;

import com.pageobjectmodel.AddToCart;
import com.pageobjectmodel.Addresspage;
import com.pageobjectmodel.CheckOut;
import com.pageobjectmodel.LoginPage;
import com.utility.FileReaderManager;

public class PageObjectManager {
	private static final LoginPage LoginPage = null;
	private LoginPage loginpage;
	private AddToCart addToCart;
	private CheckOut checkOutPage;
	private Addresspage addressBillingPage;
	private FileReaderManager fileReader;
	private static PageObjectManager pageObjectManager;
	
	public LoginPage getLoginPage() {
		if(loginpage ==null) {
			loginpage =new LoginPage(); {
		}
		}return loginpage;
	}
		public AddToCart getAddToCart() {
			if(addToCart ==null) {
				addToCart =new AddToCart(); {
			}
			}	return addToCart;
		}
	//CheckOut checkOutPage = new CheckOut();
			public CheckOut getCheckOutPage() {
				if(checkOutPage == null) {
					checkOutPage = new CheckOut();			
				}
				return checkOutPage; 
			}
			
			public Addresspage getAddressBillingpage() {
				if(addressBillingPage == null) {
					addressBillingPage = new Addresspage();	
				}
				return addressBillingPage;
			}
			public FileReaderManager getFileReader() {
				if (fileReader == null) {
					fileReader = new FileReaderManager();
				}
				return fileReader;
			}
			public static PageObjectManager getPageObjectManager() {
				if (pageObjectManager == null) {
					pageObjectManager = new PageObjectManager();
				}
				return pageObjectManager;
				}
			}
			
		
	