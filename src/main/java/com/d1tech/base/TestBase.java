package com.d1tech.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.d1tech.util.ExcelRead;
import com.d1tech.util.TestUtil;


public class TestBase {
	
	

	public static WebDriver driver;
	public static Properties prop;
	public static ExcelRead excelRead;
	
	public TestBase() {		
		
		//properties dosyasından değer okusun
		try {			
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/d1tech/config/config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Excel'den veri çekme
		
		try {
			excelRead = new ExcelRead();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	//inişılayz ederken yapacağı ayarlamalar
	public static void initialization() {
		
		String browserName = prop.getProperty("browser");
		String osName = prop.getProperty("os");
		
		
		if(browserName.equals("chrome")) {
			if(osName.startsWith("Windows")){
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
				driver = new ChromeDriver();
			}else if (osName.startsWith("Linux")){
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.");
				driver = new ChromeDriver();
			}
		}else if(browserName.equals("firefox")){
			if(osName.startsWith("Windows")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/geckodriver.exe");
				driver = new FirefoxDriver();
			}else if (osName.startsWith("Linux")){
				//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/geckodriver.");
				driver = new FirefoxDriver();
			}
		}	
		
		
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}

}

