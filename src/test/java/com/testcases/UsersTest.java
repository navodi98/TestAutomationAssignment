package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.Login;
import com.pages.Home;
import com.pages.UserSlidingPanel;
import com.pages.Users;

public class UsersTest extends TestBase{

	Login login;
	Home home;
	Users users;
	UserSlidingPanel userSlidingPanel;
	
	public UsersTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		login = new Login();
		home = login.Login(prop.getProperty("username"), prop.getProperty("password"));
		users = home.clickOnUsersLink();
	}
	
//	@Test(priority=1)
//	public void displayProfileTest() {
//		userSlidingPanel = users.displayProfile();
//	}
//	
	@Test(priority=1)
	public void verifyUsersPageTitleTest() {
		String usersPageTitle = users.verifyUsersPageTitle();
		Assert.assertEquals(usersPageTitle, "actiTIME - User List", "Users page title mismatching");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
