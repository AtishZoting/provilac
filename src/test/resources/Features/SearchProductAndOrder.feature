

	
    Scenario: User serach a product and places an order successfully
    Given User select city Pune
		Then User Click on Home ProductButton
		When User enter product as name of "ghee"
		And User Get all products related to ghee
		And User Click On "Buffalo Ghee" ane enter quantity 500ml
		Then User click on Add Button and Click on Order Now