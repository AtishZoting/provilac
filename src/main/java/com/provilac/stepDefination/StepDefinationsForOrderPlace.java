package com.provilac.stepDefination;

import static org.testng.Assert.assertEquals;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.provilac.keyword.Keyword;
import com.provilac.pages.CartPage;
import com.provilac.pages.HomePage;
import com.provilac.pages.ModifyPage;
import com.provilac.pages.OderPlacepage;
import com.provilac.pages.OtpPage;
import com.provilac.pages.ProductPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationsForOrderPlace {
	Keyword keyword= new Keyword();
	HomePage hp= new HomePage();
	OtpPage ot= new OtpPage();
	ProductPage pp= new ProductPage();
	ModifyPage mp= new ModifyPage();
	OderPlacepage op=new OderPlacepage();
	CartPage cp= new CartPage();
	
	@Given("the user selects the city as {string}")
	public void the_user_selects_the_city_as(String cityName) throws InterruptedException {
		hp.clickOnDropDownPune();
	}
	@Given("click on Guest")
	public void click_on_Guest(){
		hp.clickOnGuestDropDown();
	
	}
	@Given("click on login")
	public void click_on_login() throws InterruptedException{
		hp.clickOnLogin();
		ot.signIn();	
		
	}
	
	@Given("enters the mobile number {string}")
	public void signs_in_with_valid_credentials(String mobileNumber) throws InterruptedException{
		ot.enterMobileNumber(mobileNumber);
		ot.clickOnVerifyMobile();
	
	}
	@Given("enters the received OTP")
	public void enters_the_received_OTP(){
		ot.enterOtp();
	}
	
	@Given("clicks on verify OTP user should Navigate to Home Page")
	public void clicks_On_Verify_OTP_User_Should_Navigate_to_Home_Page() throws InterruptedException {

		ot.clickOnVerifyOTG();
		
		Assert.assertEquals(hp.hom(), "Home");
		
		
	}
	
	
	@Given("clicks on the Product")
	public void clicks_On_The_Product() throws InterruptedException {
		pp.clickOnProduct();
	
	}
	@When("the user searches for {string}")
	public void the_user_searches_for(String product) throws InterruptedException {
		pp.enterProductName(product);
	}
	@When("adds Curd Culture to the cart")
	public void adds_to_the_cart() throws InterruptedException {
		//Thread.sleep(500);
		pp.clickOnCurdCulture();
		pp.clickOnOrderButton();
	}
	
	@And("click on SubScribe then click on Add Item")
	public void click_On_Then_Click_On_Add_Item() throws InterruptedException {
		
	//	Thread.sleep(500);
//		WebElement sub= TestBase.driver.findElement(By.xpath("(//button[text()='Subscribe'])[2]"));
//		Thread.sleep(500);	
//		keyword.clickOnWebElement(sub);
		
		keyword.clickOnWebElement(TestBase.driver.findElement(By.xpath("//button[text()='Buy Once']")));
		
	//	Thread.sleep(500);
		WebElement add=TestBase.driver.findElement(By.xpath("(//button[text()='Add item'])[2]"));
	//	Thread.sleep(500);
		keyword.clickOnWebElement(add);
	//	Thread.sleep(500);
		try {
			WebDriverWait wait= new WebDriverWait(TestBase.driver, Duration.ofMinutes(1));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());

            String alertText = alert.getText();
            System.out.println("Alert Text: " + alertText);
            alert.accept(); 
            System.out.println("Alert accepted");

        } catch (Exception e) {
            System.out.println("No alert present");
        }
		//(//img[@src="assets/images/cross-icon.svg"])[2]/parent::button
		
		//keyword.acceptAlert();
		WebElement ele=	TestBase.driver.findElement(By.xpath("(//img[@src=\"assets/images/cross-icon.svg\"])[2]"));
		for (int i = 0; i < 3; i++) {
				//Thread.sleep(500);
			    keyword.clickOnWebElement(ele);
			    
			}
		
	//	Thread.sleep(500);
	//	keyword.clickOnWebElement(TestBase.driver.findElement(By.xpath("(//button[text()='Add item'])[2]")));
			
//		keyword.scrollPage();
//		
		//WebElement el= TestBase.driver.findElement(By.xpath("(//button[text()='Add item'])[2]"));
		//Thread.sleep(500);	
		//keyword.clickOnWebElement(ele);
		
	
//		WebElement buy=TestBase.driver.findElement(By.xpath("//button[text()='Buy Once']"));
//		Thread.sleep(500);
//		keyword.clickOnWebElement(buy);
//		keyword.scrollPage();
//		WebElement ad= TestBase.driver.findElement(By.xpath("(//button[text()='Add item'])[1]"));
//		Thread.sleep(500);
//		keyword.clickOnWebElement(ad);
		
		//mp.clickOnAddItem();
	
	}
	
	
	@Then("click on SubScribeOrder then click on Add Item")
	public void clickonsubesthenclickonAddItem() throws InterruptedException {
		
		WebElement sub= TestBase.driver.findElement(By.xpath("(//button[text()='Subscribe'])[2]"));
		keyword.clickOnWebElement(sub);
		
		WebElement ad=TestBase.driver.findElement(By.xpath("(//button[text()='Add item'])[2]"));
		keyword.clickOnWebElement(ad);
		try {
			WebDriverWait wait= new WebDriverWait(TestBase.driver, Duration.ofMinutes(1));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());

            String alertText = alert.getText();
            System.out.println("Alert Text: " + alertText);
            alert.accept(); 
            System.out.println("Alert accepted");

        } catch (Exception e) {
            System.out.println("No alert present");
        }
		
		for(int i=0;i<3;i++) {
		keyword.clickOnWebElement(TestBase.driver.findElement(By.xpath("(//button[@aria-label=\"Close\"])[2]")));
		}
		
		
	//	WebElement ele=	TestBase.driver.findElement(By.xpath("(//button[@aria-label=\"Close\"])[2]"));
		/*for (int i = 0; i < 4; i++) {
			    keyword.clickOnWebElement(TestBase.driver.findElement(By.xpath("(//button[@aria-label=\"Close\"])[2]")));
			    Thread.sleep(500);
			    
			}*/
		
		
		/*
		Thread.sleep(500);
		keyword.clickOnWebElement(TestBase.driver.findElement(By.xpath("//button[text()='Buy Once']")));
		Thread.sleep(2000);
		keyword.clickOnWebElement(TestBase.driver.findElement(By.xpath("(//button[text()='Add item'])[8]")));
		Thread.sleep(1000);
		*/
	}
	
	
	
	@When("modifies the product in the cart")
	public void modifies_the_product_in_the_cart() throws InterruptedException {
		//TestBase.driver.findElement(By.xpath("//a[@href=\"/cart\"]")).click();
		Thread.sleep(500);
		cp.addCart();
		mp.clickOnModify();
		//mp.addAddressInCart();
		
	}
	@And("enter complete address {string} and landMark {string}")
	public void enter_Complete_Address_AndLlandMark(String address, String landmark){
		mp.enterAddressInAddAddress(address);
		mp.enterlandMark(landmark);
		
	}
	
	@Given("increse the quantity and decrease the quantity of product")
	public void increse_the_quantity_of_product() throws InterruptedException {
		mp.clickOnIncrese();
		mp.clickOnDecrease();
		mp.clickOnEdit();
		
	}
	
	@Then("click on Tag this location and save delivery instruction")
	public void click_On_Tag_This_Location_And_Save_Delivery_Instruction() throws InterruptedException {
		//mp.clickonWork();
		mp.clickOnSaveAndSet();
	}
	
	@Then("click on user and select wallet")
	public void click_On_User_And_Select_Wallet() throws InterruptedException {
		Thread.sleep(1000);
		op.clickOnUser();
		op.clickOnWallet();
	}
	
	
	
	@When("places the order")
	public void places_the_order() {
		//keyword.acceptAlert();
		keyword.scrollPage();
		op.clickOnConfirm();
		System.out.println("Order Placed Sucessfully");
	   
	}
	@Then("the order should be placed successfully take Screenshot")
	public void the_order_should_be_placed_successfully() throws IOException {
	   keyword.captureScreenShot("/src/main/resources/passedTestCasesScreenShots");
	   assertEquals(op.getOrderPlaceMessage(), "Order Placed Successfully");
	}
	
	@Then("enter amount {string} and recharge wallet")
	public void enter_amount_and_recharge_wallet(String amount) throws InterruptedException {
		op.enterAmount(amount);
		op.clickOnRechargeNowButton();

	}
	
	@Then("click on UPI")
	public void click_on_upi() throws InterruptedException {
		op.clickOnUpi();
	}
	
	@Then("Select Google Pay and Enter UPI ID {string}")
	public void select_google_pay_and_enter_upi_id(String upiId) throws InterruptedException {
		op.clickOnGooglePayOption();
		Thread.sleep(500);
		op.enterUpiId(upiId);
		
		
	}
	
	@Then("click on verify and select proceed to payment")
	public void click_on_verify() throws InterruptedException {
		op.clickOnVerify();
		op.clickOnProceed();
		System.out.println("Open Google Pay on your mobile and send the money");
	}
	
	@Then ("go to cart")
	public void go_to_cart	() throws InterruptedException {
		hp.clickOnDontAllowPopup();
		cp.clickOnContinueShopping();
		
		cp.addCart();
	}
	
	
	
	
}
