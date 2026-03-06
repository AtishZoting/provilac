package com.provilac.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.provilac.keyword.Keyword;
import com.provilac.stepDefination.TestBase;
import com.provilac.utilities.WaitUtil;

public class CartPage {
	Keyword keyword= new Keyword();
	
	public CartPage() {
		PageFactory.initElements(TestBase.driver, this);
	}

	@FindBy(xpath = "//div[@class=\"cart_box_purchases\"]/descendant::a")
	private WebElement modify;
	
	public void clickOnModify() {
		modify.click();
	}
	
	@FindBy(xpath = "(//button[text()='+'])[7]")
	private WebElement addQun;
	
	public void addQuantity() throws InterruptedException {
		keyword.clickOnWebElement(addQun);
	}
	
	@FindBy(xpath = "//div[@class=\"crt_desc\"]/p[1]")
	private WebElement productname;
	
	public String getProductname() {
		String name= productname.getText();
		System.out.println("Product Name in Add cart = "+name);
		return name;
	}

	@FindBy(xpath = "//div[@class=\"rate\"]/p/strong")
	private WebElement price;
	
	public String getPrice() {
		String pr= price.getText();
		System.out.println("Product price in Add cart = "+pr);
		return pr;
	}
		//"//a[@href=\"/cart\"]"
	@FindBy(xpath ="(//button[text()='Add item'])[2]" )
	private WebElement addTocart;
	
	public void clickOnAddToCart() throws InterruptedException {
		keyword.clickOnWebElement(addTocart);
	}
	
	@FindBy(xpath = "(//button[text()='Edit item'])[1]")
	private WebElement editItem;
	
	public void clickOnEditItem() throws InterruptedException {
		keyword.clickOnWebElement(editItem);
	}
	
	@FindBy(xpath = "(//button[text()='Subscribe'])[2]")
	private WebElement subscribe;
	
	public void clickOnSubscribe() throws InterruptedException {
		keyword.clickOnWebElement(subscribe);
	}
	
	
	@FindBy(xpath = "(//*[@id=\\\"modalModifier\\\"]/app-add-to-cart/div[1]/button/img)")
	private WebElement close;
	
	public void clickOnClose() throws InterruptedException {
		for (int i = 0; i < 3; i++) {
		    keyword.clickOnWebElement(close);
		    Thread.sleep(500); 
		}
	}
	
	
	@FindBy(xpath = "//div[@id=\"navbarSupportedContent---\"]/following-sibling::ul/descendant::a[@href=\"/cart\"]")
	private WebElement cart;
	
	public void addCart() {
		cart.click();
	}
	
	
	@FindBy(xpath = "//button[text()='Continue Shopping']")
	private WebElement continueShopping;
	
	public void clickOnContinueShopping() throws InterruptedException {
		Thread.sleep(1000);
		continueShopping.click();
	}
	
}
