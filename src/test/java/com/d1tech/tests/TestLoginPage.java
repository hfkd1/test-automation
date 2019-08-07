package com.d1tech.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.d1tech.base.TestBase;
import com.d1tech.pages.LoginPage;
import com.d1tech.util.ExcelRead;

public class TestLoginPage extends TestBase {

	LoginPage loginPage;
	
	public TestLoginPage() {
		
		super();
		
	}
	
	@BeforeClass
	public void setUp() {
		
		initialization();
		loginPage = new LoginPage();
		
	}
	
	@Test(priority = 0)
	public void verifyTitle() {
		
		String title = loginPage.getLoginTitle();
		Assert.assertEquals(title, "Giriş Yap - n11.com");
		
	}
	
	@Test(priority = 1)
	public void verifyEmail() {
		
		//Email alanında yazması gereken mail adresi Excel'den çekilir.
		String expectedEmail = excelRead.geteMail();
		
		//Email alanı Excel'den çekilen veriyle doldurulur.
		loginPage.setEMail(excelRead.geteMail());
		
		//Email alanında yazan veri actualEmail değişkenine atanır.
		String actualEmail = loginPage.getEMail();
		
		//Kontrol işlemi gerçekleştirilir.
		Assert.assertEquals(actualEmail, expectedEmail);
		
	}
	
	@Test(priority = 2)
	public void verifyPassword() {
		
		//String expectedPassword = 
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
