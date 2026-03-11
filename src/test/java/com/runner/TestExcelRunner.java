package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.ReadExcelData;

public class TestExcelRunner {

public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		String search = ReadExcelData.getParticularData(3,0);
		driver.findElement(By.name("search_query")).sendKeys(search);
		driver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
}
}