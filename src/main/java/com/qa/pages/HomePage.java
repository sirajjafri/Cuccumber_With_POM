package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase{
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//font[contains(text(), 'Naveen K')]")
	WebElement username;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement Contacts;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement NewContact;
	
	public String homepage_title(){
		return driver.getTitle();
	}
	
	public boolean loggedin_user(){
		return username.isDisplayed();
		
	}
	
	public ContactsPage click_ContactsLink(){
		Contacts.click();
		return new ContactsPage();
	}


	

}
