package com.qa.automation.testsuites;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.automation.core.CoreTest;
import com.qa.automation.pages.GoIbiboPageConstants;
import com.qa.automation.pages.GoIbiboPageHelper;

public class GoIbiboTest {
	private static WebDriver driver;
	
	@BeforeClass
	public static void init() {
		driver = CoreTest.setDriver();
	}
	
	@AfterClass
	public static void closeBrowser() {
		GoIbiboPageHelper.closeBrowser(driver);
	}
	
	@Test
	public static void verifyHomePage() {
		GoIbiboPageHelper.openHomePage(driver);
		String title = GoIbiboPageHelper.getTitle(driver);
		Assert.assertEquals(title, GoIbiboPageConstants.title);
	}

}
