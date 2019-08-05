package com.d1tech.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.d1tech.base.TestBase;
import com.d1tech.pages.HomePage;

public class TestHomePage extends TestBase{

	HomePage homePage;
	public TestHomePage() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage=new HomePage();
		
	}
	
	@Test(priority = 1)
	public void getTitle() {
		String title = homePage.validateTitle();
		Assert.assertEquals(title,"n11.com - Alışverişin Uğurlu Adresi");				
	}
	
	@Test(priority = 2)
	public void clickSignIn() {
		homePage.girisYap();
		
	}
	
		
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
