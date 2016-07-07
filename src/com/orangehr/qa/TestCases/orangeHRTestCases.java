package com.orangehr.qa.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.orangehr.qa.pages.LoginPage;
import com.orangehr.qa.pages.TimeSheetPage;
import com.orangehr.qa.utils.BrowserFactory;

public class orangeHRTestCases {

	
	@Test
	public void verifyloginOrangeHr(){
		WebDriver driver = BrowserFactory.startBrowser("firefox", "http://enterprise.demo.orangehrmlive.com/index.php/auth/login");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginPanel("admin", "admin");
		
	}
	
	@Test 
	public void validateQuickLaunch() throws InterruptedException{
		WebDriver driver = BrowserFactory.startBrowser("firefox", "http://enterprise.demo.orangehrmlive.com/index.php/auth/login");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginPanel("admin", "admin");
		TimeSheetPage timeSheetPage = PageFactory.initElements(driver, TimeSheetPage.class);
		timeSheetPage.searchEmployeeName("Alice Duval");
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
