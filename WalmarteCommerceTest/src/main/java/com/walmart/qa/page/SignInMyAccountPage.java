package com.walmart.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class SignInMyAccountPage extends TestBase {

	@FindBy(xpath = "//span[text()='Sign in']")
	WebElement clicksignInDropDown;

	@FindBy(xpath = "//a[text()='Create account']")
	WebElement clickOnJoinNow;
	
	
		
	
	
	public SignInMyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	public CreateAccountPage clickSignInDropDown() {

		clicksignInDropDown.click();
		clickOnJoinNow.click();

		return new CreateAccountPage();
	}
	
	

}
