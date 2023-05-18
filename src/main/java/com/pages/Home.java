package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Home extends TestBase{

	//page factory
	@FindBy(xpath="//a[@class='userProfileLink username ']")
	WebElement usernameTag;
	
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[4]/a")
	WebElement TasksLink;
	
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
	WebElement ReportsLink;
	
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[6]/a")
	WebElement UsersLink;
	
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[2]/div/a/div/div[2]")
	WebElement ScheduleLink;
	
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[2]/td[2]/div[4]/a")
	WebElement ApproveTimeTrackLink;

	//Initialize page objects
	public Home() {
		PageFactory.initElements(driver, this);
	}
	
	//actions:
	public String verifyPageTitle() {
		return driver.getTitle();
	}
	
	
	public boolean verifyUserName() {
		return usernameTag.isDisplayed();
	} 
	
	
	public Tasks clickOnTasksLink() {
		TasksLink.click();
		return new Tasks();
	}
	
	public Reports clickOnReportsLink() {
		ReportsLink.click();
		return new Reports();
	}
	
	public Users clickOnUsersLink() {
		UsersLink.click();
		return new Users();
	}
	
	public Schedule clickOnScheduleLink() {
		ScheduleLink.click();
		return new Schedule();
	}
	
	public ApproveTimeTrack clickOnApproveTimeTrackLink() {
		ApproveTimeTrackLink.click();
		return new ApproveTimeTrack();
	}
}
