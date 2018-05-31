package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class loginPage extends TestBase {
	
	// initializing page object
	public loginPage(){
		PageFactory.initElements(driver, this);
	}
	
	// Annotations
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement submit;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signup;
	
	@FindBy(xpath="//img[@alt='free crm logo']")
	WebElement crmlogo;
	
	// Methods
	public boolean crmlogo_display(){
		return crmlogo.isDisplayed();
		
	}
	
	public String loginpage_title(){
		
		return driver.getTitle();
	}
	
	public HomePage homePage_login(String un, String pass){
		
		username.sendKeys(un);
		password.sendKeys(pass);
		submit.click();
		return new HomePage();
		
	}

}
