Feature: End to end scenarios for placing orders

@Orders @One
Scenario: Verify whether the user is able to place orders
Given I login to the application
When I add a product to bag and check
And I place an order
Then I should see that the order is successfully placed

