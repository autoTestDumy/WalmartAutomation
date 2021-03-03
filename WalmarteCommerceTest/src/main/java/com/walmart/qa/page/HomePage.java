package com.walmart.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.walmart.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(id = "walmartblue_Layer_1")
	WebElement logo;
	
	@FindBy(xpath = "//a[text()='Deals']")
	WebElement dealslink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateWalmartLogo() {
		return logo.isDisplayed();
		
	}
	
	public void clickOnDealsLink() {
		dealslink.click();
		
	}
	
	public String pagetitle() {
		return driver.getTitle();
	}
	
	public String homePageUrl() {
		return driver.getCurrentUrl();
	}
}
