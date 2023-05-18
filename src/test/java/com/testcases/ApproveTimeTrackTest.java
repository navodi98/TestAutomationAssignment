package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.ApproveTimeTrack;
import com.pages.Home;
import com.pages.Login;

public class ApproveTimeTrackTest extends TestBase{

	Login login;
	Home home;
	ApproveTimeTrack approveTimeTrack;
	
	public ApproveTimeTrackTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		login = new Login();
		home = login.Login(prop.getProperty("username"), prop.getProperty("password"));
		approveTimeTrack = home.clickOnApproveTimeTrackLink();
	}
	
	@Test(priority=1)
	public void verifyTitleLabel() {
		Assert.assertTrue(approveTimeTrack.verifyTitleLabel(), "Title is missing.");
	}
	
	@Test(priority=2)
	public void selectTimeStatusTest() {
		approveTimeTrack.selectTimeStatus();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
