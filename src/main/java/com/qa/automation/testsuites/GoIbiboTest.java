package com.qa.automation.testsuites;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.automation.core.CoreTest;
import com.qa.automation.core.LogHelper;
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
		LogHelper.logDbgMsg("All tests completed.Closing Browser.");
		GoIbiboPageHelper.closeBrowser(driver);
	}

	@Test
	//You need to verify if GoIbibo homepage (https://www.goibibo.com) works as expected.
	public static void verifyHomePage() {
		LogHelper.setTestCaseId(2341);
		LogHelper.logTestStepMsg("Open Ibibo Home page");
		GoIbiboPageHelper.openHomePage(driver);
		LogHelper.logTestStepMsg("Open Ibibo home page title");
		String title = GoIbiboPageHelper.getTitle(driver);
		LogHelper.logTestStepMsg("Verify Ibibo home page title");
		Assert.assertEquals(title, GoIbiboPageConstants.title);
	}

	@Test
	//2. You should be able to search for one-way flights between Bangalore and Mumbai.
	public static void searchFlights() throws InterruptedException {
		LogHelper.setTestCaseId(3342);
		LogHelper.logTestStepMsg("Open Ibibo Home page");
		GoIbiboPageHelper.openHomePage(driver);
		LogHelper.logTestStepMsg("Enter Source and Destination");
		GoIbiboPageHelper.enterSourceAndDestination(GoIbiboPageConstants.src_blr, GoIbiboPageConstants.dest_bom,
				driver);
		LogHelper.logTestStepMsg("Set departure date to default date i.e. today's date");
		GoIbiboPageHelper.selectDefaultDate(driver);
		LogHelper.logTestStepMsg("Click Search button");
		GoIbiboPageHelper.clickSearchButton(driver);
		GoIbiboPageHelper.sleep(2000, driver);
		LogHelper.logTestStepMsg("Verify search results are displayed");
		Assert.assertTrue(GoIbiboPageHelper.allFlightsLinkDisplayed(driver));
	}
	
	@Test
	//You should be able to verify if the page results are ordered in decreasing order of cost.
	public static void searchResultsInDecreasingOrderOfCost() throws InterruptedException {
		LogHelper.setTestCaseId(4568);
		LogHelper.logTestStepMsg("Open Ibibo Home page");
		GoIbiboPageHelper.openHomePage(driver);
		LogHelper.logTestStepMsg("Enter Source and Destination");
		GoIbiboPageHelper.enterSourceAndDestination(GoIbiboPageConstants.src_blr, GoIbiboPageConstants.dest_bom,
				driver);
		LogHelper.logTestStepMsg("Set departure date to default date i.e. today's date");
		GoIbiboPageHelper.selectDefaultDate(driver);
		LogHelper.logTestStepMsg("Click Search button");
		GoIbiboPageHelper.clickSearchButton(driver);
		GoIbiboPageHelper.sleep(2000, driver);
		LogHelper.logTestStepMsg("Toggle flight prices order from high to low");
		GoIbiboPageHelper.toggleCostListingOrder(driver);
		LogHelper.logTestStepMsg("Verify search results are displayes in decreasing proce order");
		int costoffirstflightinlist = GoIbiboPageHelper.getFlightCostByPosition(1, driver);
		int costoffifthflightinlist = GoIbiboPageHelper.getFlightCostByPosition(5, driver);
        Assert.assertTrue(costoffirstflightinlist > costoffifthflightinlist);	
	}

}
