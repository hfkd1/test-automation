package com.d1tech.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.d1tech.base.TestBase;
import com.d1tech.pages.HomePage;
import com.d1tech.pages.LoginPage;



public class TestLoginPage extends TestBase {
	
	HomePage homePage;
	
	LoginPage loginPage;
	
	public TestLoginPage() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		loginPage = homePage.girisYap();
		
	}
	
	@Test(priority = 3)
	public void verifyTitle() {
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))); 
//		
//		LoginPage loginPage = new LoginPage();
		
		System.out.println("testloginpage'in verifytitle");
		String titleLoginPage = loginPage.getLoginTitle();
		System.out.println("title aldi");
		System.out.println("Title bu:"+titleLoginPage);
		Assert.assertEquals(titleLoginPage, "Giriş Yap - n11.com");
		
	}
	
	@Test(priority = 4)
	public void verifyEmail() {

		//Email alanında yazması gereken mail adresi Excel'den çekilir.
		String expectedEmail = excelRead.getEmail();
		
		//Email alanı Excel'den çekilen veriyle doldurulur.
		loginPage.setEmail(excelRead.getEmail());
		
		//Email alanında yazan veri actualEmail değişkenine atanır.
		String actualEmail = loginPage.getEmail();
		
		//Kontrol işlemi gerçekleştirilir.
		Assert.assertEquals(actualEmail, expectedEmail);
		
	}
	
	@Test(priority = 5)
	public void verifyPassword() {
		
		
		//Password alanında yazması gereken password adresi Excel'den çekilir, expectedPassword değişkenine atanır.
		String expectedPassword =excelRead.getPassword();
		
		//Password alanı Excel'den çekilen veriyle doldurulur.
		loginPage.setPassword(excelRead.getPassword());
				
			
		//Password alanında yazan veri actualPassword değişkenine atanır.
		String actualPassword = loginPage.getPassword();
		
		//Kontrol işlemi gerçekleştirilir.
		Assert.assertEquals(actualPassword, expectedPassword);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
