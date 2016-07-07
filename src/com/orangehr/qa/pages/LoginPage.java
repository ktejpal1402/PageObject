package com.orangehr.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	protected WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(id = "txtUsername")
	private WebElement username;

	@FindBy(id = "txtPassword")
	private WebElement password;
	
	@FindBy(id = "btnLogin")
	private WebElement loginButton;
	
	public void loginPanel(String userName, String passWord){
		username.sendKeys(userName);
		password.sendKeys(passWord);
		loginButton.click();		
	}
	
}
