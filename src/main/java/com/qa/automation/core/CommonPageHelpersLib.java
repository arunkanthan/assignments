package com.qa.automation.core;
import java.util.concurrent.TimeUnit;
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

	public void clickButton(WebElement element, WebDriver driver) {
		element.click();
	}

	public String getText(WebElement element, WebDriver driver) {
		return element.getText();
	}

	public void click(WebElement element, WebDriver driver) {
		element.click();
	}

	public void sleep(int timeout, WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}

}
