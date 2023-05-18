package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.Home;
import com.pages.Login;

public class LoginTest extends TestBase{

	Login login;
	Home home;
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		login = new Login();
	}

	@Test(priority=1)
	public void loginTitleTest() {
		String title = login.validateLoginTitle();
		Assert.assertEquals(title, "actiTIME - Login");
	}
	
	@Test(priority=2)
	public void loginTest() {
		home = login.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
