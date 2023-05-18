package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.ApproveTimeTrack;
import com.pages.Home;
import com.pages.Login;
import com.pages.Reports;
import com.pages.Tasks;
import com.pages.Users;
import com.pages.Schedule;

public class HomeTest extends TestBase{

	Login login;
	Home home;
	Tasks tasks;
	Reports reports;
	Users users;
	Schedule schedule;
	ApproveTimeTrack approve;
	
	public HomeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		login = new Login();
		home = login.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyPageTitleTest() {
		String homeTitle = home.verifyPageTitle();
		Assert.assertEquals(homeTitle, "actiTIME - Login", "Home page title mismatching");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest() {
		Assert.assertTrue(home.verifyUserName());
	}
	
	@Test(priority=3)
	public void verifyTasksLinkTest() {
		tasks = home.clickOnTasksLink();
	}
	
	@Test(priority=4)
	public void verifyReportsLinkTest() {
		reports = home.clickOnReportsLink();
	}
	
	@Test(priority=5)
	public void verifyUsersLinkTest() {
		users = home.clickOnUsersLink();
	}
	
	@Test(priority=6)
	public void verifyScheduleLinkTest() {
		schedule = home.clickOnScheduleLink();
	}
	
	@Test(priority=7)
	public void clickOnApproveTimeTrackLinkTest() {
		approve = home.clickOnApproveTimeTrackLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
