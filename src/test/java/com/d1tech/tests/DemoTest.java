package com.d1tech.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
	
public class DemoTest {
	
	@Test
	public void firstTest() {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://google.com";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		String et = "Google";
		String at = driver.getTitle();
		driver.close();
		System.out.println(at);
	}
	
		
	
	
	
	
}
