Feature: Customer Onboarding Flow - Provilac

	
  Scenario: Successful profile setup with valid data
    Given User select city Pune
    And User click on Guest
    When User click on the Login button
    Then User should navigate to "Get started"
    And User enter mobile number "9762243379"
    And User enter referral code
    When User click on  Verify Mobile Number With OTP button
    Then User should navigate to "Verify mobile number"
		And User enter OTP as manual
		Then User click on verify OTP button
		When User click on the user icon
		And User Click on My profile enter name name and email then Click On Update
		|name |email_id |
		|Atish|atish.zoting@gmail.com|
		
		Then User Should Navigate to Homepage
		
	
		
 Scenario Outline: Entering an invalid referral code
    Given User select city Pune
    And User click on Guest
    When User click on the Login button
    Then User should navigate to "Get started"
    And User enter mobile number "9762243379"
    And User enters referral code "<referralCode>"
    When User click on  Verify Mobile Number With OTP button
    And User should see a alert InValid Referral Code 
    
    Examples:
		|referralCode|
     |VALID123|
		|123456|
		|Valid@123|
		|ABCDEFG|
    
    @invalidreferalCode
    Scenario: Profile setup without entering name and email
    Given User select city Pune
    When User enter mobile number "9762243379"
    And User click on  Verify Mobile Number With OTP button
    And User enter OTP as manual
    Then User click on verify OTP button
    And User leaves name and email blank
    And User submits the profile
    Then User should see error messages for name " Please enter the full name. " and email " Please enter the email id. "
    