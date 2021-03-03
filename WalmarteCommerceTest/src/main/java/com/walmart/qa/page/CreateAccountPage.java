package com.walmart.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class CreateAccountPage extends TestBase {

	@FindBy(id = "firstName")
	WebElement firstName;

	@FindBy(id = "lastName")
	WebElement lastname;

	@FindBy(id = "phoneNumber")
	WebElement phoneNumber;

	@FindBy(id = "email")
	WebElement emailId;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//input[@class='css-avl34f ega94xn1' and @id='marketingPreference']")
	WebElement marketingCheckBox;

	@FindBy(xpath = "//input[@id='TAndC' and @type='checkbox']")
	WebElement tandcCheckBox;
	
	
	@FindBy(xpath = "//button[contains(text (),'Create account')]")
	WebElement createButton;

	public CreateAccountPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterFirstName(String name) {
		firstName.sendKeys(name);

	}

	public void enterLastName(String lname) {
		lastname.sendKeys(lname);
	}

	public void enterPhoneNumber(String phNbr) {
		phoneNumber.sendKeys(phNbr);
	}

	public void enterEmailId(String email) {
		emailId.sendKeys(email);
	}

	public void enterPassword(String pswd) {
		password.sendKeys(pswd);
	}

	public void clickMktngChkBox() {
		marketingCheckBox.click();
	}

	public void clickTermsCheckBox() {
		tandcCheckBox.click();
	}
	
	public UserAccountPage clickCreateAccountButton() {
		createButton.click();
		return new UserAccountPage();
	}
	public String verifyUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

}
