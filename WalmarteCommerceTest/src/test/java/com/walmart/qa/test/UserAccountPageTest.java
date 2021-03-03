package com.walmart.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.page.UserAccountPage;

public class UserAccountPageTest extends TestBase{
	
	UserAccountPage userAccountPage;
	
	
	public UserAccountPageTest() {
		super();
	}
	
	@BeforeMethod
	public void userAccount() {
		intialization();
		userAccountPage = new UserAccountPage();
		userAccountPage.loginAsUser(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void verifyUserAccountPageTest(){
		String url = userAccountPage.verifyMyAccountPage();
		Assert.assertEquals(url, "https://www.walmart.ca/my-account");
		
	
	}
	@Test(priority=2)
	public void verifyUserDetailTest() {
		String userInitials = userAccountPage.verifyUserDetails();
		Assert.assertEquals(userInitials, "Welcome Tm Xy");
	}
	
	@Test(priority=3)
	public void verifyUserOrderHistoryPageTest() {
		userAccountPage.verifyUserOrderHistoryPage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
