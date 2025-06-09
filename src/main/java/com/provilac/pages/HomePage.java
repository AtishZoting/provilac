package com.provilac.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.provilac.keyword.Keyword;
import com.provilac.stepDefination.TestBase;
import com.provilac.utilities.WaitUtil;

public class HomePage {
	Keyword keyword= new Keyword();
	
	public HomePage() {
		PageFactory.initElements(TestBase.driver, this);
	
	}
	

	@FindBy(xpath = "//a[text()='Pune']")
	private WebElement dropDown;

	public void clickOnDropDownPune() {
		WaitUtil.elementToBeVisible(dropDown);
		dropDown.click();
		
	}
	@FindBy(xpath = "//a[text()='Pune ']")
	private WebElement pune;
	
	public void clickOnPune() {
		WaitUtil.elementToBeVisible(pune);
		pune.click();
	}	

	@FindBy(xpath = "//a[text()=' Guest ']")
	private WebElement guestDropDown;

	public void clickOnGuestDropDown() {
		guestDropDown.click();
		
	}
	
	@FindBy(xpath = "//div[@_ngcontent-serverapp-c2671412965 and @class=\"container nav-container\"]")
	private WebElement logIn;
	
	public void clickOnLogin() {
		logIn.click();
	}
	
	@FindBy(xpath = "//li[contains(@class,\"nav-item dropdown c\")]/a")
	private WebElement userIcon;
	
	public void clickOnUserIcon() {
		WaitUtil.staleOfElement(userIcon);
		userIcon.click();
	}
	
	@FindBy(xpath = "//div[@class=\"dropdown-menu user-profile-menu show\"]/a")
	private WebElement myProfile;
	
	public void clickOnMyProfile() {
		myProfile.click();
	}
	
	@FindBy(xpath = "//input[@placeholder=\"Enter Name\"]")
	private WebElement name;
	
	public void enterName(String name) {
		this.name.clear();
		this.name.sendKeys(name);
	}
	
	@FindBy(xpath = "//input[@placeholder=\"Enter Email\"]")
	private WebElement emailId;
	
	public void enterEmailId(String eid) {
		emailId.clear();
		emailId.sendKeys(eid);
	}
	
	@FindBy(xpath = "//button[text()=' Update ']")
	private WebElement update;
	
	public void clickOnUpdate() {
		update.click();
	}
	
	@FindBy(xpath = "//a[text()=' Mumbai']")
	private WebElement mumbai;
	
	public void clickOnMumbai() {
		WaitUtil.elementToBeVisible(mumbai);
		mumbai.click();
	}
	
	@FindBy(xpath = "//div[text()=' Please enter the full name. ']")
	private WebElement nameMsg;

	public String getNameMessage() {
		WaitUtil.elementToBeVisible(nameMsg);
		return nameMsg.getText();
	}
	
	@FindBy(xpath = "//div[text()=' Please enter the email id. ']")
	private WebElement mailIdMsg;
	
	public String getMailIdMessage() {
		WaitUtil.elementToBeVisible(mailIdMsg);
		return mailIdMsg.getText();
	}

}
	