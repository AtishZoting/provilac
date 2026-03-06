package com.provilac.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.provilac.keyword.Keyword;
import com.provilac.stepDefination.TestBase;

public class ModifyPage {

	Keyword keyword = new Keyword();
	

	public ModifyPage() {
		PageFactory.initElements(TestBase.driver, this);
	}

	@FindBy(xpath = "//button[text()='Buy Once']")
	private WebElement buyOnce;

	public void clickonBuyOnces() throws InterruptedException {

		keyword.clickOnWebElement(buyOnce);
	}

	@FindBy(xpath = "(//div[@id=\"Subscribe\" and @class=\"subscribe-individual\"])[1]/descendant::button[text()='Add item']")
	private WebElement addItem;

	public void clickOnAddItem() throws InterruptedException {
		ProductPage pp = new ProductPage();
		//pp.clickOnDontAllow();
		Thread.sleep(2000);
		//keyword.clickOnWebElement(addItem);
//		try {
//		keyword.acceptAlert();
//		}catch(Exception e) {
//			System.out.println("no alert present");
//		}

	}

	@FindBy(xpath = "//div[@class=\"top_tag\"]/descendant::a[@href=\"javascript:;\"]/i")
	private WebElement modify;

	public void clickOnModify() throws InterruptedException {
		Thread.sleep(500);
		modify.click();

	}

	@FindBy(xpath = "(//a[text()=' Add address'])[1]")
	private WebElement addAddress;

	public void addAddressInCart() throws InterruptedException {
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

	@FindBy(xpath = "(//button[@id=\"increase\"])[2]")
	private WebElement increase;

	public void clickOnIncrese() throws InterruptedException {
		keyword.clickOnWebElement(increase);
	}
	
	@FindBy(xpath = "(//button[@id=\"decrease\"])[2]")
	private WebElement decrease;
	
	public void clickOnDecrease() throws InterruptedException {
		keyword.clickOnWebElement(decrease);
	}
	
				// //div[@id=\"BuyOnce\"]/descendant::button[text()='Edit item']
	@FindBy(xpath = "(//div[@class=\"modal-footer\"])[2]/div/button")
	private WebElement edit;
	
	public void clickOnEdit() throws InterruptedException {
		keyword.clickOnWebElement(edit);
	}
	
	@FindBy(xpath = "(//span[text()='Home'])[2]")
	private WebElement home;

	public void enterHome() throws InterruptedException {
		try {
			keyword.clickOnWebElement(home);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FindBy(xpath = "(//label[@for=\"A-139204\"])[3]")
	private WebElement homeLabel;

	public void clickOnHomeLabelButton() throws InterruptedException {
		try {
			keyword.clickOnWebElement(homeLabel);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FindBy(xpath = "(//button[@_ngcontent-serverapp-c2781888564])[1]")
	private WebElement close;

	public void clickOnClose() throws InterruptedException {
		keyword.clickOnWebElement(close);
	}

	@FindBy(xpath = "(//button[@_ngcontent-serverapp-c2781888564])[4]")
	private WebElement firstClose;

	public void closeOn() throws InterruptedException {
		Thread.sleep(2000);
		keyword.clickOnWebElement(firstClose);
	}

	@FindBy(xpath = "//button[contains(text(),'Set Delivery Instructions')]")
	private WebElement saveSet;

	public void clickOnSaveAndSet() throws InterruptedException {
		keyword.clickOnWebElement(saveSet);
	}

	@FindBy(xpath = "//span[text()='Work']")
	private WebElement work;

	public void clickonWork() throws InterruptedException {
		keyword.clickOnWebElement(work);
	}

	@FindBy(xpath = "//a[@href=\"/cart\"]")
	private WebElement cart;
	
	public void clickOnCart() {
		cart.click();
	}
	
}
