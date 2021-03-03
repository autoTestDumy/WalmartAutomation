package com.walmart.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.page.SignInMyAccountPage;

public class SignInMyAccountPageTest extends TestBase {
	

	SignInMyAccountPage signInMyAcnt;
	
	public SignInMyAccountPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		signInMyAcnt = new 	SignInMyAccountPage();
		
	}	
	
	@Test
	public void clickSignInTabTest() {
		signInMyAcnt.clickSignInDropDown();
		
	}
	
	
	
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
		
}
