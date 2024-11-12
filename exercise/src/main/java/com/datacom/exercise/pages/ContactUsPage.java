package com.datacom.exercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.datacom.exercise.locators.ContactUsLocators;

public class ContactUsPage {
	private WebDriver driver;

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isPageLoaded() {
		return driver.getTitle().contains("Contact Us — Get In Touch");
	}

	public String getHeaderTitleText() {
		return driver.findElement(By.xpath(ContactUsLocators.HDRTITLE)).getText();
	}

	public String getHeaderBodyText() {
		return driver.findElement(By.xpath(ContactUsLocators.HDRBODY)).getText();
	}

	public boolean hasLocationTab(String tabName) {
		return driver.findElement(By.xpath(ContactUsLocators.TABLOCATIONNAME.replace("tabName", tabName)))
				.isDisplayed();
	}

	public void clickLocationTab(String tabName) {
		driver.findElement(By.xpath(ContactUsLocators.TABLOCATIONNAME.replace("tabName", tabName))).click();
	}

	public boolean isLocationInfoLoaded(String tabName) {
		return driver.findElement(By.xpath(ContactUsLocators.TABLOCATIONINFO.replace("tabName", tabName)))
				.isDisplayed();
	}

}
