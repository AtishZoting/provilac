package com.provilac.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.provilac.keyword.Keyword;
import com.provilac.stepDefination.TestBase;

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
	
	public void addQuantity() {
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
	
	@FindBy(xpath = "//a[@href=\"/cart\"]")
	private WebElement addTocart;
	
	public void clickOnAddToCart() {
		addTocart.click();
	}
	
	@FindBy(xpath = "(//button[text()='Edit item'])[1]")
	private WebElement editItem;
	
	public void clickOnEditItem() {
		keyword.clickOnWebElement(editItem);
	}
}
