package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Users extends TestBase{

	//page factory
	@FindBy(xpath="//span[text()='List of Users']")
	WebElement userContentTitle;
	
	@FindBy(xpath="//*[@id=\"container\"]/div[12]/div[1]")
	WebElement userProfile;
	
	//Initialize page objects
	public Users() {
		PageFactory.initElements(driver, this);
	}
	
//	public UserSlidingPanel displayProfile() {
//		userProfile.click();
//		return new UserSlidingPanel();
//	}
	
	public String verifyUsersPageTitle() {
		return driver.getTitle();
	}
	
}
