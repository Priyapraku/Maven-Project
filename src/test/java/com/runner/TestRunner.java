package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class TestRunner extends BaseClass {
	
	public static void main(String[] args) {
		launchBrowser("chrome");
		launchUrl("https://www.google.com/");
		waitImplicit();
		WebElement element = driver.findElement(By.name("q"));
		passInput(element, "Rose");
		browserTermination();
		windowHandling(0);
		closeOrquit("quit");
		
	}

}
