package com.datacom.exercise.utils;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtil {
	WebDriver driver;

	public static WebDriver init() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + File.separator + "src/test/resources/webdrivers/chromedriver.exe");
		return new ChromeDriver();
	}
}
