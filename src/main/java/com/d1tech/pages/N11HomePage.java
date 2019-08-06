package com.d1tech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class N11HomePage {
	
	WebDriver driver;
	
	@FindBy(id = "btnSignIn")
	WebElement signInButton;
	
	WebElement homePagetitleText;
	
	
	public N11HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickSignIn() {
		
		signInButton.click();
		
	}
	
	public String getHomePageTitleText() {
		
		return homePagetitleText.getText();
		
	}
	

}
