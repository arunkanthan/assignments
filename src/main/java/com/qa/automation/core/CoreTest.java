package com.qa.automation.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CoreTest {

	public static WebDriver setDriver() {
		WebDriver driver = null;

		if (Config.browser == "Firefox") {
			System.setProperty("webdriver.gecko.driver", Config.firefoxdriverpath);
			driver = new FirefoxDriver();
		}
		return driver;
	}
}