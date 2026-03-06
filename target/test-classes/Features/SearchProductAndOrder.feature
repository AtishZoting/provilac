Feature: Placing Order SuccesFully
	
	@45	
  Scenario: User serach a product and places an order successfully 
    Given the user selects the city as "Pune"
    And clicks on the Product
    When the user searches for "curd"
    And adds Curd Culture to the cart
    And enters the mobile number "9762243379"
    And enters the received OTP
    Then clicks on verify OTP user should Navigate to Home Page
    And click on SubScribeOrder then click on Add Item
    And modifies the product in the cart
    And increse the quantity and decrease the quantity of product
    And click on user and select wallet
    And enter amount "1" and recharge wallet
    Then click on UPI 
    And Select Google Pay and Enter UPI ID "atish.zoting-2@okhdfcbank"
    And click on verify and select proceed to payment
    #Open Google Pay on your mobile and send the money
    Then go to cart
    And places the order
    Then the order should be placed successfully take Screenshot
		
		
