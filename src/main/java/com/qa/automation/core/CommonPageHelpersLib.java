package com.qa.automation.core;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonPageHelpersLib {
	
	public static void get(String url, WebDriver driver) {
		driver.get(url);
	}

	public static String getTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public static void closeBrowser(WebDriver driver) {
		driver.close();
	}

	public static void enterText(WebElement element, String text, WebDriver driver) {
		element.sendKeys(text);
	}

	public static void click(WebElement element, WebDriver driver) {
		element.click();
	}

	public static String getText(WebElement element, WebDriver driver) {
		return element.getText();
	}

	public static void sleep(int waittime, WebDriver driver) throws InterruptedException {
		Thread.sleep(waittime);
	}
	
	public static void keyPress(Keys key, WebDriver driver) {
		driver.switchTo().activeElement().sendKeys(key);
	}

}