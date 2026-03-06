package com.provilac.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provilac.keyword.Keyword;
import com.provilac.stepDefination.TestBase;
import com.provilac.utilities.WaitUtil;

public class ProductPage {

	Keyword keyword = new Keyword();

	public ProductPage() {
		PageFactory.initElements(TestBase.driver, this);
	}

	@FindBy(xpath = "//ul[@class=\"navbar-nav mr-auto\"]/descendant::a[text()='Home']")
	private WebElement home;

	public void clickOnHomeButton() {
		home.click();
	}

	@FindBy(xpath = "//div[@class=\"container nrm-carousel-container\"]/descendant::a")
	private List<WebElement> allproduct;

	public void clickOnProduct(String productName) {
		for (WebElement ele : allproduct) {
			String product = ele.getText();
			if (product.contains(productName)) {
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
			String actual = s.getText();
			if (actual.contains(size)) {
				System.out.println(actual);
				s.click();
				break;
			}

		}
	}

	@FindBy(xpath = "//div[@class=\"buy_btn_container\"]/div/a")
	private WebElement orderButton;

	public void clickOnOrderButton() {
		orderButton.click();
	}

	@FindBy(xpath = "//button[@type=\"button\" and @_ngcontent-serverapp-c3444323425]")
	WebElement popup;

	public void clickOnPopUp() {
		if (popup.isDisplayed()) {
			popup.click();
		}
	}

	@FindBy(xpath = "//button[text()='Buy Once']")
	private WebElement buyOnces;

	public void clickOnBuyOnces() {

	}

	@FindBy(xpath = "//a[text()=\"Products\"]/parent::li[@tabindex=\"0\"]")
	private WebElement product;

	@FindBy(xpath = "//button[@id=\"moe-dontallow_button\"]")
	private WebElement donAllow;
	
	public void clickOnDontAllow() throws InterruptedException {
		//Thread.sleep(1500);
		keyword.clickOnWebElement(donAllow);
	}

	public void clickOnProduct() throws InterruptedException {
		//keyword.acceptAlert();
		
//		TestBase.driver.navigate().refresh();
		product.click();
		
	}

	@FindBy(xpath = "//div[contains(@class,\"input-group search_ic\")]/span/following-sibling::input")
	private WebElement serachBox;

	public void enterProductName(String productName)  {
		serachBox.clear();
		serachBox.sendKeys(productName);
	}

	@FindBy(xpath = "//div[@class=\"product-list-detail-upper-row\"]/a")
	private List<WebElement> gheeProductList;

	public List<String> getAllProductFromList() {
		ArrayList<String> al = new ArrayList<>();
		for (WebElement e : gheeProductList) {
			WaitUtil.elementToBeVisible(e);
			String singleProductName = e.getText();
			System.out.println(singleProductName);
			al.add(singleProductName);
		}
		return al;
	}

	public void getproductNameFromList(String pname) {
		for (WebElement webElement : gheeProductList) {
			String text = webElement.getText();
			if (text.contains(pname)) {
				webElement.click();
			}

		}
	}

	@FindBy(xpath = "//div[@class=\"buy_btn_container\"]/div/a")
	private WebElement add;

	public void clickOnAdd() {
		add.click();
	}

	@FindBy(xpath = "User click on Add Button and Click on Order Now")
	private WebElement addNow;

	public void clickOnAddNow() throws InterruptedException {
		addNow.click();
	}

	@FindBy(xpath = "//a[text()='Curd Culture']")
	private WebElement curdCulture;

	public void clickOnCurdCulture() {
		
		curdCulture.click();
	}

}
