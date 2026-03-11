package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;
import com.interfacetest.LoginInterfaceElements;
import com.pageobjectmanager.PageObjectManager;
import com.utility.FileReaderManager;

public class LoginPage extends BaseClass implements LoginInterfaceElements{
	
	@FindBy(xpath =login_xpath)
	private WebElement login;
	
	@FindBy(id = username_id)
	private WebElement username;
	
	@FindBy(css = password_css)
	private WebElement password;
	
	@FindBy(xpath = signin_xpath)
	private WebElement signin;
	
	@FindBy(id=title_id)
	private WebElement title;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
public void validlogin() throws IOException, InterruptedException {
	clickOnElement(login);
	PageObjectManager.getPageObjectManager().getFileReader();
	passInput(username,FileReaderManager.getDataProperty("username"));
    PageObjectManager.getPageObjectManager().getFileReader();
	passInput(password, FileReaderManager.getDataProperty("password"));
    clickOnElement(signin);
    explicitwait(title,10,"visisble");
   // getText(title);
    
}
}
