package com.orangehr.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimeSheetPage {
	
	protected WebDriver driver;
	
	public void HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(linkText = "OrangeBuzz")
    private WebElement orangeBuzzLink;
	
	@FindBy(linkText = "Timesheets")
    private WebElement timeSheetsLink;
	
    @FindBy(id = "x_report_employeeId_empName")
    private WebElement employeeID;
    
    @FindBy(id = "searchBtn")
    private WebElement searchButton;
	
    public void searchEmployeeName(String empName) throws InterruptedException{
    	timeSheetsLink.click();
    	employeeID.sendKeys(empName);
    	searchButton.click();
    }
    
}
