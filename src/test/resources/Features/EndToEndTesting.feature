Feature: Place Order Successfully

@t
Scenario: User selects a product and places an order successfully
    Given User select city Pune
   # And User click on Guest
    #When User click on the Login button
    #Then User should navigate to "Get started"
		Then User Click on Home Button
		When User clicks on a "A2 Cow Milk" from the product list
		And User Select Size as "1 Litre Bottle"
		And User Click on Order Now button
		And User enter mobile number "9762243379"
		When User click on  Verify Mobile Number With OTP button
		And User enter OTP as manual
		Then User click on verify OTP button
		#And User Enter Name "Atish4" and Email id "atish3.zoting@gmail.com" and click on update
		And User click on Buy Onces
		#And User Add Address "Vinayak Nagar" Landmark is "pimple nilakh"
		#Then User Select tag Home and save 
		Then User Click on Add ItemButton
		And User modifies quantity of product in cart to two and Click on Edit item
		And Product name and price in cart should match the selected product
		
		
		