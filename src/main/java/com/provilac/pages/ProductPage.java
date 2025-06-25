package com.provilac.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.provilac.stepDefination.TestBase;
import com.provilac.utilities.WaitUtil;

public class ProductPage {

	public ProductPage() {
		PageFactory.initElements(TestBase.driver, this);
	}
	
	
	@FindBy(xpath = "//ul[@class=\"navbar-nav mr-auto\"]/descendant::a[text()='Home']")
	private WebElement home;
	
	public void clickOnHomeButton() {
		home.click();
	}
	
	@FindBy(xpath ="//div[@class=\"container nrm-carousel-container\"]/descendant::a")
	private List<WebElement> allproduct;
	
	public void clickOnProduct(String productName) {
		for(WebElement ele:allproduct) {
			String product=ele.getText();
			if(product.contains(productName)) {
				System.out.println(product);	
				ele.click();
				break;
			}
			
			
		}
		
	}
	
	
	@FindBy(xpath = "//div[@class=\"product_detail\"]/div[@class=\"sizes_pouch\"]/a")
	private List<WebElement> allSize;
	
	public void clickOnSize(String size) throws InterruptedException {
		for (WebElement s : allSize) {
			String actual=s.getText();
				if(actual.contains(size)) {
					System.out.println(actual);
					s.click();
					break;
				}
			
		}
	}
	
	@FindBy(xpath = "//div[@class=\"buy_btn_container\"]/div/a")
	private WebElement orderButton;
	
	public void clickOnOrderButton() throws InterruptedException {
		JavascriptExecutor jse= (JavascriptExecutor)TestBase.driver;
		jse.executeScript("window.scrollBy(0,500)");
		orderButton.click();
	}
	
	@FindBy(xpath = "//button[@type=\"button\" and @_ngcontent-serverapp-c3444323425]")
		WebElement popup;
		
	public void clickOnPopUp() {
		if(popup.isDisplayed()) {
			popup.click();
		}
	}
}
