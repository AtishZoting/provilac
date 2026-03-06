package com.provilac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.provilac.keyword.Keyword;
import com.provilac.stepDefination.TestBase;
import com.provilac.utilities.WaitUtil;

public class OderPlacepage {
	
	Keyword keyword= new Keyword();
	
	public OderPlacepage() {
		PageFactory.initElements(TestBase.driver, this);
	}

	@FindBy(xpath = "//button[text()='Confirm']")
	private WebElement confirm;
	
	public void clickOnConfirm() {
		Keyword keyword= new Keyword();
		keyword.scrollPage();
		confirm.click();
	}
	
	@FindBy(xpath = "//div[text()='Order Placed Successfully']")
	private WebElement orderPalce;
	
	public String getOrderPlaceMessage() {
		return orderPalce.getText();
	}
	
	@FindBy(xpath = "//button[text()='Recharge Now']")
	private WebElement rechargeNow;
	
	public void clickOnRechargeNowButton() {
		WaitUtil.elementToBeClickable(rechargeNow);
		rechargeNow.click();
		
	}
	
	@FindBy(xpath = "//li[@class=\"nav-item dropdown customer-dropdown d-none d-md-block\"]")
	private WebElement user;
	
	public void clickOnUser() {
		user.click();
	}
	
	@FindBy(xpath = "//a[text()=' Wallet ']")
	private WebElement wallet;
	
	public void clickOnWallet() {
		wallet.click();
	}
	
	@FindBy(xpath = "(//input[@inputmode=\"numeric\"])[1]")
	private WebElement recharge;
	
	public void enterAmount(String amount) throws InterruptedException {
		recharge.sendKeys(amount);
	}
	
	@FindBy(xpath = "//div[@class=\"l1Item\"]/descendant::p[text()='UPI']")
	private WebElement upi;
	
	public void clickOnUpi() throws InterruptedException {
		WebElement frame= TestBase.driver.findElement(By.id("boltFrame"));
		TestBase.driver.switchTo().frame(frame);
		keyword.clickOnWebElement(upi);
		
	}
	
	@FindBy(xpath = "//p[text()='Google Pay']")
	private WebElement gPay;
	
	public void clickOnGooglePayOption() throws InterruptedException {
		keyword.clickOnWebElement(gPay);
	}

	@FindBy(xpath = "//input[@id=\"upi2Id\"]")
	private WebElement upiId;
	
	public void enterUpiId(String id) throws InterruptedException {
		keyword.sendTextOnWebElement(upiId, id);
	}
	
	@FindBy(xpath = "//button[text()='Verify']")
	private WebElement verify;
	
	public void clickOnVerify() throws InterruptedException {
		keyword.clickOnWebElement(verify);
	}
	
	@FindBy(xpath = "//button[@id=\"procceed-upi-enabled\"]")
	private WebElement proceed;
	
	public void clickOnProceed() throws InterruptedException {
		keyword.clickOnWebElement(proceed);
		TestBase.driver.switchTo().parentFrame();
	}
	
}
