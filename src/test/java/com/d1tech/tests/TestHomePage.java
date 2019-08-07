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
		String titleHomePage = homePage.validateTitle();
		Assert.assertEquals(titleHomePage,"n11.com - Alışverişin Uğurlu Adresi");
		System.out.println("homepage title:"+titleHomePage);
		
		System.out.println("homepage test1");
	}
	
	@Test(priority = 2)
	public void clickSignIn() {
		homePage.girisYap();
		
		System.out.println("homepage test2");
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();		
	}
	
	
	
}
