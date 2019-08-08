package com.d1tech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d1tech.base.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(id = "loginButton")
	WebElement loginButton;
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	

	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//EMail alanının doldurulması
	public void setEmail(String strEMail) {
		
		email.sendKeys(strEMail);
		
	}
	
	//Password alanının doldurulması
	public void setPassword(String strPassword) {
		
		password.sendKeys(strPassword);
		
	}
	
	//Doldurulan Email alanının kontrol için alınması
	public String getEmail() {
		
		return email.getAttribute("value");
		
	}
	
	//Doldurulan Password alanının kontrol için alınması
	public String getPassword() {
		
		return password.getAttribute("value");
		
	}
	
	public void clickLogin() {
		
		loginButton.click();
		
	}
	
	public String getLoginTitle() {
		
		return driver.getTitle();
		
	}
	
	public void login(String strEmail, String strPassword) {
		
		//Fill Email field
		this.setEmail(strEmail);
	
		//Fill Password field
		this.setPassword(strPassword);
		
		//Click Login Button
		this.clickLogin();
		
		
	}
	
	

}
