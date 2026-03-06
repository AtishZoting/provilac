package com.provilac.stepDefination;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.testng.Assert;

import com.provilac.pages.CartPage;
import com.provilac.pages.HomePage;
import com.provilac.pages.ModifyPage;
import com.provilac.pages.OtpPage;
import com.provilac.pages.ProductPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCaseStepDefination {
	HomePage hp = new HomePage();
	OtpPage ot = new OtpPage();
	ProductPage prod = new ProductPage();
	ModifyPage mod= new ModifyPage();
	CartPage cpage= new CartPage();

	@Given("User select city Pune")
	public void user_select_city_Pune() throws InterruptedException {
		Thread.sleep(2000);
		hp.clickOnDropDownPune();

		hp.clickOnPune();
	}

	@Given("User click on Guest")
	public void user_click_on_guest() {
		hp.clickOnGuestDropDown();
	}

	@When("User click on the Login button")
	public void user_click_on_the_login_button() {
		hp.clickOnLogin();
	}

	@Then("User should navigate to {string}")
	public void user_should_navigate_to(String expectedResult) throws InterruptedException {
//		Thread.sleep(2000);
//		String actualResult = ot.getTextGetStarted();
//		assertEquals(actualResult, expectedResult);
	}

	@Then("User enter mobile number {string}")
	public void user_enter_mobile_number(String mobnumber) throws InterruptedException {
		Thread.sleep(2000);
		// ot.signIn();

		ot.enterMobileNumber(mobnumber);
	}

	@Then("User enter referral code")
	public void user_enter_referral_code() {
	}

	@When("User click on  Verify Mobile Number With OTP button")
	public void user_click_on_verify_mobile_number_with_otp_button() {
		ot.clickOnVerifyMobile();
	}

	@And("User enter OTP as manual")
	public void user_enter_otp_as_manual() {
		ot.enterOtp();

	}

	@Then("User click on verify OTP button")
	public void user_click_on_verify_OTP_button() {
		ot.clickOnVerifyOTG();
	}

	@Then("User enters referral code {string}")
	public void user_enters_referral_code(String refCode) {
		ot.enterReferralCode(refCode);
	}

	@Then("User should see a alert InValid Referral Code")
	public void user_should_see_a_alert_in_valid_referral_code() throws InterruptedException {
		Thread.sleep(2000);
		Alert alert = TestBase.driver.switchTo().alert();
		alert.accept();

	}

	@When("User click on the user icon")
	public void user_click_on_the_user_icon() {
		hp.clickOnUserIcon();
	}

	@When("User Click on My profile enter name name and email then Click On Update")
	public void user_enter_name_name_and_email_then_click_on_update(DataTable dataTable) {
		hp.clickOnMyProfile();

		List<Map<String, String>> credentialsList = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> credentials : credentialsList) {
			String name = credentials.get("name");
			String email = credentials.get("email_id");
			hp.enterName(name);
			hp.enterEmailId(email);
			hp.clickOnUpdate();
		}

	}

	@Then("User Should Navigate to Homepage")
	public void user_should_navigate_to_homepage() {
		String title = TestBase.driver.getTitle();
		Assert.assertTrue(title.contains("Provilac"));
	}

	@When("User selects city mumbai")
	public void user_selects_city_mumbai() {
		hp.clickOnMumbai();
	}

	@Then("User leaves name and email blank")
	public void user_leaves_name_and_email_blank() {
		hp.enterName(null);
		hp.enterEmailId(null);
	}

	@Then("User submits the profile")
	public void user_submits_the_profile() {
		hp.clickOnUpdate();
	}

	@Then("User should see error messages for name {string} and email {string}")
	public void user_should_see_error_messages_for_name_and_email(String expectedNameMsg, String expectedMailMsg) {
		String actual = hp.getNameMessage();
		Assert.assertEquals(actual, expectedMailMsg);

		String actualmail = hp.getMailIdMessage();
		Assert.assertEquals(actualmail, expectedMailMsg);
	}

	@Then("User Click on My profile enter name {string} and email {string} then Click On Update")
	public void user_click_on_my_profile_enter_name_and_email_then_click_on_update(String name, String emailId)
			throws InterruptedException {
		Thread.sleep(2000);
		hp.enterName(name);
		hp.enterEmailId(emailId);
		hp.clickOnUpdate();

	}

	@When("User clicks on a {string} from the product list")
	public void user_clicks_on_a_from_the_product_list(String productName) {
		prod.clickOnProduct(productName);

	}

	@Then("User Click on Home Button")
	public void userClickonHomeButton() {
		prod.clickOnHomeButton();
	}

	@When("User Select Size as {string}")
	public void user_select_size_as(String size) throws InterruptedException {
		prod.clickOnSize(size);
	}

	@When("User Click on Order Now button")
	public void user_click_on_order_now_button() throws InterruptedException {
		prod.clickOnOrderButton();
	}

	@Given("User click on Buy Onces")
	public void user_click_on_buy_onces() throws InterruptedException {
		Thread.sleep(4000);
		prod.clickOnPopUp();
		
		mod.clickonBuyOnces();
	}

	@Then("User Click on Add ItemButton")
	public void user_click_on_add_item_button() throws InterruptedException {
		mod.clickOnAddItem();
		Thread.sleep(2000);
		mod.closeOn();
		mod.closeOn();
		mod.closeOn();
		mod.clickOnClose();
	}

	@Then("User modifies quantity of product in cart to two and Click on Edit item")
	public void user_modifies_quantity_of_product_in_cart_to_two_and_click_on_edit_item() throws InterruptedException {
		
		cpage.clickOnAddToCart();
		Thread.sleep(2000);
		cpage.clickOnModify();
		cpage.addQuantity();
		cpage.clickOnEditItem();
		
	}

	@Then("Product name and price in cart should match the selected product")
	public void product_name_and_price_in_cart_should_match_the_selected_product() {
		cpage.getProductname();
		cpage.getPrice();
	}
	
	@Then("User Enter Name {string} and Email id {string} and click on update")
	public void user_enter_name_and_email_id_and_click_on_update(String username, String useremailId) throws InterruptedException {
		Thread.sleep(2000);
		hp.enterName(username);
		hp.enterEmailId(useremailId);
		hp.clickOnUpdate();
	}
	
	
	@Then("User Add Address {string} Landmark is {string}")
	public void user_add_address_landmark_is(String address, String landMark) throws InterruptedException {
		mod.addAddressInCart();
		mod.enterAddressInAddAddress(address);
		mod.enterlandMark(landMark);
	
	}
	@Then("User Select tag Home and save")
	public void user_select_tag_home_and_save() throws InterruptedException {
		mod.clickOnHomeLabelButton();
	}

	@Then("User Click on ProductButton")
	public void user_click_on_product_button() throws InterruptedException {
		prod.clickOnProduct();
	}

	@When("User enter product as name of {string}")
	public void user_enter_product_as_name_of(String productNAme) throws InterruptedException {
		Thread.sleep(2000);
		prod.enterProductName(productNAme);

	}

	@When("User Get all products related to ghee")
	public void user_get_all_products_related_to_ghee() throws InterruptedException {
		Thread.sleep(2000);
		prod.getAllProductFromList();
	}
	
	@When("User Click On {string} ane enter quantity 500ml")
	public void user_click_on_ane_enter_quantity_500ml(String string) {
		prod.getproductNameFromList(string);
		
	}
	@Then("User click on Add Button and Click on Order Now")
	public void user_click_on_add_button() throws InterruptedException {
		prod.clickOnAdd();
		prod.clickOnAddNow();
	}

}

