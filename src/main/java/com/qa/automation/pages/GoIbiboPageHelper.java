package com.qa.automation.pages;

import org.openqa.selenium.WebDriver;
import com.qa.automation.core.CommonPageHelpersLib;

public class GoIbiboPageHelper extends CommonPageHelpersLib{

	public static void openHomePage(WebDriver driver) {
		get(GoIbiboPageConstants.url, driver);
	}
	
	public static void enterSourceAndDestination(WebDriver driver) {
		enterText(GoIbiboPageObjects.getSourceField(driver),GoIbiboPageConstants.src_blr , driver);
		enterText(GoIbiboPageObjects.getDestField(driver),GoIbiboPageConstants.dest_bom , driver);
	}

}
