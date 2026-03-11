package com.baseclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.Date;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

public abstract class BaseClass {
public static WebDriver driver;

protected static WebDriver launchBrowser(String browserName) {
	try {
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
	} catch (Exception e) {
		Assert.fail("ERROR: OCCUR DURING LAUNCHING BROWSER");
	}
	return driver;
}
protected static void launchUrl(String url) {
	try {
	driver.get(url);
	} catch (Exception e) {
		Assert.fail("ERROR: OCCUR DURING LAUNCHING URL");
	}
}
protected static void passInput(WebElement element,String value) {
	try {
		element.sendKeys(value);
	} catch (Exception e) {
		Assert.fail("ERROR: OCCUR DURING LAUNCHING INPUTS");
	}
}
protected static void browserTermination() {
	try {
		driver.quit();	
	} catch (Exception e) {
		Assert.fail("ERROR: OCCUR DURING QUITTING THE BROWSER");
		
	}
}
protected static void clickOnElement(WebElement element) {
	try {
		element.click();
	} catch (Exception e) {
		Assert.fail("ERROR: OCCUR WHILE CLICKING");	
	}
}
protected static void windowHandling(int num) {
	try {
		List<String> allwindow = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(allwindow.get(0));		
	} catch (Exception e) {
		Assert.fail("ERROR: OCCUR DURING WINDOWHANDLING");
	}
}
protected static void selectOptions(WebElement element,String type,String value) {
	try {
		Select s = new Select(element);
		if(type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}else if(type.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		}else if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}	
	} catch (Exception e) {
		Assert.fail("ERROR: OCCUR DURING SELECT OPTOPNS");
	}
}

protected static void deselectOptions(WebElement element,String type,String value) {
	try {
		Select s = new Select(element);
		if(type.equalsIgnoreCase("text")) {
			s.deselectByVisibleText(value);
		}else if(type.equalsIgnoreCase("index")) {
			s.deselectByIndex(Integer.parseInt(value));
		}else if (type.equalsIgnoreCase("value")) {
			s.deselectByValue(value);
		}	
	} catch (Exception e) {
		Assert.fail("ERROR: OCCUR DURING DESELECT OPTOPNS");
}
}
protected static void titlePage() {
	try {
		String title = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println("Page Title :" + title);
		System.out.println("Current URL : + currentUrl");
	}catch (Exception e) {
		Assert.fail("ERROR: OCCUR DURING GETTING PAGE TITLE");
	}
}
protected static void waitImplicit() {
	try {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	} catch (Exception e) {
		Assert.fail("ERROR: OCCUR DURING IMPLICIT WAIT");
	}
}

protected static void click(WebElement element) {
	try {
		element.click();	
	} catch (Exception e) {
		Assert.fail("ERROR: OCCUR DURING CLICK");
	}
}
protected static void closeOrquit(String type) {
	try {
		if(type.equalsIgnoreCase("quit")) {
			driver.quit();
		}else if(type.equalsIgnoreCase("close")) {
			driver.close();
		}
	} catch (Exception e) {
		Assert.fail("ERROR: OCCUR DURING QUITORCLOSE");
	}
}
protected static void explicitwait(WebElement element, int seconds, String type) {
	try {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(seconds));
		if(type.equalsIgnoreCase("Visible")) {
			wait.until(ExpectedConditions.visibilityOf(element));
		}else if (type.equalsIgnoreCase("Selected")) {
			wait.until(ExpectedConditions.elementToBeSelected(element));
		}else if(type.equalsIgnoreCase("Clickable")) {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			
		}else if(type.equalsIgnoreCase("Title")) {
			wait.until(ExpectedConditions.titleContains(type));
			
		}else if(type.equalsIgnoreCase("alert")) {
			wait.until(ExpectedConditions.alertIsPresent());
		}
	} catch (Exception e) {
		Assert.fail("ERROR: OCCURED DURING EXPLICIT WAIT");
	}

}
protected static void alertAccept() {
	try {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Message in Alert : "+text);
		alert.accept();
		
	} catch (Exception e) {
		Assert.fail("ERROR: OCCURED WHEN ALERT DISMISS & ACCEPT");
	}
}
protected static void takeScreenShots() {
	try {
		Date currentDate = new Date();
		String replace = currentDate.toString().replace(" ", "").replace(":", "");
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File(".//Screenshots//" + replace + "Hotel.png"));

	} catch (Exception e) {
		Assert.fail("ERROR: OCCUR DURING TAKING SCREENSHOTS");
	}
}
}	


