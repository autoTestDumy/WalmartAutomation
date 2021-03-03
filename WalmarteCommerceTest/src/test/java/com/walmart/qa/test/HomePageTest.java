package com.walmart.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.page.HomePage;

public class HomePageTest extends TestBase {

	HomePage homepage;
	
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void checkHomePage() {
		intialization();
		homepage = new HomePage();

	}
	
	@Test(priority=1)
	public void checkLogo() {
		boolean image = homepage.validateWalmartLogo();
		Assert.assertTrue(image);
	}
	
	@Test(priority=2)
	public void dealsLinkPage() {
		homepage.clickOnDealsLink();
		
	}
	@Test(priority=3)
	public void titleTest() {
		String title = homepage.pagetitle();
		Assert.assertEquals(title, "Shopping Canada: Everyday Low Prices at Walmart.ca!", "****Wrong****");
	}
	
	@Test(priority=4)
	public void verifyhomePageUrlTest() {
		String url = homepage.homePageUrl();
		Assert.assertEquals(url, "https://www.walmart.ca/en");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
