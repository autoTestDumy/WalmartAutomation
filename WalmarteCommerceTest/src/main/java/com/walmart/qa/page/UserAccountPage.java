package com.walmart.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class UserAccountPage extends TestBase {

	@FindBy(xpath = "//span[text()='Sign in']")
	WebElement clicksignInDropDown;

	@FindBy(id = "username")
	WebElement enterUsername;

	@FindBy(id = "password")
	WebElement enterPassword;

	@FindBy(xpath = "//button [contains (text (),'Sign in')]")
	WebElement clickOnSignIn;

	@FindBy(xpath = "//span[contains (text (),'My account')]")
	WebElement myAccountPage;

	@FindBy(xpath = "//p[contains (text (), 'Welcome Tm Xy')]")
	WebElement userDetails;

	@FindBy(xpath = "//p[contains(text (),'Order History')]")
	WebElement userOrderHistoryPage;

	@FindBy(xpath = "//a[(text()='Profile Settings')]")
	WebElement userProfilePage;

	@FindBy(xpath = "//div[contains (text (), 'You currently have no orders to display.')]")
	WebElement orderHistoryMessage;

	@FindBy(xpath = "//a [contains (text (),'Start shopping!']")
	WebElement startShoppingLink;

	@FindBy(xpath = "//p[contains (text (), 'My recommendations']")
	WebElement userReommendation;

	@FindBy(xpath = "//span[contains (text (), 'Add to cart']")
	WebElement addToCart;

	public UserAccountPage() {
		PageFactory.initElements(driver, this);
	}

	public void loginAsUser(String un, String pwd) {
		clicksignInDropDown.click();
		enterUsername.sendKeys(un);
		enterPassword.sendKeys(pwd);
		clickOnSignIn.click();

	}

	public String verifyMyAccountPage() {
		myAccountPage.click();
		String url = driver.getCurrentUrl();
		return url;

	}

	public String verifyUserDetails() {
		myAccountPage.click();
		String userinitials = userDetails.getText();
		return userinitials;
	}

	public void verifyUserOrderHistoryPage() {
		myAccountPage.click();
		userOrderHistoryPage.click();
	}

}
