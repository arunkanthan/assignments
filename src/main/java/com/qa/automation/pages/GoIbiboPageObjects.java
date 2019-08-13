package com.qa.automation.pages;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

	public static WebElement getFirstSuggestionInSearchList(WebDriver driver) {
		return driver.findElement(By.id("react-autosuggest-1-suggestion--0"));
	}

	public static WebElement getDefaultDepDate(WebDriver driver) {
		 LocalDate localDate = LocalDate.now();
		 String dateid = DateTimeFormatter.ofPattern("yyyMMdd").format(localDate);
		 dateid = "fare_"+ dateid; 
		 return driver.findElement(By.id(dateid));
	}
	
	public static WebElement getSearchButton(WebDriver driver) {
		return driver.findElement(By.id("gi_search_btn"));
	}
	
	public static WebElement getDepField(WebDriver driver ) {
		return driver.findElement(By.className("inputSrch.curPointFlt"));
	}
	
	public static WebElement getAllFlightsText(WebDriver driver) {
		return driver.findElement(By.partialLinkText(GoIbiboPageConstants.search_results_all_flights));
	}
	
	public static WebElement getCostOrderToggleButton(WebDriver driver) {
		return driver.findElement(By.id("sortByPriceOnw"));
	}
	
	public static WebElement getFlightCostText(int position, WebDriver driver) {
		String temp = "//div[contains(@class,''card fl'')][{0}]//span[contains(@id,''o_'')]";
	    String path = MessageFormat.format(temp, position);
	    return driver.findElement(By.xpath(path));
		
	}
}
