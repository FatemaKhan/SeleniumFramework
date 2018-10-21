package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SWDFunctions {
	
	//initial the web driver
	public WebDriver driver;
	
	
	//to type
	public void typeByXpath (String locator, String value) {
		driver.findElement (By.xpath(locator)).sendKeys (value);
	}
	
	//to click
	public void typeByXpath (String locator) {
		driver.findElement (By.xpath(locator)).click();
	
	}
}
