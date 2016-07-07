package com.orangehr.qa.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

	static WebDriver driver;

	public static WebDriver startBrowser(String browserName, String url) {

		if (browserName.contains("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.contains("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.contains("safari")) {
			driver = new SafariDriver();
		}

		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
