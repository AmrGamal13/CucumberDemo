Feature: purchase order 
  I want to place an order

  
  Scenario: Buy Items from Sauce demo
    Given User is logged in the application
    When I add my item to the cart
    Then Item is displayed in the cart
    And Getting a successfull message when I place the order

  