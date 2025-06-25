package com.provilac.pages;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provilac.keyword.Keyword;
import com.provilac.stepDefination.TestBase;
import com.provilac.utilities.WaitUtil;

public class ModifyPage {

	Keyword keyword = new Keyword();

	public ModifyPage() {
		PageFactory.initElements(TestBase.driver, this);
	}

	@FindBy(xpath = "(//button[text()='Buy Once'])[3]")
	private WebElement buyOnce;

	public void clickonBuyOnces() throws InterruptedException {

		keyword.clickOnWebElement(buyOnce);
	}

	@FindBy(xpath = "(//button[text()='Add item'])[7]")
	private WebElement addItem;

	public void clickOnAddItem() {
		keyword.clickOnWebElement(addItem);
		try {
		keyword.acceptAlert();
		}catch(Exception e) {
			System.out.println("no alert present");
		}
		
		
	}

	@FindBy(xpath = "(//div[@class=\"product_cart_box\"])[1]/descendant::i")
	private WebElement modify;

	public void clickOnModify() {
		modify.click();
	}

	@FindBy(xpath = "//a[@_ngcontent-serverapp-c1921244819]/span")
	private WebElement addAddress;

	public void addAddressInCart() {
		keyword.clickOnWebElement(addAddress);
	}

	@FindBy(xpath = "//textarea[@id=\"address\"]")
	private WebElement textArea;

	public void enterAddressInAddAddress(String add) {
		textArea.sendKeys(add);
	}

	@FindBy(xpath = "//input[@id=\"landmark\"]")
	private WebElement landmark;

	public void enterlandMark(String lMark) {
		landmark.sendKeys(lMark);
	}

	@FindBy(xpath = "(//span[text()='Home'])[2]")
	private WebElement home;

	public void enterHome() {
		keyword.clickOnWebElement(home);
	}

	@FindBy(xpath = "(//label[@for=\"A-139204\"])[3]")
	private WebElement homeLabel;

	public void clickOnHomeLabelButton() {
		keyword.clickOnWebElement(homeLabel);
	}

	@FindBy(xpath = "(//button[@_ngcontent-serverapp-c2781888564])[1]")
	private WebElement close;

	public void clickOnClose() {
		keyword.clickOnWebElement(close);
	}
	
	@FindBy(xpath = "(//button[@_ngcontent-serverapp-c2781888564])[4]")
	private WebElement firstClose;
	
	
	public void closeOn() throws InterruptedException {
		Thread.sleep(2000);
		keyword.clickOnWebElement(firstClose);
	}
}
