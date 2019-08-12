package com.qa.automation.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.qa.automation.core.CommonPageHelpersLib;

public class GoIbiboPageHelper extends CommonPageHelpersLib{

	public static void openHomePage(WebDriver driver) {
		get(GoIbiboPageConstants.url, driver);
	}
	
	public static void enterSourceAndDestination(String src, String dest, WebDriver driver) throws InterruptedException {
		enterText(GoIbiboPageObjects.getSourceField(driver),src,driver);
		sleep(2000, driver);
		keyPress(Keys.DOWN, driver);
		keyPress(Keys.ENTER, driver);
		sleep(2000, driver);
		enterText(GoIbiboPageObjects.getDestField(driver),dest,driver);
		sleep(2000, driver);
		keyPress(Keys.DOWN, driver);
		keyPress(Keys.ENTER, driver);
		sleep(2000, driver);
	}
	
	public static void selectDepDateField(WebDriver driver) {
		click(GoIbiboPageObjects.getDepField(driver), driver);
	}
	
	public static void selectDefaultDate(WebDriver driver) {
		click(GoIbiboPageObjects.getDefaultDepDate(driver), driver);
	}
	
	
	public static void clickSearchButton(WebDriver driver) {
		click(GoIbiboPageObjects.getSearchButton(driver), driver);
	}
	
	public static boolean allFlightsLinkDisplayed(WebDriver driver) {
		return GoIbiboPageObjects.getAllFlightsText(driver).isDisplayed();
	}
	
	public static void toggleCostListingOrder(WebDriver driver) {
		click(GoIbiboPageObjects.getCostOrderToggleButton(driver), driver);
	}
	
	public static int getFlightCostByPosition(int position, WebDriver driver) {
		String temp = GoIbiboPageObjects.getFlightCostText(position, driver).getAttribute("innerText");
		temp = temp.replaceFirst(",", "");
		return Integer.parseInt(temp);
	}

}
