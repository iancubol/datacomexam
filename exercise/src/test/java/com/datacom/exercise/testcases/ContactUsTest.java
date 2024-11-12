package com.datacom.exercise.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.datacom.exercise.utils.DriverUtil;
import com.datacom.exercise.utils.SampleDataFile;

import steps.ContactUsSteps;

/**
 * Unit test for simple App.
 */
public class ContactUsTest {
	protected WebDriver driver;
	ContactUsSteps steps;

	public ContactUsTest() {
		this.driver = DriverUtil.init();
		this.steps = new ContactUsSteps(driver);
	}

	@BeforeSuite
	public void setup() {
		steps.navigateToPage();
	}

	@AfterSuite
	public void tearDown() {
		driver.close();
	}

	@Test
	public void testNavigationToContactUsPage() {
		Assert.assertTrue(steps.validatePageIsLoaded(), "Contact Us page is not loaded.");
	}

	@Test
	public void testOurLocationsHdrAndBodyText() {
		Assert.assertEquals(steps.getHeaderTitle(), SampleDataFile.OURLOCATIONTITLE);
		Assert.assertEquals(steps.getHeaderBody(), SampleDataFile.OURLOCATIONBODY);
	}

	@Test
	public void testLocationItemTabs() {
		String[] locationItemTabs = SampleDataFile.LOCATIONITEMTABS.split(",");
		for (String tabName : locationItemTabs) {
			Assert.assertTrue(steps.validateLocationTabName(tabName), tabName + " tab is not visible");
		}
	}

	@Test
	public void testLocationTabsInformation() {
		String[] locationItemTabs = SampleDataFile.LOCATIONITEMTABS.split(",");
		for (String tabName : locationItemTabs) {
			steps.clickLocationTab(tabName);
			Assert.assertTrue(steps.isLocationInfoLoaded(tabName), tabName + " information is not displayed");
		}
	}

}
