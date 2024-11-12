package steps;

import org.openqa.selenium.WebDriver;

import com.datacom.exercise.pages.ContactUsPage;

public class ContactUsSteps {
	ContactUsPage locPage;
	WebDriver driver;

	public ContactUsSteps(WebDriver driver) {
		this.driver = driver;
		this.locPage = new ContactUsPage(driver);
	}

	public boolean validatePageIsLoaded() {
		return locPage.isPageLoaded();
	}

	public void navigateToPage() {
		driver.get("https://datacom.com/nz/en/contact-us");
	}

	public String getHeaderTitle() {
		return locPage.getHeaderTitleText();
	}

	public String getHeaderBody() {
		return locPage.getHeaderBodyText();
	}

	public boolean validateLocationTabName(String tabName) {
		return locPage.hasLocationTab(tabName);
	}

	public void clickLocationTab(String tabName) {
		locPage.clickLocationTab(tabName);

	}

	public boolean isLocationInfoLoaded(String tabName) {
		return locPage.isLocationInfoLoaded(tabName);
	}

}
