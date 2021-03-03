package com.walmart.qa.test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.page.CreateAccountPage;
import com.walmart.qa.page.SignInMyAccountPage;

public class CreateAccountTest extends TestBase {

	CreateAccountPage createAccountPage;
	SignInMyAccountPage signInMyAcnt;
	
	public CreateAccountTest() {
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
	public void enterFirstNameTest() {
		createAccountPage.enterFirstName(prop.getProperty("FName"));
		
	}
	@Test(priority=2)
	public void enterLastNameTest() {
		createAccountPage.enterLastName(prop.getProperty("LName"));
	}
	@Test(priority=3)
	public void enterValidPhoneTest() {
		createAccountPage.enterPhoneNumber(prop.getProperty("Phone"));
	}
	@Test(priority=4)
	public void enterValidEmailIdTest() {
		createAccountPage.enterEmailId(prop.getProperty("EmailId"));
	}
	@Test(priority=5)
	public void enterPasswordTest() {
		createAccountPage.enterPassword(prop.getProperty("Password"));
	}
	@Test(priority=6)
	public void clickOnMktngChkboxTest() {
		createAccountPage.clickMktngChkBox();
	}
	
	@Test(priority=7)
	public void clickOnTermsChkboxTest() {
		createAccountPage.clickTermsCheckBox();
	}
	
	@Test(priority=8)
	public void createAccountButtonTest() {
		createAccountPage.clickCreateAccountButton();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
