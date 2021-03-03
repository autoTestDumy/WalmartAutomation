package com.walmart.qa.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.page.CreateAccountPage;
import com.walmart.qa.page.SignInMyAccountPage;

public class InvalidDataCreateAcTest extends TestBase {
	
	CreateAccountPage createAccountPage;
	SignInMyAccountPage signInMyAcnt;
	
	public InvalidDataCreateAcTest() {
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
	public void invalidFirstName1Test() {
		driver.findElement(By.id("firstName")).sendKeys("T");
		driver.findElement(By.xpath("//button[contains(text (),'Create account')]")).click();
		String name1 = driver.findElement(By.xpath("//span[contains(text (), 'Please enter a valid first name.')]")).getText();
				
		Assert.assertEquals(name1, "Please enter a valid first name.");
		//Assert.assertEquals(name1, "Enter a valid first name.", "Dosen't match with the requirement");
	}
	
	@Test(priority=2)
	public void invalidFirstName2Test() {
		driver.findElement(By.id("firstName")).sendKeys("Tom25");
		driver.findElement(By.xpath("//button[contains(text (),'Create account')]")).click();
		String name2 = driver.findElement(By.xpath("//span[contains(text (), 'Please enter a valid first name.')]")).getText();
				
		Assert.assertEquals(name2, "Please enter a valid first name.");
		
	}
	
	@Test(priority=3)
	public void blankFirstNameTest() {
		driver.findElement(By.id("firstName")).sendKeys(" ");
		driver.findElement(By.xpath("//button[contains(text (),'Create account')]")).click();
		String nameBlank = driver.findElement(By.xpath("//span[contains(text (), 'Please enter your first name.')]")).getText();
				
		Assert.assertEquals(nameBlank, "Please enter your first name.");
		
	}
	
	@Test(priority=4)
	public void invalidLastName1Test() {
		driver.findElement(By.id("lastName")).sendKeys("X");
		driver.findElement(By.xpath("//button[contains(text (),'Create account')]")).click();
		String lastName1 = driver.findElement(By.xpath("//span[contains(text (), 'Please enter a valid last name.')]")).getText();
				
		Assert.assertEquals(lastName1, "Please enter a valid last name.");
		
	}
	@Test(priority=5)
	public void invalidLastName2Test() {
		driver.findElement(By.id("lastName")).sendKeys("XYZ25");
		driver.findElement(By.xpath("//button[contains(text (),'Create account')]")).click();
		String lastName2 = driver.findElement(By.xpath("//span[contains(text (), 'Please enter a valid last name.')]")).getText();
				
		Assert.assertEquals(lastName2, "Please enter a valid last name.");
		
	}
	
	@Test(priority=6)
	public void blankLastNameTest() {
		driver.findElement(By.id("lastName")).sendKeys(" ");
		driver.findElement(By.xpath("//button[contains(text (),'Create account')]")).click();
		String lastNameBlank = driver.findElement(By.xpath("//span[contains(text (), 'Please enter your last name.')]")).getText();
				
		Assert.assertEquals(lastNameBlank, "Please enter your last name.");
		
	}
	
	@Test(priority=7)
	public void invalidPhoneNumberTest() {
		driver.findElement(By.id("phoneNumber")).sendKeys("812835832");
		driver.findElement(By.xpath("//button[contains(text (),'Create account')]")).click();
		String phoneNumber = driver.findElement(By.xpath("//span[contains(text (), 'Please enter a valid phone number.')]")).getText();
				
		Assert.assertEquals(phoneNumber, "Please enter a valid phone number.");
		
	}
	
	@Test(priority=8)
	public void invaEmailIdTest1() {
		driver.findElement(By.id("email")).sendKeys("autoTestDumy.yahoo.com");
		driver.findElement(By.xpath("//button[contains(text (),'Create account')]")).click();
		String email1 = driver.findElement(By.xpath("//span[contains(text (), 'Please enter a valid email address.')]")).getText();
				
		Assert.assertEquals(email1, "Please enter a valid email address.");
		
	}
	@Test(priority=9)
	public void blankPasswordTest() {
		driver.findElement(By.id("password")).sendKeys(" ");
		driver.findElement(By.xpath("//button[contains(text (),'Create account')]")).click();
		String blankPassword = driver.findElement(By.xpath("//span[contains(text (), 'Password is a required field.')]")).getText();
				
		Assert.assertEquals(blankPassword, "Password is a required field.");
		
	}
	
	@Test(priority=10)
	public void doNotClickTandCCheckBoxTest() {
		
		driver.findElement(By.xpath("//button[contains(text (),'Create account')]")).click();
		String tandcCheckbox = driver.findElement(By.xpath("//div[@class='css-12pkv6j erl5ymg12' and"
				+ " contains(text (), 'You must read and accept Walmart’s Terms of Use to subscribe.')]")).getText();
				
		Assert.assertEquals(tandcCheckbox, "You must read and accept Walmart’s Terms of Use to subscribe.");
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	

}
