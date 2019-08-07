package com.d1tech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d1tech.base.TestBase;

public class BasketEmptyPage extends TestBase{

	@FindBy(xpath = "//h2[contains(text(),'Sepetiniz Boş')]")
	WebElement emptybasketLabel;
	
	@FindBy(id = "searchData")
	WebElement searchField;
	
	@FindBy(className = "searchBtn")
	WebElement searchBtn;
	
	public BasketEmptyPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String validateBasketEmptiness() {
		
		return emptybasketLabel.getText();
	}
	
	public SearchPage search(String srch) {
		
		searchField.sendKeys(srch);
		searchBtn.click();
		
		return new SearchPage();
	}
	
	
	
}
