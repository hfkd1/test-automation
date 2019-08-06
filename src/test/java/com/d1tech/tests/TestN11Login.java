package com.d1tech.tests;

import org.testng.annotations.Test;

import com.d1tech.pages.N11HomePage;
import com.d1tech.pages.N11Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class TestN11Login {
	
	WebDriver driver;
	N11HomePage objN11HomePage;
	N11Login objN11Login;
	
	@BeforeTest
	public void setUp() {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("www.n11.com");
		
	}
	
	@Test
	public void 

}
