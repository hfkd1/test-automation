package com.d1tech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d1tech.base.TestBase;

public class LoginPage extends TestBase{
	
	WebDriver driver;
	
	@FindBy(id = "loginButton")
	WebElement loginButton;
	
	@FindBy(name = "eMail")
	WebElement eMail;
	
	@FindBy(name = "password")
	WebElement password;
	
	WebElement titleText;

	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//EMail alanının doldurulması
	public void setEMail(String strEMail) {
		
		eMail.sendKeys(strEMail);
		
	}
	
	//Password alanının doldurulması
	public void setPassword(String strPassword) {
		
		password.sendKeys(strPassword);
		
	}
	
	//Doldurulan Email alanının kontrol için alınması
	public String getEMail() {
		
		return eMail.getText();
		
	}
	
	//Doldurulan Password alanının kontrol için alınması
	public String getPassword() {
		
		return password.getText();
		
	}
	
	public void clickLogin() {
		
		loginButton.click();
		
	}
	
	public String getLoginTitle() {
		
		return titleText.getText();
		
	}
	
	public void login(String strEmail, String strPassword) {
		
		//Fill Email field
		this.setEMail(strEmail);
	
		//Fill Password field
		this.setPassword(strPassword);
		
		//Click Login Button
		this.clickLogin();
		
		
	}
	
	

}
