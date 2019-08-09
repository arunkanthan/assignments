package com.qa.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoIbiboPageObjects {
	
	public static WebElement getSourceField(WebDriver driver) {
		return driver.findElement(By.id("gosuggest_inputSrc"));
	}
	public static WebElement getDestField(WebDriver driver) {
		return driver.findElement(By.id("gosuggest_inputDest"));
	}


}
