package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Login extends TestBase{

	//page factory
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(name="pwd")
	WebElement password;
	
	@FindBy(id="loginButton")
	WebElement loginBtn;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	WebElement pwdRecoveryLink;

	//Initialize page objects
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	//action 1:
	public String validateLoginTitle() {
		return driver.getTitle();
	}
	
	//action 2:
	public Home Login(String userName, String pwd) {
		username.sendKeys(userName);
		password.sendKeys(pwd);
		loginBtn.click();

		return new Home();
	}
	
}
