package com.provilac.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.provilac.keyword.Keyword;
import com.provilac.stepDefination.TestBase;
import com.provilac.utilities.WaitUtil;

public class OtpPage {
	
	public OtpPage() {
		PageFactory.initElements(TestBase.driver, this);
	}


	@FindBy(xpath = "//h2[text()='Get started']")
	private WebElement getStarted;
	
	public String getTextGetStarted() throws InterruptedException {
		WaitUtil.elementToBeVisible(getStarted);
		return getStarted.getText();
	}

	@FindBy(xpath = "//a[text()='SIGN IN']")
	 WebElement signIn;
	public void signIn() {
		WaitUtil.elementToBeClickable(signIn);
			signIn.click();
		
	}
	
	@FindBy(xpath = "//input[@id=\"app-download-code\"]")
	private WebElement mobileNumber;
	
	public void enterMobileNumber(String mobnumber) throws InterruptedException {
		Thread.sleep(2000);
		mobileNumber.clear();
		mobileNumber.sendKeys(mobnumber);
	}
	
	@FindBy(xpath = "//input[@formcontrolname=\"referralCode\"]")
	private WebElement referralCode;
	
	public void enterReferralCode(String refCode) {
		referralCode.sendKeys(refCode);
	}

	@FindBy(xpath = "//button[contains(text(),' Verify Mobile ')]")
	private WebElement verifyMobile;
	
	public void clickOnVerifyMobile() {
		verifyMobile.click();
	}
	
	@FindBy(xpath = "//input[@id=\"app-download-code\"]")
	private WebElement otp;
	
	public void enterOtp() {
		Keyword keyword= new Keyword();
		this.otp.sendKeys(keyword.getInputFromUser());
	}

	@FindBy(xpath = "//button[text()='Verify OTP']")
	private WebElement verifyOTP;
	
	public void clickOnVerifyOTG() {
		verifyOTP.click();
	}
}
