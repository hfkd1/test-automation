package com.d1tech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d1tech.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(className = "btnSignIn")
	WebElement girisYap;
	
	@FindBy(className = "logo")
	WebElement logo;
	
	@FindBy(className = "myBasket")
	WebElement sepet;
	
	@FindBy(xpath = "//a[@class='menuLink user']")
	WebElement isim;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateTitle() {
		return driver.getTitle();
	}
	
	public String getName() {
		return isim.getText();
	}
	
	public LoginPage girisYap() {
		girisYap.click();
	
		return new LoginPage();
	}

	
}
