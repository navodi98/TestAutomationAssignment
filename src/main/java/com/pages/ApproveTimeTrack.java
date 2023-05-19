package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class ApproveTimeTrack extends TestBase{

	//page factory
	@FindBy(xpath="//td[contains(text(),'Approve Time-Track')]")
	WebElement contentTitle;
	
	@FindBy(xpath="//table//input[@type='checkbox']")
	WebElement checkBox;
	
	@FindBy(xpath="//span[@id='approveButton']")
	WebElement approveBtn;
	
	@FindBy(xpath="//span[@id='rejectButton']")
	WebElement rejectBtn;
	
	//actions:
	public String verifyApproveTimePageTitle() {
		return driver.getTitle();
	}
	
	public ApproveTimeTrack() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyTitleLabel() {
		return contentTitle.isDisplayed();
	}
	
	public void selectTimeStatus() {
		driver.findElement(By.xpath("//table//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//span[@class='actionButton approve']")).click();
	}
	
}
