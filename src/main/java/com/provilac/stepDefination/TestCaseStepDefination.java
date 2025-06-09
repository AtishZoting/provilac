package com.provilac.stepDefination;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.provilac.pages.HomePage;
import com.provilac.pages.OtpPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCaseStepDefination {
	HomePage hp = new HomePage();
	OtpPage ot = new OtpPage();

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
		ot.signIn();

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

}
