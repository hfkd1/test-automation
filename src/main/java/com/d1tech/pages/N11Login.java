package com.d1tech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class N11Login {

	WebDriver driver;
	
	@FindBy(id  = "loginButton")
	WebElement loginButton;
	
	@FindBy(name = "email")
	WebElement eMailN11;
	
	@FindBy(name = "password")
	WebElement passwordN11;
	
	WebElement titleText;
	
	public N11Login(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	public void setEmailN11(String strEmailN11) {
		
		eMailN11.sendKeys(strEmailN11);
		
	}
	
	public void setPasswordN11(String strPasswordN11) {
		
		passwordN11.sendKeys(strPasswordN11);
		
	}
	
	public void clickLogIn() {
		
		loginButton.click();
		
	}
	
	public String getLogInTitle() {
		
		return titleText.getText();
		
	}
	
	public void logInToN11(String strEmail, String strpPassword) {
		
		// Fill Email field
		this.setEmailN11(strEmail);
		
		// Fill Password field
		this.setPasswordN11(strpPassword);

		//Click LogIn Button
		this.clickLogIn();
	
	}
	
	
}
