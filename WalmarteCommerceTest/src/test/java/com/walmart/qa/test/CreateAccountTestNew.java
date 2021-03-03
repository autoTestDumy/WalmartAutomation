package com.walmart.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.page.CreateAccountPage;
import com.walmart.qa.page.SignInMyAccountPage;

public class CreateAccountTestNew extends TestBase{
	
	CreateAccountPage createAccountPage;
	SignInMyAccountPage signInMyAcnt;
	
	public CreateAccountTestNew() {
		super();
	}
	
	@BeforeMethod
	public void createNewAccount() {
		intialization();
		signInMyAcnt = new SignInMyAccountPage();
		createAccountPage = new CreateAccountPage();
		
		signInMyAcnt.clickSignInDropDown();
	}
	@Test(priority=1)
	public void creatAccountDataTest() {
		createAccountPage.enterFirstName(prop.getProperty("FName"));
		createAccountPage.enterLastName(prop.getProperty("LName"));
		createAccountPage.enterPhoneNumber(prop.getProperty("Phone"));
		createAccountPage.enterEmailId(prop.getProperty("EmailId"));
		createAccountPage.enterPassword(prop.getProperty("Password"));
		createAccountPage.clickMktngChkBox();
		createAccountPage.clickTermsCheckBox();
		createAccountPage.clickCreateAccountButton();
		String url = createAccountPage.verifyUrl();
		Assert.assertEquals(url, "https://www.walmart.ca/my-account");
	}
	@Test(priority=2)
	public void verifyUrlTest() {
		String url = createAccountPage.verifyUrl();
		Assert.assertEquals(url, "https://www.walmart.ca/my-account");
	}
	
	
	@Test(priority=3)
	public void enterInValidDataTest() {
		createAccountPage.enterFirstName(prop.getProperty("InFName"));
		createAccountPage.enterLastName(prop.getProperty("InLName"));
		createAccountPage.enterPhoneNumber(prop.getProperty("InPhone"));
		createAccountPage.enterEmailId(prop.getProperty("InEmailId"));
		createAccountPage.enterPassword(prop.getProperty("InPassword"));
		createAccountPage.clickMktngChkBox();
		createAccountPage.clickTermsCheckBox();
		createAccountPage.clickCreateAccountButton();
	}
	
			
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
